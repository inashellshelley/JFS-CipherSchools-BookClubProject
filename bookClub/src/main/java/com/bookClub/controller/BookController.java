package com.bookClub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookClub.entity.Book;
import com.bookClub.entity.MyReadingList;
import com.bookClub.service.BookService;
import com.bookClub.service.MyReadingListService;

@Controller
public class BookController {
	
	@Autowired
	private BookService service;
	
	@Autowired
	private MyReadingListService myReadingService;
	
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/lend_book")
	public String lendBook() {
		return "lendBook";
	}
	
	@GetMapping("/our_good_reads")
	public ModelAndView getAllBook() {
		List<Book> list=service.getAllBook();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("booklist");
		mv.addObject("book",list);
		return mv;
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b) {
		service.save(b);
		return "redirect:/our_good_reads";
	}
	
	@GetMapping("/my_reads")
	public String getMyReads(Model model) {
		List<MyReadingList> list= myReadingService.getAllMyBooks();
		model.addAttribute("book",list);
		return "myReads";
	}
	
	@RequestMapping("/my_reads/{id}")
	public String getMyReads2(@PathVariable("id") int id) {
		Book b=service.getBookById(id);
		MyReadingList mr = new MyReadingList(b.getId(),b.getBook_name(),b.getAuthor_name(),b.getGenre(),b.getBook_owner_name(),b.getBook_link());
		
		myReadingService.saveMyReads(mr);
		return "redirect:/my_reads";
	}
}
