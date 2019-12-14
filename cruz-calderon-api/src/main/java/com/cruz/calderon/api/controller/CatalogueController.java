package com.cruz.calderon.api.controller;

import org.cruz.calderon.entities.dto.base.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cruz.calderon.api.util.ResponseUtil;
import com.cruz.calderon.business.CatalogueBusiness;

import lombok.extern.slf4j.Slf4j;

/**
 * @author jesusc
 * 27 nov. 2019
 *
 */
@Slf4j
@RestController()
@RequestMapping("/catalogue")
public class CatalogueController {
	
	@Autowired
	private ResponseUtil responseUtil;
	
	@Autowired
	private CatalogueBusiness catalogueBusinessImpl;

	@GetMapping
    public ResponseBean getAll(@RequestParam(name = "catId") final Integer catId) {
		ResponseBean response = new ResponseBean();
		try {
			response = responseUtil.successResponse(catalogueBusinessImpl.getCatInfo(catId), "OK");
		} catch (final Exception ex) {
			log.error("Error tyring to get all t-shirts because: ", ex);
			response = responseUtil.businessErrorResponse(ex.getMessage());
		}
		return response;
    }
	
}
