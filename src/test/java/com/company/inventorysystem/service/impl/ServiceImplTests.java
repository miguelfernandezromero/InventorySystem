package com.company.inventorysystem.service.impl;

import java.util.Date;
import java.util.Optional;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.inventorysystem.entity.AssetEntity;


import com.company.inventorysystem.repository.AssetRepository;
import com.company.inventorysystem.service.impl.ServiceImpl;

import junit.framework.Assert;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class ServiceImplTests {
	 @InjectMocks
	    private ServiceImpl service;

	    @Mock
	    private AssetRepository repository;

	    @Test
	    public void testRegister() {
	        // Mocking
	        AssetEntity asset = new AssetEntity();
	        Mockito.when(repository.save(Mockito.any(AssetEntity.class))).thenReturn(asset);

	        // Test
	        Object result = service.register(asset);

	        // Assertion
	        Assert.assertEquals(asset, result);
	        Mockito.verify(repository, Mockito.times(1)).save(asset);
	    }

	    @Test
	    public void testUpdate() {
	        // Mocking
	        String id = "1";
	        AssetEntity asset = new AssetEntity();
	        Mockito.when(repository.findById(Mockito.anyLong())).thenReturn(Optional.of(asset));
	        Mockito.when(repository.save(Mockito.any(AssetEntity.class))).thenReturn(asset);

	        // Test
	        Object result = service.update(id, asset);

	        // Assertion
	        Assert.assertEquals(asset, result);
	        Mockito.verify(repository, Mockito.times(1)).findById(Mockito.anyLong());
	        Mockito.verify(repository, Mockito.times(1)).save(asset);
	    }

	    @Test
	    public void testDelete() {
	        // Mocking
	        String id = "1";

	        // Test
	        Object result = service.delete(id);

	        // Assertion
	        Assert.assertEquals("delete", result);
	        Mockito.verify(repository, Mockito.times(1)).deleteById(Mockito.anyLong());
	    }

	    @Test
	    public void testGet() {
	        // Mocking
	        String id = "1";
	        AssetEntity asset = new AssetEntity();
	        Mockito.when(repository.findById(Mockito.anyLong())).thenReturn(Optional.of(asset));

	        // Test
	        Object result = service.get(id);

	        // Assertion
	        Assert.assertEquals(asset, result);
	        Mockito.verify(repository, Mockito.times(1)).findById(Mockito.anyLong());
	    }

	    @Test
	    public void testGetDepreciation() {
	        // Mocking
	        String id = "1";
	        AssetEntity asset = new AssetEntity();
	        asset.setBuysValue(1000.0);
	        asset.setBuysDate(new Date());
	        Mockito.when(repository.findById(Mockito.anyLong())).thenReturn(Optional.of(asset));

	        // Test
	        Object result = service.getDepreciation(id);

	        // Assertion
	        Assert.assertEquals(40.0, result);
	        Mockito.verify(repository, Mockito.times(1)).findById(Mockito.anyLong());
	    }

}
