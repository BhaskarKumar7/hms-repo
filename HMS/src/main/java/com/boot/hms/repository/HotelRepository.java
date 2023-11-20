package com.boot.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.hms.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
