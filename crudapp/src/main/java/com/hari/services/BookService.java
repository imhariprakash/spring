package com.hari.services;

import com.hari.domain.Book;

public interface BookService
{
	public Iterable<Book> findAll();
}
