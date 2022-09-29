package com.votingManagementSystem.serviceImpl;
import java.util.List;
import org.springframework.stereotype.Service;
import com.votingManagementSystem.entity.VoteEntity;
import com.votingManagementSystem.exception.VoteNotFoundException;
@Service
public interface VoteService {
	public VoteEntity addVote(VoteEntity vote);
	public VoteEntity updateVote(VoteEntity vote) throws VoteNotFoundException;
	public String deleteVote(Integer Id) throws VoteNotFoundException;
	public VoteEntity getVoteById(Integer Id) throws VoteNotFoundException;
	public List<VoteEntity> getAllVotes();

}
