package com.tongji.datawarhouse.datawarehousetraceability.repository;

import com.tongji.datawarhouse.datawarehousetraceability.model.VTvAsinEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TVAsinRepository extends JpaRepository<VTvAsinEntity,String> {
    Page<VTvAsinEntity> findAll(Pageable pageable);
}
