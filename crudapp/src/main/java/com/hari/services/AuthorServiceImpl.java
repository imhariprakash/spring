package com.hari.services;

import com.hari.domain.Author;
import com.hari.repositories.AuthorRepository;

public class AuthorServiceImpl implements AuthorService
{
	private final AuthorRepository authorRepository;

	public AuthorServiceImpl(AuthorRepository authorRepository)
	{
		this.authorRepository = authorRepository;
	}

	@Override
	public Iterable<Author> findAll()
	{
		return authorRepository.findAll();
	}
}
