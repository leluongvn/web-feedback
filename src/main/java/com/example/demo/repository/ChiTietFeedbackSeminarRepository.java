package com.example.demo.repository;

import com.example.demo.entity.ChiTietFeedbackSeminar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietFeedbackSeminarRepository extends JpaRepository<ChiTietFeedbackSeminar, Integer> {
}
