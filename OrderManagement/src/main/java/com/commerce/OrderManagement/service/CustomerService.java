package com.commerce.OrderManagement.service;

import java.security.cert.PKIXRevocationChecker.Option;

import org.springframework.stereotype.Service;

import com.commerce.OrderManagement.entity.Customer;
import java.util.Optional;
@Service
public interface CustomerService {
	
	 Customer cusAdd(Customer customer);
	 Optional cusEdit(Integer cId);
	 Optional cusDel(Integer cId);
	 
	 
	
	
	
}
