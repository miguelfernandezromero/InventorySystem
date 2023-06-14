package com.company.inventorysystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.inventorysystem.dto.AssetInformationDTO;
import com.company.inventorysystem.service.IService;

@RestController
public class controller {
	
	@Autowired
	private IService service;
	
	
	@PostMapping(value = "/asset")
	public ResponseEntity<Object> register(@RequestBody AssetInformationDTO assetInformation, 
			BindingResult result) {		
		return new ResponseEntity<>(service.register(assetInformation), HttpStatus.OK);
	}
	
	@PutMapping(value = "/asset/{id}")
	public ResponseEntity<Object> update(@RequestBody AssetInformationDTO assetInformation, 
			BindingResult result) {		
		return new ResponseEntity<>(service.update(assetInformation), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/asset/{id}")
	public ResponseEntity<Object> delete(@PathVariable("id") String id, BindingResult result) {		
		return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
	}
	
	@GetMapping(value = "/asset/{id}")
	public ResponseEntity<Object> get(@PathVariable("id") String id, BindingResult result) {		
		return new ResponseEntity<>(service.get(id), HttpStatus.OK);
	}
	
	@GetMapping(value = "/asset/{id}/depreciation")
	public ResponseEntity<Object> getDepreciation(@PathVariable("id") String id, BindingResult result) {		
		return new ResponseEntity<>(service.getDepreciation(id), HttpStatus.OK);
	}
	
	


}
