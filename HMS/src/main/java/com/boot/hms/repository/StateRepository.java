package com.boot.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.hms.entity.State;

public interface StateRepository extends JpaRepository<State,Integer> {
	List<State> findByCountryCountryId(Integer id);
}
