package com.library;

import com.library.controller.BookAuthorController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookAuthorController controller = (BookAuthorController) context.getBean("bookAuthorController");

		System.out.println("=== Processing Books ===");
		controller.processNewBook("J.R.R. Tolkien", "The Lord of the Rings");
		controller.processNewBook("George Orwell", "1984");
	}
}