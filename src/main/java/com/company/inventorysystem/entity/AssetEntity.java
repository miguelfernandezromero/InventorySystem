package com.company.inventorysystem.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
