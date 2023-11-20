package com.boot.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.hms.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Integer> {

}
