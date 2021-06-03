package com.training.spring.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// @Repository
public interface PersonDAO extends CrudRepository<Person, Long> {

    List<Person> findByName(String name);

    List<Person> findByNameAndSurname(String name,
                                      String surname);

    List<Person> findByNameIn(List<String> names);

    List<Person> findByNameOrderByNameAsc(String name);

    @Query("select p from Person p where p.name=?1")
    List<Person> searchName(String name);

    @Query(value = "select * from person where name=?1", nativeQuery = true)
    List<Person> searchName2(String name);

    @Modifying
    @Query("update Person p set p.name=?2 where p.personId=?1")
    void updateName(Long personId,
                    String name);

}
