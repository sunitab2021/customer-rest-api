package com.rab3tech.service;

import java.util.List;

import com.rab3tech.controller.dto.CustomerDTO;

public interface ICustomerService {

	String save(CustomerDTO customerDTO);

	List<CustomerDTO> findAll();

	void deleteById(int cid);

	//void updateById(int cid);

	CustomerDTO findById(int cid);

	void updateById(CustomerDTO customerDTO);

}
