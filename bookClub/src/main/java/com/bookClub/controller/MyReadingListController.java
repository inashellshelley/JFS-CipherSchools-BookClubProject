package com.bookClub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookClub.service.MyReadingListService;

@Controller
public class MyReadingListController {
	
	@Autowired
	private MyReadingListService service;
	
	
	@RequestMapping("/deleteMyReads/{id}")
	public String deleteMyReads(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/my_reads";
	}
}
