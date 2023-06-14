package com.company.inventorysystem.service;

import com.company.inventorysystem.dto.AssetInformationDTO;

public interface IService {
	
	Object register(AssetInformationDTO dto);
	
	Object update(AssetInformationDTO dto);
	
	Object delete(String id);
	
	Object get(String id);
	
	Object getDepreciation(String id);

}
