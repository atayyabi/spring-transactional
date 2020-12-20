package com.tayyabi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tayyabi.demo.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, Long>{

}
