package com.cruz.calderon.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cruz.calderon.data.entity.CatRolEntity;

/**
 * @author jesusc
 * 13 dic. 2019
 *
 */
public interface ICatRolRepository extends JpaRepository<CatRolEntity, Integer> {

}
