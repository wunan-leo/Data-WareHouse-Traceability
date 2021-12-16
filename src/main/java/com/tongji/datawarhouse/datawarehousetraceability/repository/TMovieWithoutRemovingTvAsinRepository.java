package com.tongji.datawarhouse.datawarehousetraceability.repository;

import com.tongji.datawarhouse.datawarehousetraceability.model.TMovieWithoutRemovingTvAsinEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TMovieWithoutRemovingTvAsinRepository extends JpaRepository<TMovieWithoutRemovingTvAsinEntity, String> {
    Page<TMovieWithoutRemovingTvAsinEntity> findAll(Pageable pageable);
}
