package com.busapp.buss_api.repository;

import com.busapp.buss_api.entity.BusOperator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusOperatorRepository extends JpaRepository<BusOperator, Integer> {
}
