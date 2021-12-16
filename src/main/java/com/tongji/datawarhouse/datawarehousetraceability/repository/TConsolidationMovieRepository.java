package com.tongji.datawarhouse.datawarehousetraceability.repository;

import com.tongji.datawarhouse.datawarehousetraceability.model.TConsolidationMovieEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TConsolidationMovieRepository extends JpaRepository<TConsolidationMovieEntity,String> {
    TConsolidationMovieEntity findByAsin(String asin);
    Page<TConsolidationMovieEntity> findAll(Pageable pageable);
    Page<TConsolidationMovieEntity> findAllByAsinCountGreaterThan(Integer asinCount, Pageable pageable);
    Page<TConsolidationMovieEntity> findAllByAsinCountEquals(Integer asinCount, Pageable pageable);
    long countAllByAsinCountEquals(Integer asinCount);
    long countAllByAsinCountGreaterThan(Integer asinCount);
    Page<TConsolidationMovieEntity> findAllByMovieTitleLike(String title,Pageable pageable);
}
