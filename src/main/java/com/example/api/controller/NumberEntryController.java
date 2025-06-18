package com.example.api.controller;

import com.example.api.model.NumberEntry;
import com.example.api.repository.NumberEntryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/number-entry")
public class NumberEntryController {

	
	 @Autowired
	 private NumberEntryRepository repository;

	 // Endpoint to fetch all number entries
	    @GetMapping("/")
	    public List<NumberEntry> getAllEntries() {
	        return repository.findAll();
	    }
	    
	 // Post a new number entry
	    @PostMapping("/add")
	    public NumberEntry createEntry(@RequestBody NumberEntry entry) {
	        return repository.save(entry);
	    }
	    
	    
	 
}
	 
	 
