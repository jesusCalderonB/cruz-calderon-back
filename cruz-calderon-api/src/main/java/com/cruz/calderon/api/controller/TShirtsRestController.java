package com.cruz.calderon.api.controller;

import org.cruz.calderon.entities.dto.base.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cruz.calderon.api.util.ResponseUtil;
import com.cruz.calderon.business.tshirts.TShirtsBusiness;

import lombok.extern.slf4j.Slf4j;

/**
 * @author jesusc
 * 27 nov. 2019
 *
 */
@Slf4j
@RestController()
@RequestMapping("/t-shirts")
public class TShirtsRestController {
	
	@Autowired
	private ResponseUtil responseUtil;
	
	@Autowired
	private TShirtsBusiness tShirtsBusinessImpl;

	@GetMapping
    public ResponseBean getAll() {
		ResponseBean response = new ResponseBean();
		try {
			response = tShirtsBusinessImpl.getAllTShirts();
		} catch (final Exception ex) {
			log.error("Error tyring to get all t-shirts because: ", ex);
			response = responseUtil.businessErrorResponse(ex.getMessage());
		}
		return response;
    }
	
}
