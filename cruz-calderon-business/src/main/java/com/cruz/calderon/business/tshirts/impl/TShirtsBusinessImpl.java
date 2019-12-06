package com.cruz.calderon.business.tshirts.impl;

import java.util.ArrayList;

import org.cruz.calderon.entities.dto.base.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cruz.calderon.business.tshirts.TShirtsBusiness;
import com.cruz.calderon.data.tshirts.TShirtsDAO;

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
	private TShirtsDAO tShirtsDAOImpl;
	
	@Override
	public ResponseBean getAllTShirts() {
		ArrayList<String> list = tShirtsDAOImpl.getAllTShirts();
		log.info("List: {}", list);
		return null;
	}

}
