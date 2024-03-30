package com.crick.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.entities.Match;
import com.crick.service.MatchService;
import com.crick.service.MatchServiceImpl;

@RestController
public class MatchController {
	
	@Autowired
	 private MatchService matchService;
//
//	    public MatchController(MatchService matchService) {
//	        this.matchService = matchService;	
//	    }

	    // api for getting live matches

	    @GetMapping("/all")
	    public void getAllMatches() {
	    	System.out.println("Hello Al matches api Working");
	    }
//	    public ResponseEntity<List<Match>> getAllMatchScores(){
//	        System.out.println("getting all match");
//	        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
//	    }
	    
	    @GetMapping("/live")
	    public ResponseEntity<List<Match>> getLiveMatchScores() throws InterruptedException {
	        System.out.println("getting live match");
	        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
	    }
}
