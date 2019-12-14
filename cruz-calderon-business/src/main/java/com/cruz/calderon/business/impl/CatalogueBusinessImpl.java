package com.cruz.calderon.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.cruz.calderon.entities.dto.entity.CatalogueDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cruz.calderon.business.CatalogueBusiness;
import com.cruz.calderon.data.repository.ICatCategoriaRepository;
import com.cruz.calderon.data.repository.ICatColorRepository;
import com.cruz.calderon.data.repository.ICatRolRepository;
import com.cruz.calderon.data.repository.ICatStatusVentaRepository;
import com.cruz.calderon.data.repository.ICatTallaRepository;
import com.cruz.calderon.data.repository.ICatTipoPagoRepository;
import com.cruz.calderon.data.repository.ICatTipoRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author jesusc 13 dic. 2019
 *
 */
@Slf4j
@Component
public class CatalogueBusinessImpl implements CatalogueBusiness {

	@Autowired
	private ICatTipoRepository iCatTipoRepository;

	@Autowired
	private ICatCategoriaRepository iCatCategoriaRepository;;

	@Autowired
	private ICatColorRepository iCatColorRepository;

	@Autowired
	private ICatTallaRepository iCatTallaRepository;

	@Autowired
	private ICatTipoPagoRepository iCatTipoPagoRepository;

	@Autowired
	private ICatStatusVentaRepository iCatStatusVentaRepository;

	@Autowired
	private ICatRolRepository iCatRolRepository;
	
	private static final int CATALOG_TIPO = 1;
	private static final int CATALOG_CATEGORIA = 2;
	private static final int CATALOG_COLOR = 3;
	private static final int CATALOG_TALLA = 4;
	private static final int CATALOG_TIPO_PAGO = 5;
	private static final int CATALOG_STATUS_VENTA = 6;
	private static final int CATALOG_STATUS_ROL = 7;

	@Override
	public List<CatalogueDTO> getCatInfo(int catalogue) {
		log.info("cat: "+catalogue);
		List<CatalogueDTO> listCatDTO = new ArrayList<>();
		switch (catalogue) {
		case CATALOG_TIPO:
			iCatTipoRepository.findAll().forEach(cat -> {
				CatalogueDTO catCategoria = new CatalogueDTO();
				BeanUtils.copyProperties(cat, catCategoria);
				listCatDTO.add(catCategoria);
			});
			break;
		case CATALOG_CATEGORIA:
			iCatCategoriaRepository.findAll().forEach(cat -> {
				CatalogueDTO catCategoria = new CatalogueDTO();
				BeanUtils.copyProperties(cat, catCategoria);
				listCatDTO.add(catCategoria);
			});
			break;
		case CATALOG_COLOR:
			iCatColorRepository.findAll().forEach(cat -> {
				CatalogueDTO catCategoria = new CatalogueDTO();
				BeanUtils.copyProperties(cat, catCategoria);
				listCatDTO.add(catCategoria);
			});
			break;
		case CATALOG_TALLA:
			iCatTallaRepository.findAll().forEach(cat -> {
				CatalogueDTO catCategoria = new CatalogueDTO();
				BeanUtils.copyProperties(cat, catCategoria);
				listCatDTO.add(catCategoria);
			});
			break;
		case CATALOG_TIPO_PAGO:
			iCatTipoPagoRepository.findAll().forEach(cat -> {
				CatalogueDTO catCategoria = new CatalogueDTO();
				BeanUtils.copyProperties(cat, catCategoria);
				listCatDTO.add(catCategoria);
			});
			break;
		case CATALOG_STATUS_VENTA:
			iCatStatusVentaRepository.findAll().forEach(cat -> {
				CatalogueDTO catCategoria = new CatalogueDTO();
				BeanUtils.copyProperties(cat, catCategoria);
				listCatDTO.add(catCategoria);
			});
			break;
		case CATALOG_STATUS_ROL:
			iCatRolRepository.findAll().forEach(cat -> {
				CatalogueDTO catCategoria = new CatalogueDTO();
				BeanUtils.copyProperties(cat, catCategoria);
				listCatDTO.add(catCategoria);
			});
			break;
		default:
			break;
		}
		return listCatDTO;
	}

}
