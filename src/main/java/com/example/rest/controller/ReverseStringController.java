package com.example.rest.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.rest.dao.PalindromeDao;
import com.example.rest.dao.PalindromeString;
import com.example.rest.dao.PalindromeStrings;

@RestController
@RequestMapping("/api")
public class ReverseStringController {
	
	@Autowired
	private PalindromeDao inputStrings;

	@GetMapping(path="/")
	public PalindromeStrings getStrings() {

		return PalindromeDao.getInputStrings();
	}
	
	@PostMapping(path= "/", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> addStrings(@RequestBody PalindromeString inputString){
		Integer id = PalindromeDao.getInputStrings().getTheStrings().size() + 1;    //.getEmployeeList().size() + 1;
		inputString.setId(id);
         
		inputStrings.addInptStrings(inputString);
         
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(inputString.getId())
                                    .toUri();
         
        return ResponseEntity.created(location).build();
	}
}
