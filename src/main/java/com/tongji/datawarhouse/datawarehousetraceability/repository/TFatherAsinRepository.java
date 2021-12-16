package com.tongji.datawarhouse.datawarehousetraceability.repository;

import com.tongji.datawarhouse.datawarehousetraceability.model.TFatherAsinEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TFatherAsinRepository extends JpaRepository<TFatherAsinEntity,String> {
    List<TFatherAsinEntity> findAllByFatherAsin(String fatherAsin);
}
