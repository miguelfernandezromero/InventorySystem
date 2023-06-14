package com.company.inventorysystem.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AssetEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
	@JsonProperty("serialNumber")
	private String serialNumber;
	
	@JsonProperty("description")
	private String description; 
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("buysDate")
	private Date buysDate;
	
	@JsonProperty("buysValue")
	private Double buysValue;

}
