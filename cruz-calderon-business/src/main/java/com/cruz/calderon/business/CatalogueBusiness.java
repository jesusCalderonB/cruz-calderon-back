package com.cruz.calderon.business;

import java.util.List;

import org.cruz.calderon.entities.dto.entity.CatalogueDTO;

/**
 * @author jesusc
 * 13 dic. 2019
 *
 */
public interface CatalogueBusiness {

	List<CatalogueDTO> getCatInfo(int catalogue);
	
}
