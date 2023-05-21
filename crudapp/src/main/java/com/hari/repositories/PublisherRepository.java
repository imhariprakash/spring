package com.hari.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hari.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>
{
}
