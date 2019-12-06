package com.cruz.calderon.data.tshirts.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.cruz.calderon.data.tshirts.TShirtsDAO;

/**
 * @author jesusc
 * 5 dic. 2019
 *
 */
@Repository
public class TShrtsDAOImpl implements TShirtsDAO {

	@Override
	public ArrayList<String> getAllTShirts() {
		System.out.println("Method not implemented");
		return null;
	}

}
