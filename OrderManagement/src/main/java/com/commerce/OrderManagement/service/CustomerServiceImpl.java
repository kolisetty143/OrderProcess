package com.commerce.OrderManagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commerce.OrderManagement.entity.Customer;
import com.commerce.OrderManagement.repository.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	public CustomerRepository customerRepo;
	
	@Override
	public  Customer cusAdd(Customer customer) {
		
		return customerRepo.save(customer);
	}

	@Override
	public Optional cusEdit(Integer cId) {
		customerRepo.findById(cId);
		return null;
	}

	@Override
	public Optional cusDel(Integer cId) {
		customerRepo.deleteById(cId);
		return null;
	}
	
	

}
