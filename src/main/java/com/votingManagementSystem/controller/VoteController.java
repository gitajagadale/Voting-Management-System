package com.votingManagementSystem.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.votingManagementSystem.entity.VoteEntity;
import com.votingManagementSystem.exception.VoteNotFoundException;
import com.votingManagementSystem.serviceImpl.VoteService;
@RestController
public class VoteController {
	
	@Autowired
	private VoteService voteService;


	@PostMapping("cast-vote")
	public VoteEntity addVoteEntity(@RequestBody VoteEntity voteEntity) {
		return this.voteService.addVote(voteEntity);
	}
	@PutMapping("voteEntity")
	public VoteEntity updatedVoteEntity(@RequestBody VoteEntity voteEntity)
			throws VoteNotFoundException {
		return this.voteService.updateVote(voteEntity);
		
	}
	@GetMapping("vote/{Id}")
	public VoteEntity getVoteEntityById(@PathVariable("Id") Integer Id)
			throws VoteNotFoundException {
		return this.voteService.getVoteById(Id);
	}
	@GetMapping("Result")
	public List<VoteEntity> getAllVotes() {
		return this.voteService.getAllVotes();

	}

	

}
