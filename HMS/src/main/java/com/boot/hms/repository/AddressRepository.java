package com.boot.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.hms.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
