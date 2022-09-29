package com.votingManagementSystem.entity;
public class VoteDTO {
	private Integer id;
	private String voterName;
	private String partyName;
	public VoteDTO() {
		super();
	}
	public VoteDTO(Integer id, String voterName, String partyName) {
		super();
		this.id = id;
		this.voterName = voterName;
		this.partyName = partyName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVoterName() {
		return voterName;
	}
	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	

}
