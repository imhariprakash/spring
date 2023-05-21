package com.hari.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hari.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>
{
}
