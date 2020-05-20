package com.example.demo.repository;

import com.example.demo.entity.ChiTietFeedbackOnline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietFeedbackOnlineRepository extends JpaRepository<ChiTietFeedbackOnline, Integer> {
}
