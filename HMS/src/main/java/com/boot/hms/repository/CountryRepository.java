package com.boot.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.hms.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
