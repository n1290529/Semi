package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Tasktbl;

@Repository
public interface TaskRepository extends JpaRepository<Tasktbl, String> {
}
