package com.votingManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.votingManagementSystem.entity.ScheduleEntity;

public interface ScheduleRepository  extends JpaRepository<ScheduleEntity, Integer>  {

}
