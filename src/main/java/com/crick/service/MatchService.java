package com.crick.service;

import java.util.List;
import java.util.Map;

import com.crick.entities.Match;

public interface MatchService {

	// get All Matches 
	List<Match> getAllMatches();
	
	// get Live Matches
	List<Match> getLiveMatches();
	
	// Cricket cwc 2023  Point table
	List<Map<String,String>>  getPointTable();
	
}
