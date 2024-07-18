package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Retailer;
import com.service.RetailerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/retailer")
public class RetailerController {
	@Autowired
	RetailerService rs;
	
	@PostMapping("/addretailer")
	public void addRetailer(@RequestBody Retailer r) {
		rs.saveRetailer(r);
	}
	
	@GetMapping("/getallretailer")
	public List<Retailer> getAllRetailer() {
		return rs.getAllRetailer();
	}
	
	@GetMapping("/getretailer/{id}")	
	public Retailer getRetailer(@PathVariable int id) {
		return rs.getRetailer(id);
	}
	
	@DeleteMapping("/deleteretailer/{id}")
	public Retailer deleteRetailer(@PathVariable int id) {
		return rs.deleteRetailer(id);
	}
	
	@PutMapping("updateretailer/{id}")
	public Retailer updateRetailer(@PathVariable int id, @RequestBody Retailer r) {
		return rs.updateRetailer(r, id);
	}
	
}
