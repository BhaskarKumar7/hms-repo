package com.boot.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.hms.entity.RoomNoGenerator;

public interface RoomNoGeneratorRepository extends JpaRepository<RoomNoGenerator, Integer> {

}
