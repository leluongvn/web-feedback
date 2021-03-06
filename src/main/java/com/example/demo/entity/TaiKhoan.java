package com.example.demo.entity;
// Generated May 20, 2020 3:00:35 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TaiKhoan generated by hbm2java
 */
@Entity
@Table(name = "TaiKhoan", catalog = "db_feedback")
public class TaiKhoan implements java.io.Serializable {

	private String email;
	private UserRole userRole;
	private String tkPassword;
	private String tkHovaTen;
	private String tkSdt;
	private String tkDiaChi;
	private String tkGioiTinh;
	private String tkTrangThai;
	private Set<LopHoc> lopHocs = new HashSet<LopHoc>(0);
	private Set<DanhSachLopHoc> danhSachLopHocs = new HashSet<DanhSachLopHoc>(0);
	private Set<PhanHoiFeedBack> phanHoiFeedBacks = new HashSet<PhanHoiFeedBack>(0);

	public TaiKhoan() {
	}

	public TaiKhoan(String email) {
		this.email = email;
	}

	public TaiKhoan(String email, UserRole userRole, String tkPassword, String tkHovaTen, String tkSdt, String tkDiaChi,
			String tkGioiTinh, String tkTrangThai, Set<LopHoc> lopHocs, Set<DanhSachLopHoc> danhSachLopHocs,
			Set<PhanHoiFeedBack> phanHoiFeedBacks) {
		this.email = email;
		this.userRole = userRole;
		this.tkPassword = tkPassword;
		this.tkHovaTen = tkHovaTen;
		this.tkSdt = tkSdt;
		this.tkDiaChi = tkDiaChi;
		this.tkGioiTinh = tkGioiTinh;
		this.tkTrangThai = tkTrangThai;
		this.lopHocs = lopHocs;
		this.danhSachLopHocs = danhSachLopHocs;
		this.phanHoiFeedBacks = phanHoiFeedBacks;
	}

	@Id

	@Column(name = "Email", unique = true, nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Ur_Ma")
	public UserRole getUserRole() {
		return this.userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	@Column(name = "Tk_Password", length = 20)
	public String getTkPassword() {
		return this.tkPassword;
	}

	public void setTkPassword(String tkPassword) {
		this.tkPassword = tkPassword;
	}

	@Column(name = "Tk_HovaTen", length = 100)
	public String getTkHovaTen() {
		return this.tkHovaTen;
	}

	public void setTkHovaTen(String tkHovaTen) {
		this.tkHovaTen = tkHovaTen;
	}

	@Column(name = "Tk_Sdt", length = 100)
	public String getTkSdt() {
		return this.tkSdt;
	}

	public void setTkSdt(String tkSdt) {
		this.tkSdt = tkSdt;
	}

	@Column(name = "Tk_DiaChi", length = 100)
	public String getTkDiaChi() {
		return this.tkDiaChi;
	}

	public void setTkDiaChi(String tkDiaChi) {
		this.tkDiaChi = tkDiaChi;
	}

	@Column(name = "Tk_GioiTinh", length = 3)
	public String getTkGioiTinh() {
		return this.tkGioiTinh;
	}

	public void setTkGioiTinh(String tkGioiTinh) {
		this.tkGioiTinh = tkGioiTinh;
	}

	@Column(name = "Tk_TrangThai", length = 10)
	public String getTkTrangThai() {
		return this.tkTrangThai;
	}

	public void setTkTrangThai(String tkTrangThai) {
		this.tkTrangThai = tkTrangThai;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "taiKhoan")
	public Set<LopHoc> getLopHocs() {
		return this.lopHocs;
	}

	public void setLopHocs(Set<LopHoc> lopHocs) {
		this.lopHocs = lopHocs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "taiKhoan")
	public Set<DanhSachLopHoc> getDanhSachLopHocs() {
		return this.danhSachLopHocs;
	}

	public void setDanhSachLopHocs(Set<DanhSachLopHoc> danhSachLopHocs) {
		this.danhSachLopHocs = danhSachLopHocs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "taiKhoan")
	public Set<PhanHoiFeedBack> getPhanHoiFeedBacks() {
		return this.phanHoiFeedBacks;
	}

	public void setPhanHoiFeedBacks(Set<PhanHoiFeedBack> phanHoiFeedBacks) {
		this.phanHoiFeedBacks = phanHoiFeedBacks;
	}

}
