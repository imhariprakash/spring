package com.hari.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hari.domain.Author;
import com.hari.domain.Book;
import com.hari.domain.Publisher;
import com.hari.repositories.AuthorRepository;
import com.hari.repositories.BookRepository;
import com.hari.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner
{
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;

	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository)
	{
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception
	{
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "123123");
		Publisher publisher = new Publisher("Harper Collins", "123 Main Street", "New York", "NY", "12345");
		eric.addBook(ddd);
		ddd.addAuthor(eric);
		ddd.setPublisher(publisher);
		publisher.addPublishedBook(ddd);
		publisherRepository.save(publisher);
		authorRepository.save(eric);
		bookRepository.save(ddd);

		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Development without EJB", "3939459459");
		rod.addBook(noEJB);
		noEJB.addAuthor(rod);
		noEJB.setPublisher(publisher);
		publisher.addPublishedBook(noEJB);
		authorRepository.save(rod);
		bookRepository.save(noEJB);

		System.out.println("Started in Bootstrap");
		System.out.println("Number of Books: " + bookRepository.count());
		System.out.println("Number of Publishers: " + publisherRepository.count());
		System.out.println("Number of Books: " + bookRepository.count());
	}
}
