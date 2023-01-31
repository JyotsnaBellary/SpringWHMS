package com.bosch.whm.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

import com.bosch.whm.entity.Product;
import com.bosch.whm.service.InventoryMasterService;

@RestController
public class WareHouseController {

	@Autowired
	InventoryMasterService inventoryMasterService;
	//post--http://localhost:8089/products/
	@RequestMapping(value = "/products/",method = RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		return inventoryMasterService.createProductService(product);
	}

	//DELETE--http://localhost:8089/delete/{id}
	@DeleteMapping("delete/{id}")
    public String deleteProduct(@PathVariable int id){
		inventoryMasterService.deleteProductService(id);
        return "Deleted Successfully";
    }
	
	//GET--http://localhost:8089/getAllProducts
	@GetMapping("/getAllProducts")
    public List<Product> getProducts() {
        return inventoryMasterService.getProductsService();
    }
	
	
	
	
}
