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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.inventorysystem.entity.AssetEntity;
import com.company.inventorysystem.service.IService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController
@RequestMapping("/api")
@Tag(name = "Assets", description = "Operations related to assets")
public class Controller {

	@Autowired
	IService service;

	@Operation(summary = "Create asset", tags = "Assets")
	@ApiResponse(responseCode = "200", description = "Asset created", 
	content = @Content(schema = @Schema(implementation = AssetEntity.class)))
	@PostMapping(value = "/asset")
	public ResponseEntity<Object> register(@RequestBody AssetEntity assetInformation, BindingResult result) {
		return new ResponseEntity<>(service.register(assetInformation), HttpStatus.CREATED);
	}

	@Operation(summary = "Update asset", tags = "Assets")
	@ApiResponse(responseCode = "200", description = "Asset update", 
	content = @Content(schema = @Schema(implementation = AssetEntity.class)))
	@PutMapping(value = "/asset/{id}")
	public ResponseEntity<Object> update(@PathVariable("id") String id, @RequestBody AssetEntity assetInformation,
			BindingResult result) {
		return new ResponseEntity<>(service.update(id, assetInformation), HttpStatus.OK);
	}

	@Operation(summary = "Delete asset", tags = "Assets")
	@ApiResponse(responseCode = "200", description = "Asset delete", 
	content = @Content(schema = @Schema(implementation = AssetEntity.class)))
	@DeleteMapping(value = "/asset/{id}")
	public ResponseEntity<Object> delete(@PathVariable("id") String id) {
		return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
	}

	@Operation(summary = "Get an asset by its ID", tags = "Assets")
	@ApiResponse(responseCode = "200", description = "Asset found", 
	content = @Content(schema = @Schema(implementation = AssetEntity.class)))

	@GetMapping(value = "/asset/{id}")
	public ResponseEntity<Object> get(@PathVariable("id") String id) {
		return new ResponseEntity<>(service.get(id), HttpStatus.OK);
	}

	@Operation(summary = "Get depreciation an asset by its ID", tags = "Assets")
	@ApiResponse(responseCode = "200", description = "Asset created", 
	content = @Content(schema = @Schema(implementation = AssetEntity.class)))
	@GetMapping(value = "/asset/{id}/depreciation")
	public ResponseEntity<Object> getDepreciation(@PathVariable("id") String id) {
		return new ResponseEntity<>(service.getDepreciation(id), HttpStatus.OK);
	}

}
