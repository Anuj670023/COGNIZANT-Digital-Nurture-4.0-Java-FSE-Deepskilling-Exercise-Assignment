package com.library;

import com.library.config.AppConfig;
import com.library.controller.BookAuthorController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class LibraryManagementApplication {
	public static void main(String[] args) {
		System.out.println("=== Starting Spring Application Context ===");
		AbstractApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("\n=== Getting Controller Bean ===");
		BookAuthorController controller = context.getBean(BookAuthorController.class);
		System.out.println("Controller instance: " + controller.getClass().getName());

		System.out.println("\n=== Checking for AOP Proxies ===");
		System.out.println("Is controller a proxy? " +
				(controller.getClass().getName().contains("$$EnhancerBySpringCGLIB$$") ? "Yes" : "No"));

		System.out.println("\n=== Processing Books ===");
		controller.processNewBook("J.R.R. Tolkien", "The Lord of the Rings");
		controller.processNewBook("George Orwell", "1984");

		System.out.println("\n=== Simulating WebMVC Endpoint ===");
		simulateWebEndpoint(controller);

		System.out.println("\n=== Closing Context ===");
		context.close();
		System.out.println("Application completed successfully!");
	}

	private static void simulateWebEndpoint(BookAuthorController controller) {
		System.out.println("GET /api/books");
		System.out.println("Processing request through Spring WebMVC infrastructure...");
		controller.processNewBook("Ernest Hemingway", "The Old Man and the Sea");
		System.out.println("Request processed successfully!");
	}
}