package com.tongji.datawarhouse.datawarehousetraceability.repository;

import com.tongji.datawarhouse.datawarehousetraceability.model.TCommentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TCommentRepository extends JpaRepository<TCommentEntity, Integer> {
    Page<TCommentEntity> findAll(Pageable pageable);

    List<TCommentEntity> findAllByAsin(String asin);

    long countAllByAsinIn(List<String> asinList);
}
