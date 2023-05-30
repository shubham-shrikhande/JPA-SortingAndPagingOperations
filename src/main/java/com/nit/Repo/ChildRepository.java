package com.nit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.Entity.Child;

public interface ChildRepository extends JpaRepository<Child, Integer> {

}
