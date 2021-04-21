package com.example.demo.store.repository;

import com.example.demo.store.tbo.domain.ParamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParamRepository extends JpaRepository<ParamEntity,Long> {
}
