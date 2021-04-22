package com.example.demo.store.repository;

import com.example.demo.store.tbo.domain.ApiListEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiRepository extends JpaRepository<ApiListEntity,String> {
}
