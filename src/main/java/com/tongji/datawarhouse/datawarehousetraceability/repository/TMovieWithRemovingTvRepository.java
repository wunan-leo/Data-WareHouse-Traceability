package com.tongji.datawarhouse.datawarehousetraceability.repository;

import com.tongji.datawarhouse.datawarehousetraceability.model.TMovieWithRemovingTvEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TMovieWithRemovingTvRepository extends JpaRepository<TMovieWithRemovingTvEntity, String> {
    Page<TMovieWithRemovingTvEntity> findAll(Pageable pageable);
}
