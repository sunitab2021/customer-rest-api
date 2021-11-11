package com.rab3tech.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rab3tech.controller.dto.CustomerDTO;
import com.rab3tech.dao.CustomerRepository;
import com.rab3tech.dao.entity.CustomerEntity;

@Service
public class CustomerService implements ICustomerService {
	@Autowired 
	private CustomerRepository customerRepository;
	
	@Override
	public String save(CustomerDTO customerDTO) {
		CustomerEntity customerEntity=new CustomerEntity();
		BeanUtils.copyProperties(customerDTO, customerEntity);
		return "success";
	}
	
	@Override	
	public CustomerDTO findById(int cid){
			CustomerEntity customerEntity=customerRepository.findById(cid).get();
			CustomerDTO customerDTO=new CustomerDTO();
			BeanUtils.copyProperties(customerEntity, customerDTO);
			//customerDTO.setMdate(movieEntity.getYear());
			return customerDTO;
		}
	@Override	
	public void updateById(CustomerDTO customerDTO) {
		CustomerEntity customerEntity=new CustomerEntity();
		BeanUtils.copyProperties(customerDTO, customerEntity);
		customerRepository.save(customerEntity);
	}
	
	@Override
	public List<CustomerDTO>  findAll(){
		List<CustomerDTO> customerDTOs=new ArrayList<>();
		List<CustomerEntity> customerEntities=customerRepository.findAll();
		for(CustomerEntity customerEntity:customerEntities) {
			CustomerDTO customerDTO=new CustomerDTO();
			BeanUtils.copyProperties(customerEntity, customerDTO);
			//movieDTO.setMdate(entity.getYear());
			customerDTOs.add(customerDTO);
		}
	    return customerDTOs;
	}
	
	public void  deleteById(int cid) {
		customerRepository.deleteById(cid);
	}

	

}
