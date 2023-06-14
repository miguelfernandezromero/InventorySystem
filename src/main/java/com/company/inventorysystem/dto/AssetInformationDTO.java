package com.company.inventorysystem.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssetInformationDTO {
	
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
