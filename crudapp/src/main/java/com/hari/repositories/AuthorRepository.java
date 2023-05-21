package com.hari.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hari.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>
{
}
