package com.rbp.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rbp.backend.Entity.State;

public interface IStateDao extends JpaRepository<State, Long>{

}
