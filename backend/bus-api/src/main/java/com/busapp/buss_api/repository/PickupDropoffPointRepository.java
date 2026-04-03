package com.busapp.buss_api.repository;

import com.busapp.buss_api.entity.PickupDropoffPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PickupDropoffPointRepository extends JpaRepository<PickupDropoffPoint, Integer> {
}
