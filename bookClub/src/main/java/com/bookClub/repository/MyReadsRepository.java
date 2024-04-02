package com.bookClub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookClub.entity.MyReadingList;

@Repository
public interface MyReadsRepository extends JpaRepository<MyReadingList, Integer> {

}
