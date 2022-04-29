package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Projecttbl;
import com.example.demo.entity.Usertbl;

//User_tblのRepository宣言
@Repository
public interface ProjectRepository extends JpaRepository<Projecttbl, String> {
	List<Usertbl> findByIdAndName(String id, String name);
	List<Usertbl> findByIdAndUid(String id, String uid);
	List<Usertbl> findByUid(String uid);
}