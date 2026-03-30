package com.example.demo.store.repository;


import com.example.demo.dto.Parameter;
import com.example.demo.store.tbo.ParameterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParameterRepository extends JpaRepository<ParameterEntity, String> {

    List<ParameterEntity> findAllByApiId(@Param("apiId") String apiId);

}
