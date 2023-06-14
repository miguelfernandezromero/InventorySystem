package com.company.inventorysystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.inventorysystem.dto.AssetInformationDTO;
import com.company.inventorysystem.entity.AssetEntity;
import com.company.inventorysystem.repository.AssetRepository;
import com.company.inventorysystem.service.IService;

@Service
public class ServiceImpl implements IService{
	
	@Autowired
	private AssetRepository respository;

	@Override
	public Object register(AssetEntity entity) {
		return respository.save(entity);
	}

	@Override
	public Object update(AssetInformationDTO dto) {
		return null;
	}

	@Override
	public Object delete(String id) {
		return null;
	}

	@Override
	public Object get(String id) {
		return null;
	}

	@Override
	public Object getDepreciation(String id) {
		return null;
	}

}
