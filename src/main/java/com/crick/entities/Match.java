package com.crick.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="crick_matches")
public class Match {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int matchid;
	
	private String teamHeading;
	private String matchNoVenue;
	private String battingTeam;
	private String battingTeamScore;
	private String bowlTeam;
	private String bowlTeamScore;
	private String liveText;
	private String matchlink;
	private String textCompelete;
	
	private MatchStatus status;
	
	private Date date = new Date();

	public Match(int matchid, String teamHeading, String matchNoVenue, String battingTeam, String battingTeamScore,
			String bowlTeam, String bowlTeamScore, String liveText, String matchlink, String textCompelete,
			MatchStatus status, Date date) {
		super();
		this.matchid = matchid;
		this.teamHeading = teamHeading;
		this.matchNoVenue = matchNoVenue;
		this.battingTeam = battingTeam;
		this.battingTeamScore = battingTeamScore;
		this.bowlTeam = bowlTeam;
		this.bowlTeamScore = bowlTeamScore;
		this.liveText = liveText;
		this.matchlink = matchlink;
		this.textCompelete = textCompelete;
		this.status = status;
		this.date = date;
	}

	public Match() {
	}
	
	
	// Set the match status according to text Complete
	public void setMatchStatus(){
		if(textCompelete.isBlank()) {
			this.status=MatchStatus.LIVE;
		}
		else {
			this.status=MatchStatus.COMPLETED;
		}
	}
	

	public int getMatchid() {
		return matchid;
	}

	public void setMatchid(int matchid) {
		this.matchid = matchid;
	}

	public String getTeamHeading() {
		return teamHeading;
	}

	public void setTeamHeading(String teamHeading) {
		this.teamHeading = teamHeading;
	}

	public String getMatchNoVenue() {
		return matchNoVenue;
	}

	public void setMatchNoVenue(String matchNoVenue) {
		this.matchNoVenue = matchNoVenue;
	}

	public String getBattingTeam() {
		return battingTeam;
	}

	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}

	public String getBattingTeamScore() {
		return battingTeamScore;
	}

	public void setBattingTeamScore(String battingTeamScore) {
		this.battingTeamScore = battingTeamScore;
	}

	public String getBowlTeam() {
		return bowlTeam;
	}

	public void setBowlTeam(String bowlTeam) {
		this.bowlTeam = bowlTeam;
	}

	public String getBowlTeamScore() {
		return bowlTeamScore;
	}

	public void setBowlTeamScore(String bowlTeamScore) {
		this.bowlTeamScore = bowlTeamScore;
	}

	public String getLiveText() {
		return liveText;
	}

	public void setLiveText(String liveText) {
		this.liveText = liveText;
	}

	public String getMatchlink() {
		return matchlink;
	}

	public void setMatchlink(String matchlink) {
		this.matchlink = matchlink;
	}

	public String getTextCompelete() {
		return textCompelete;
	}

	public void setTextCompelete(String textCompelete) {
		this.textCompelete = textCompelete;
	}

	public MatchStatus getStatus() {
		return status;
	}

	public void setStatus(MatchStatus status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
