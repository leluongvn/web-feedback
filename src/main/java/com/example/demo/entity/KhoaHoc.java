package com.example.demo.entity;
// Generated May 20, 2020 3:00:35 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * KhoaHoc generated by hbm2java
 */
@Entity
@Table(name = "KhoaHoc", catalog = "db_feedback")
public class KhoaHoc implements java.io.Serializable {

	private Integer khMa;
	private NoiDungKhoaHoc noiDungKhoaHoc;
	private String khTen;
	private Set<LopHoc> lopHocs = new HashSet<LopHoc>(0);
	private Set<Feedback> feedbacks = new HashSet<Feedback>(0);

	public KhoaHoc() {
	}

	public KhoaHoc(NoiDungKhoaHoc noiDungKhoaHoc, String khTen, Set<LopHoc> lopHocs, Set<Feedback> feedbacks) {
		this.noiDungKhoaHoc = noiDungKhoaHoc;
		this.khTen = khTen;
		this.lopHocs = lopHocs;
		this.feedbacks = feedbacks;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Kh_Ma", unique = true, nullable = false)
	public Integer getKhMa() {
		return this.khMa;
	}

	public void setKhMa(Integer khMa) {
		this.khMa = khMa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Nd_Ma")
	public NoiDungKhoaHoc getNoiDungKhoaHoc() {
		return this.noiDungKhoaHoc;
	}

	public void setNoiDungKhoaHoc(NoiDungKhoaHoc noiDungKhoaHoc) {
		this.noiDungKhoaHoc = noiDungKhoaHoc;
	}

	@Column(name = "Kh_Ten", length = 100)
	public String getKhTen() {
		return this.khTen;
	}

	public void setKhTen(String khTen) {
		this.khTen = khTen;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "khoaHoc")
	public Set<LopHoc> getLopHocs() {
		return this.lopHocs;
	}

	public void setLopHocs(Set<LopHoc> lopHocs) {
		this.lopHocs = lopHocs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "khoaHoc")
	public Set<Feedback> getFeedbacks() {
		return this.feedbacks;
	}

	public void setFeedbacks(Set<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

}
