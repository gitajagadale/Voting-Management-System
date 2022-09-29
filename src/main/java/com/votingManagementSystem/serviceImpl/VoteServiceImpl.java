package com.votingManagementSystem.serviceImpl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.votingManagementSystem.entity.VoteEntity;
import com.votingManagementSystem.exception.VoteNotFoundException;
import com.votingManagementSystem.repository.VoteRepository;
@Service
public class VoteServiceImpl implements VoteService{
	@Autowired
	private VoteRepository voteRepo;
	
	
	@Override
	public VoteEntity addVote(VoteEntity voteEntity) {
		return this.voteRepo.save(voteEntity);
	}

	@Override
	public VoteEntity updateVote(VoteEntity voteEntity) throws VoteNotFoundException {
		Optional<VoteEntity> voteEntityOpt=this.voteRepo.findById(voteEntity.getId());
		if(voteEntityOpt.isEmpty())
			throw new VoteNotFoundException("Vote does not exist to update");
		VoteEntity updateVoteEntity  = voteEntityOpt.get();
		updateVoteEntity.setPartyName(voteEntity.getPartyName());
		return this.voteRepo.save(updateVoteEntity);
		
	}

	@Override
	public String deleteVote(Integer registerId) throws VoteNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VoteEntity getVoteById(Integer Id) throws VoteNotFoundException {
		Optional<VoteEntity> voteEntityOpt=this.voteRepo.findById(Id);
			if(voteEntityOpt.isEmpty())
				throw new VoteNotFoundException("Vote does not Exist");
			return voteEntityOpt.get();
		
	}

	@Override
	public List<VoteEntity> getAllVotes() {
		return this.voteRepo.findAll();
	}
	
	

}
