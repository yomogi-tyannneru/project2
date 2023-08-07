package com.example.project2.webapp.repository;

import com.example.project2.webapp.entity.Demo2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository2 extends JpaRepository<Demo2, Long> {
}
