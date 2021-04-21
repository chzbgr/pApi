package com.example.demo.store.repository;

import com.example.demo.dto.Api;
import com.example.demo.store.tbo.ApiEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ApiRepository extends JpaRepository<ApiEntity,String> {
}
