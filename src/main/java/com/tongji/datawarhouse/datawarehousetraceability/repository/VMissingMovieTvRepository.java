package com.tongji.datawarhouse.datawarehousetraceability.repository;

import com.tongji.datawarhouse.datawarehousetraceability.model.VMissingMovieTvEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VMissingMovieTvRepository extends JpaRepository<VMissingMovieTvEntity,String> {
    Page<VMissingMovieTvEntity> findAll(Pageable pageable);
}
