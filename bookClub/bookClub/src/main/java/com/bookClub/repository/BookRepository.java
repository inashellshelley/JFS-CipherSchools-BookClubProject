package com.bookClub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookClub.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
