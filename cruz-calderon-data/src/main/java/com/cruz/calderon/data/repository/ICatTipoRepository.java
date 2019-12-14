package com.cruz.calderon.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cruz.calderon.data.entity.CatTipoEntity;
/**
 * @author jesusc
 * 13 dic. 2019
 *
 *
 */
@Repository
public interface ICatTipoRepository extends JpaRepository<CatTipoEntity,Integer> {

}
