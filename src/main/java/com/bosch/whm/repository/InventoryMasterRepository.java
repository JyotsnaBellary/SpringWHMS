package com.bosch.whm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosch.whm.entity.Product;

public interface InventoryMasterRepository extends JpaRepository<Product, Integer>{
	
}
