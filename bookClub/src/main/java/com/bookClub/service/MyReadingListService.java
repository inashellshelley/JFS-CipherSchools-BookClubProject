package com.bookClub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookClub.entity.MyReadingList;
import com.bookClub.repository.MyReadsRepository;

@Service
public class MyReadingListService {
	
	@Autowired
	private MyReadsRepository myreads;
	
	public void saveMyReads(MyReadingList book) {
		myreads.save(book);
		
	}
	
	public List<MyReadingList> getAllMyBooks(){
		return myreads.findAll();
	}
	public void deleteById(int id) {
		myreads.deleteById(id);
	}
}
