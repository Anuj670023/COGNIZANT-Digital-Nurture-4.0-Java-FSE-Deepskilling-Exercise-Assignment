package com.library;

import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApplication.class, args);
	}

	@Bean
	public CommandLineRunner initializeData(BookRepository bookRepository) {
		return args -> {
			if (bookRepository.count() == 0) {
				System.out.println("⚡ Initializing sample book data...");

				Book book1 = new Book();
				book1.setTitle("The Great Gatsby");
				book1.setAuthor("F. Scott Fitzgerald");
				book1.setIsbn("9780743273565");

				Book book2 = new Book();
				book2.setTitle("To Kill a Mockingbird");
				book2.setAuthor("Harper Lee");
				book2.setIsbn("9780061120084");

				Book book3 = new Book();
				book3.setTitle("1984");
				book3.setAuthor("George Orwell");
				book3.setIsbn("9780451524935");

				Book savedBook1 = bookRepository.save(book1);
				Book savedBook2 = bookRepository.save(book2);
				Book savedBook3 = bookRepository.save(book3);

				System.out.println("📚 Added sample books to database:");
				System.out.println("---------------------------------");
				System.out.printf("| ID: %d | Title: %-25s | Author: %-20s | ISBN: %s |%n",
						savedBook1.getId(), savedBook1.getTitle(), savedBook1.getAuthor(), savedBook1.getIsbn());
				System.out.printf("| ID: %d | Title: %-25s | Author: %-20s | ISBN: %s |%n",
						savedBook2.getId(), savedBook2.getTitle(), savedBook2.getAuthor(), savedBook2.getIsbn());
				System.out.printf("| ID: %d | Title: %-25s | Author: %-20s | ISBN: %s |%n",
						savedBook3.getId(), savedBook3.getTitle(), savedBook3.getAuthor(), savedBook3.getIsbn());
				System.out.println("---------------------------------");
				System.out.println("Database initialization complete!");
			} else {
				System.out.println("ℹDatabase already contains data - skipping initialization");
			}
		};
	}
}