package com.company.inventorysystem.service;

import com.company.inventorysystem.entity.AssetEntity;

public interface IService {

	Object register(AssetEntity dto);

	Object update(String id, AssetEntity Long);

	Object delete(String id);

	Object get(String id);

	Object getDepreciation(String id);

}
