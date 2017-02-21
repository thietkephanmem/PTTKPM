package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name = "khachhang")

public class KhachHangDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "makh")
	private Integer makh;
	@Column(name = "diachi")
	private String diachi;
	@Column(name = "sdt")
	private String sdt;
	@Column(name = "loaixe")
	private Boolean loaixe;
	public Integer getMakh() {
		return makh;
	}
	public void setMakh(Integer makh) {
		this.makh = makh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public Boolean getLoaixe() {
		return loaixe;
	}
	public void setLoaixe(Boolean loaixe) {
		this.loaixe = loaixe;
	}
	
	
	
	
}
