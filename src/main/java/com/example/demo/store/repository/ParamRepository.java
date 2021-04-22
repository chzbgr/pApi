package com.example.demo.store.repository;


import com.example.demo.store.tbo.domain.ParameterListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParamRepository extends JpaRepository<ParameterListEntity,String> {
}
