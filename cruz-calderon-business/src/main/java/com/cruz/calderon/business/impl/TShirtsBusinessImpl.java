package com.cruz.calderon.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cruz.calderon.business.TShirtsBusiness;
import com.cruz.calderon.data.entity.CatCategoriaEntity;
import com.cruz.calderon.data.repository.ICatCategoriaRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author jesusc
 * 27 nov. 2019
 *
 */
@Slf4j
@Component
public class TShirtsBusinessImpl implements TShirtsBusiness {
	
	@Autowired
	private ICatCategoriaRepository iCatCategoryRepository;
	
	@Override
	public List<CatCategoriaEntity> getAllTShirts() {
		return iCatCategoryRepository.findAll();
	}

}
