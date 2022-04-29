package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Followtbl;
import com.example.demo.entity.Usertbl;

//User_tblのRepository宣言
@Repository
public interface FollowtblRepository extends JpaRepository<Followtbl, String> {
	List<Usertbl> findByFid(String fid);
}