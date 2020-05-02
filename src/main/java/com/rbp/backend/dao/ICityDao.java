package com.rbp.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rbp.backend.Entity.City;

public interface ICityDao extends JpaRepository<City,Long>{

}
