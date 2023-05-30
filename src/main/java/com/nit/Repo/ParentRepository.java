package com.nit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.Entity.Parent;

public interface ParentRepository extends JpaRepository<Parent, Integer> {

}
