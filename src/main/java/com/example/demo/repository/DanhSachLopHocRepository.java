package com.example.demo.repository;

import com.example.demo.entity.DanhSachLopHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanhSachLopHocRepository extends JpaRepository<DanhSachLopHoc, Integer> {
}
