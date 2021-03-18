package com.commerce.OrderManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commerce.OrderManagement.entity.Customer;
import com.commerce.OrderManagement.service.CustomerService;

@RestController
@RequestMapping("api/v1")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/addCus")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		
		Customer cus = customerService.cusAdd(customer);
	System.out.println("Hello");	
      return  ResponseEntity.ok(cus);
	}
	
	

}
