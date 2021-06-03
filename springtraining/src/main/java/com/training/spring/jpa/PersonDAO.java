package com.training.spring.jpa;

import org.springframework.data.repository.CrudRepository;

// @Repository
public interface PersonDAO extends CrudRepository<Person, Long> {

}
