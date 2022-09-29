package com.votingManagementSystem.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.votingManagementSystem.entity.PartyEntity;
import com.votingManagementSystem.exception.PartyNotFoundException;
import com.votingManagementSystem.serviceImpl.PartyService;

@RestController
@CrossOrigin(value = "http://localhost:4200/")
public class PartyController {

	@Autowired
	private PartyService partyServices;
	
	@GetMapping("/party")
	public List<PartyEntity> getAllParty() {
		return partyServices.getAllParty();
	}
	
	@GetMapping("party/{id}")
	public Optional<PartyEntity> getPartyById(@PathVariable int id) throws PartyNotFoundException {
		return partyServices.getParty(id);
	}
	
	@PostMapping("party")
	public PartyEntity addParty(@Valid @RequestBody PartyEntity partyEntity) {
		return partyServices.addParty(partyEntity);
	}
	
	@PutMapping("party/{id}")
	public PartyEntity updateParty(@PathVariable int id,@Valid @RequestBody PartyEntity partyEntity) throws PartyNotFoundException {
		return partyServices.updateParty(id, partyEntity);
	}
	
	@DeleteMapping("party/{id}")
	public Optional<PartyEntity> deleteParty(@PathVariable int id) throws PartyNotFoundException {
		return partyServices.deleteParty(id);
	}


	
}
