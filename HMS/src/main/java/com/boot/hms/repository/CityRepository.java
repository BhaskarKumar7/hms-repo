package com.boot.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.hms.entity.City;

public interface CityRepository extends JpaRepository<City, Integer> {

}
