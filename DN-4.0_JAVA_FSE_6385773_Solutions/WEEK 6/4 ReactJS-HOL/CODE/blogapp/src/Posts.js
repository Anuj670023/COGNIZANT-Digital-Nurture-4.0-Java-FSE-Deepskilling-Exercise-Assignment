import React from 'react';
import Post from './Post';

class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            error: null
        };
    }

    loadPosts() {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Failed to fetch posts');
                }
                return response.json();
            })
            .then(data => {
                const posts = data.map(post => new Post(
                    post.id,
                    post.title,
                    post.body
                ));
                this.setState({ posts });
            })
            .catch(error => {
                this.setState({ error: error.message });
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        this.setState({ 
            error: `Error: ${error.toString()}\nComponent Stack: ${info.componentStack}`
        });
    }

    render() {
        const { posts, error } = this.state;

        if (error) {
            alert(error);
            return <div>Error loading posts. Please try again later.</div>;
        }

        if (!posts.length) {
            return <div>Loading posts...</div>;
        }

        return (
            <div className="posts-container">
                <h1>Blog Posts</h1>
                {posts.map(post => (
                    <div key={post.id} className="post">
                        <h2>{post.title}</h2>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;