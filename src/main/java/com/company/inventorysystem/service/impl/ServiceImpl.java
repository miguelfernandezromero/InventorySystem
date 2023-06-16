package com.company.inventorysystem.service.impl;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.inventorysystem.entity.AssetEntity;
import com.company.inventorysystem.repository.AssetRepository;
import com.company.inventorysystem.service.IService;

@Service
public class ServiceImpl implements IService {

	@Autowired
	private AssetRepository repository;

	@Override
	public Object register(AssetEntity entity) {
		return repository.save(entity);
	}

	@Override
	public Object update(String id, AssetEntity request) {
		AssetEntity asset = new AssetEntity();
		asset = (repository.findById(Long.parseLong(id))).orElse(null);

		if (asset != null) {
			asset.setSerialNumber(request.getSerialNumber());
			asset.setDescription(request.getDescription());
			asset.setName(request.getName());
			asset.setBuysValue(request.getBuysValue());

			return repository.save(asset);
		}
		return "not found";
	}

	@Override
	public Object delete(String id) {
		repository.deleteById(Long.parseLong(id));
		return "delete";
	}

	@Override
	public Object get(String id) {
		return repository.findById(Long.parseLong(id));
	}

	@Override
	public Object getDepreciation(String id) {
		AssetEntity asset = (repository.findById(Long.parseLong(id))).orElse(null);
		if (asset != null) {
			double percentageDepreciation = 0.04;
			double accumulatedDepreciation = asset.getBuysValue() * percentageDepreciation
					* getElapsedYears(asset.getBuysDate());

			return accumulatedDepreciation;
		}
		return "not found";

	}

	private int getElapsedYears(Date buysDate) {

		Calendar currentDate = Calendar.getInstance();
		Calendar dateBuyCal = Calendar.getInstance();
		dateBuyCal.setTime(buysDate);

		int elapsedYears = currentDate.get(Calendar.YEAR) - dateBuyCal.get(Calendar.YEAR);
		if (currentDate.get(Calendar.MONTH) < dateBuyCal.get(Calendar.MONTH)
				|| (currentDate.get(Calendar.MONTH) == dateBuyCal.get(Calendar.MONTH)
						&& currentDate.get(Calendar.DAY_OF_MONTH) < dateBuyCal.get(Calendar.DAY_OF_MONTH))) {
			elapsedYears--;
		}

		return elapsedYears;
	}

}
