package com.cruz.calderon.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cruz.calderon.data.entity.CatCategoriaEntity;

/**
 * @author jesusc
 * 13 dic. 2019
 *
 */
public interface ICatCategoriaRepository extends JpaRepository<CatCategoriaEntity,Integer> {

}
