package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "nguoidung")

public class NguoiDungDTO {
	@Id
//	@GeneratedValue
	@Column(name = "user")
	private String user;
	@Column(name = "ten_nguoidung")
	private String ten_nguoidung;
	@Column(name = "ma_phanquyen")
	private Integer ma_phanquyen;
	@Column(name = "password")
	private String password;
	@Column(name = "ngay_sinh")
	private Date ngay_sinh;
	@Column(name = "SDT")
	private Integer sdt;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getTen_nguoidung() {
		return ten_nguoidung;
	}
	public void setTen_nguoidung(String ten_nguoidung) {
		this.ten_nguoidung = ten_nguoidung;
	}
	public Integer getMa_phanquyen() {
		return ma_phanquyen;
	}
	public void setMa_phanquyen(Integer ma_phanquyen) {
		this.ma_phanquyen = ma_phanquyen;
	}
	public String getPass() {
		return password;
	}
	public void setPass(String pass) {
		this.password = pass;
	}
	public Date getNgay_sinh() {
		return ngay_sinh;
	}
	public void setNgay_sinh(Date ngay_sinh) {
		this.ngay_sinh = ngay_sinh;
	}
	public Integer getSdt() {
		return sdt;
	}
	public void setSdt(Integer sdt) {
		this.sdt = sdt;
	}
	

}
