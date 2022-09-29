package com.votingManagementSystem.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
@Entity
public class VoteEntity {
	@Id
	@GeneratedValue
	private Integer id;
	
	@NotNull(message="voterName is mandatory")
	private String voterName;
	
	@NotNull(message="partyName is mandatory")
	private String partyName;

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

	public VoteEntity(Integer id, @NotNull(message = "voterName is mandatory") String voterName,
			@NotNull(message = "partyName is mandatory") String partyName) {
		super();
		this.id = id;
		this.voterName = voterName;
		this.partyName = partyName;
	}

	public VoteEntity() {
		super();
	}

	@Override
	public String toString() {
		return "VoteEntity [id=" + id + ", voterName=" + voterName + ", partyName=" + partyName + "]";
	}
	

}
