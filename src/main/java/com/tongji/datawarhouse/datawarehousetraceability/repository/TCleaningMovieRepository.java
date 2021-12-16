package com.tongji.datawarhouse.datawarehousetraceability.repository;

import com.tongji.datawarhouse.datawarehousetraceability.model.TCleaningMovieEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TCleaningMovieRepository extends JpaRepository<TCleaningMovieEntity, String> {
    TCleaningMovieEntity findByAsin(String asin);

    Page<TCleaningMovieEntity> findAll(Pageable pageable);
}
