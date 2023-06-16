package com.company.inventorysystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.inventorysystem.entity.AssetEntity;

public interface AssetRepository extends JpaRepository<AssetEntity, Long> {

}
