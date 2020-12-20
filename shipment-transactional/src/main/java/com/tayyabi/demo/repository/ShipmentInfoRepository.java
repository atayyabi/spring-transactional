package com.tayyabi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tayyabi.demo.entity.ShipmentInfo;

public interface ShipmentInfoRepository extends JpaRepository<ShipmentInfo, Long> {

}
