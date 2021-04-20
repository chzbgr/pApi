package com.example.demo.store.repository;

import com.example.demo.store.tbo.domain.Param;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParamRepository extends JpaRepository<Param,String> {
}
