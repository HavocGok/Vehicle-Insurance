package com.Springboot.Myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Springboot.Myproject.Entity.Authorites;
import com.Springboot.Myproject.Service.AuthoritiesService;

@RestController
public class AuthoritiesController {
	@Autowired
	private AuthoritiesService as;

	@PostMapping("addAuthor")
	public Authorites addAuthor(@RequestBody Authorites a) {
		return as.addAuthor(a);
	}

	@GetMapping("Authorites/{Id}")
	public Authorites viewAuthor(@PathVariable int Id) {
		return as.viewAuthor(Id);
	}

	@GetMapping("Authors")
	public List<Authorites> viewAllAuthor() {
		return as.viewAllAuthor();
	}

	@PutMapping("updateAuthor")
	public Authorites updateAuthor(@RequestBody Authorites a) {
		return as.updateAuthor(a);
	}

	@DeleteMapping("Auhtorites/{Id}")
	public String deleteAuthor(@PathVariable int Id) {
		return as.deleteAuthor(Id);
	}
}
