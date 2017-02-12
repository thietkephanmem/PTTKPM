package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="phanquyen")

public class PhanQuyenDTO  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ma_phanquyen")
	private Integer ma_phanquyen;
	@Column(name="ten_phanquyen")
	private String ten_phanquyen;
	@Column(name="mo_ta")
	private String mo_ta;
	public Integer getMa_phanquyen() {
		return ma_phanquyen;
	}
	public void setMa_phanquyen(Integer ma_phanquyen) {
		this.ma_phanquyen = ma_phanquyen;
	}
	public String getTen_phanquyen() {
		return ten_phanquyen;
	}
	public void setTen_phanquyen(String ten_phanquyen) {
		this.ten_phanquyen = ten_phanquyen;
	}
	public String getMo_ta() {
		return mo_ta;
	}
	public void setMo_ta(String mo_ta) {
		this.mo_ta = mo_ta;
	}
	
	
}
