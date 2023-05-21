package com.hari.services;

import org.springframework.stereotype.Service;

import com.hari.domain.Book;
import com.hari.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService
{
	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository)
	{
		this.bookRepository = bookRepository;
	}

	@Override
	public Iterable<Book> findAll()
	{
		return bookRepository.findAll();
	}
}
