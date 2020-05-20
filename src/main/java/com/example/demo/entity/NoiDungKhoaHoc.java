package com.example.demo.entity;
// Generated May 20, 2020 1:50:13 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * NoiDungKhoaHoc generated by hbm2java
 */
@Entity
@Table(name = "NoiDungKhoaHoc", catalog = "db_feedback")
public class NoiDungKhoaHoc implements java.io.Serializable {

	private Integer ndMa;
	private String ndNoiDung;
	private Set<KhoaHoc> khoaHocs = new HashSet<KhoaHoc>(0);

	public NoiDungKhoaHoc() {
	}

	public NoiDungKhoaHoc(String ndNoiDung, Set<KhoaHoc> khoaHocs) {
		this.ndNoiDung = ndNoiDung;
		this.khoaHocs = khoaHocs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Nd_Ma", unique = true, nullable = false)
	public Integer getNdMa() {
		return this.ndMa;
	}

	public void setNdMa(Integer ndMa) {
		this.ndMa = ndMa;
	}

	@Column(name = "Nd_NoiDung", length = 200)
	public String getNdNoiDung() {
		return this.ndNoiDung;
	}

	public void setNdNoiDung(String ndNoiDung) {
		this.ndNoiDung = ndNoiDung;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "noiDungKhoaHoc")
	public Set<KhoaHoc> getKhoaHocs() {
		return this.khoaHocs;
	}

	public void setKhoaHocs(Set<KhoaHoc> khoaHocs) {
		this.khoaHocs = khoaHocs;
	}

}