import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);
  const [showCourses, setShowCourses] = useState(true);

  const books = [
    { id: 101, bname: 'Master React', price: 670 },
    { id: 102, bname: 'Deep Dive into Angular 11', price: 800 },
    { id: 103, bname: 'Mongo Essentials', price: 450 }
  ];

  const blogs = [
    { id: 1, title: 'React Learning', author: 'Stephen Biz', content: 'Welcome to learning React!' },
    { id: 2, title: 'Installation', author: 'Schwedzenier', content: 'You can install React from npm.' }
  ];

  const courses = [
    { id: 1, name: 'Angular', date: '4/5/2021' },
    { id: 2, name: 'React', date: '6/3/2021' }
  ];

  return (
    <div>
      <h1 style={{ textAlign: 'center' }}>Blogger App</h1>

      {/* Toggle buttons */}
      <div style={{ textAlign: 'center', marginBottom: '20px' }}>
        <button onClick={() => setShowBooks(!showBooks)}>Toggle Book Details</button>
        <button onClick={() => setShowBlogs(!showBlogs)}>Toggle Blog Details</button>
        <button onClick={() => setShowCourses(!showCourses)}>Toggle Course Details</button>
      </div>

      <div style={{ display: 'flex', justifyContent: 'space-around' }}>
        {showBooks && <BookDetails books={books} />}
        {showBlogs ? <BlogDetails blogs={blogs} /> : <p>No Blogs to show.</p>}
        {showCourses && <CourseDetails courses={courses} />}
      </div>
    </div>
  );
}

export default App;
