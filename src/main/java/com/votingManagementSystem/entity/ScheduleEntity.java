package com.votingManagementSystem.entity;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
@Entity
public class ScheduleEntity {
	@Id
	private Integer id;
	
	@NotNull(message="electionName is mandatory")
	private String electionName;
	
	@NotNull(message="electionDate is mandatory")
	private LocalDate electionDate;

	public ScheduleEntity() {
		super();
	}

	@Override
	public String toString() {
		return "ScheduleEntity [id=" + id + ", electionName=" + electionName + ", electionDate=" + electionDate
				+ "]";
	}

	public ScheduleEntity(Integer userId, @NotNull(message = "electionName is mandatory") String electionName,
			@NotNull(message = "electionDate is mandatory") LocalDate electionDate) {
		super();
		this.id = userId;
		this.electionName = electionName;
		this.electionDate = electionDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getElectionName() {
		return electionName;
	}

	public void setElectionName(String electionName) {
		this.electionName = electionName;
	}

	public LocalDate getElectionDate() {
		return electionDate;
	}

	public void setElectionDate(LocalDate electionDate) {
		this.electionDate = electionDate;
	}


}
