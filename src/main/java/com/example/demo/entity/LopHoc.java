package com.example.demo.entity;
// Generated May 20, 2020 3:00:35 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * LopHoc generated by hbm2java
 */
@Entity
@Table(name = "LopHoc", catalog = "db_feedback")
public class LopHoc implements java.io.Serializable {

	private Integer lhMa;
	private KhoaHoc khoaHoc;
	private TaiKhoan taiKhoan;
	private String lhTen;

	public LopHoc() {
	}

	public LopHoc(KhoaHoc khoaHoc, TaiKhoan taiKhoan, String lhTen) {
		this.khoaHoc = khoaHoc;
		this.taiKhoan = taiKhoan;
		this.lhTen = lhTen;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Lh_Ma", unique = true, nullable = false)
	public Integer getLhMa() {
		return this.lhMa;
	}

	public void setLhMa(Integer lhMa) {
		this.lhMa = lhMa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Kh_Ma")
	public KhoaHoc getKhoaHoc() {
		return this.khoaHoc;
	}

	public void setKhoaHoc(KhoaHoc khoaHoc) {
		this.khoaHoc = khoaHoc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Email")
	public TaiKhoan getTaiKhoan() {
		return this.taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	@Column(name = "Lh_Ten", length = 100)
	public String getLhTen() {
		return this.lhTen;
	}

	public void setLhTen(String lhTen) {
		this.lhTen = lhTen;
	}

}
