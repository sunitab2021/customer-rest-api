package com.rab3tech.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rab3tech.controller.dto.ApplicationResponseDTO;
import com.rab3tech.controller.dto.CustomerDTO;
import com.rab3tech.service.ICustomerService;

@RestController//because this is supposed to deal with raw data
@RequestMapping("/v3")
public class CustomerRestController {
	
	@Autowired
	private ICustomerService iCustomerService;
	
	
	//Endpoint - /movies
	//METHOD =POST
	@PutMapping("/customers/{cid}")
	public ApplicationResponseDTO updateByCId(@RequestBody CustomerDTO customerDTO){
		 iCustomerService.updateById(customerDTO);
		 ApplicationResponseDTO applicationResponseDTO=new ApplicationResponseDTO();
		 applicationResponseDTO.setCode("1000");
		 applicationResponseDTO.setMessage("Hey! customer data is updated successfully!");
		 return applicationResponseDTO;
	}
	
	//Endpoint - /movies
	//METHOD =POST
	/**
	 * 
	 * @param movieDTO
	 * @return
	 *  @RequestBody - it takes raw data from the in coming request body
	 *  and populate into java object
	 */
	@PostMapping("/customers")
	public ApplicationResponseDTO uploadCustomer(@RequestBody CustomerDTO customerDTO){
		 iCustomerService.save(customerDTO);
		 ApplicationResponseDTO applicationResponseDTO=new ApplicationResponseDTO();
		 applicationResponseDTO.setCode("1000");
		 applicationResponseDTO.setMessage("Hey! customer data is created successfully!");
		 return applicationResponseDTO;
		 
	}
	
	/**
	 * list of movies  - >> as json data
	 * @return
	 */
	@GetMapping("/customers")
	public List<CustomerDTO> findCustomers(){
		return iCustomerService.findAll();
	}
	
	
	//http://localhost:7777/v3/movies/9
	//@PathVariable - it is used to read data into rest api from URI
	//METHOD=DELETE
	
	//POSTMAN Tool or - >> CURL COMMAND
	@DeleteMapping("/customers/{cid}")
	public ApplicationResponseDTO deleteCustomerById(@PathVariable int cid){
		 iCustomerService.deleteById(cid);
		 ApplicationResponseDTO applicationResponseDTO=new ApplicationResponseDTO();
		 applicationResponseDTO.setCode("1000");
		 applicationResponseDTO.setMessage("Hey! customer data is deleted successfully!");
		 return applicationResponseDTO;
	}
	
	
	/**
	 * movie data  - >> as per mid
	 * @return
	 */
	//http://localhost:7777/v3/movies/9
	//@PathVariable - it is used to read data into rest api from URI
	//METHOD=GET
	@GetMapping("/customers/{cid}")
	public CustomerDTO findCustomerById(@PathVariable int cid){
		return iCustomerService.findById(cid);
	}

}
