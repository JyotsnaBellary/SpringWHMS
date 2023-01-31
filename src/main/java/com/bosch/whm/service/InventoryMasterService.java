package com.bosch.whm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bosch.whm.entity.Product;
import com.bosch.whm.repository.InventoryMasterRepository;

@Service
public class InventoryMasterService {

	@Autowired
	InventoryMasterRepository inventoryMasterRepository;
	
	public Product createProductService(Product product) {
		return inventoryMasterRepository.save(product);
	}
	
	public void deleteProductService(int productCode) {
		inventoryMasterRepository.deleteById(productCode);
	}
	public List<Product> getProductsService() {
	       
        return inventoryMasterRepository.findAll();
    }

	
}
