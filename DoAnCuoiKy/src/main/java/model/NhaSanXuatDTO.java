package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="nhasanxuat")
public class NhaSanXuatDTO {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ma_nha_sx")
	private Integer ma_nha_sx;
	@Column(name="ten_nha_sx")
	private String ten_nha_sx;
	@Column(name="email")
	private String email;
	@Column(name="dia_chi")
	private String dia_chi;
	@Column(name="logo")
	private String logo;
	@Column(name="SDT")
	private String SDT;
	public Integer getMa_nha_sx() {
		return ma_nha_sx;
	}
	public void setMa_nha_sx(Integer ma_nha_sx) {
		this.ma_nha_sx = ma_nha_sx;
	}
	public String getTen_nha_sx() {
		return ten_nha_sx;
	}
	public void setTen_nha_sx(String ten_nha_sx) {
		this.ten_nha_sx = ten_nha_sx;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDia_chi() {
		return dia_chi;
	}
	public void setDia_chi(String dia_chi) {
		this.dia_chi = dia_chi;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}

}
