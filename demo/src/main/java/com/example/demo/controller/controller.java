package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;
import com.example.demo.repository.Repository;
@CrossOrigin(origins ="http://localhost:4200",allowedHeaders="*")
@RestController
@RequestMapping("/api/v1")
public class controller {









	@Autowired
	private Repository taskrepo;

	//get all data
	@GetMapping("/admindetails")
	public List<Model> getAllAdmin(){
		return taskrepo.findAll();
	}
//get data by id
	@GetMapping("/getadminbyid/{id}")
	public Optional<Model> getAdminById(@PathVariable int id) {
		return taskrepo.findById(id);
	}
	
	@PostMapping("/addtask")
	public Model addAdmin(@RequestBody Model lap) {
		return taskrepo.save(lap);
	}
	
	@PutMapping("edittask")
	public Model updateAdmin(@RequestBody Model lap) {
		return taskrepo.save(lap);
	}
	
	@DeleteMapping("deletetask")
	public String deleteAllAdmin() {
		String result = "";
		try {	
			taskrepo.deleteAll();
			result = "all records deleted";
		}
		catch(Exception e) {
			result = "error occurred";
		}
		
		return result;
	}
	
	@DeleteMapping("deleteadmin/{id}")
	public String deleteAdminById(@PathVariable int id) {
		String result = "";
		try {	
			taskrepo.deleteById(id);
			result = "Admin record deleted";
		}
		catch(Exception e) {
			result = "error occurred";
		}
		
		return result;
	}

}
