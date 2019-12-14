package com.cruz.calderon.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cruz.calderon.data.entity.CatColorEntity;

/**
 * @author jesusc
 * 13 dic. 2019
 *
 */
public interface ICatColorRepository extends JpaRepository<CatColorEntity, Integer> {

}
