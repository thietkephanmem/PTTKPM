package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "loaisanpham")
public class LoaiSPDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ma_loai_sp")
	private Integer ma_loai_sp;
	@Column(name = "ten_loai_sp")
	private String ten_loai_sp;
	@Column(name = "ma_danh_muc")

	private Integer ma_danh_muc;

	public Integer getMa_loai_sp() {
		return ma_loai_sp;
	}

	public void setMa_loai_sp(Integer ma_loai_sp) {
		this.ma_loai_sp = ma_loai_sp;
	}

	public String getTen_loai_sp() {
		return ten_loai_sp;
	}

	public void setTen_loai_sp(String ten_loai_sp) {
		this.ten_loai_sp = ten_loai_sp;
	}

	public Integer getMa_danh_muc() {
		return ma_danh_muc;
	}

	public void setMa_danh_muc(Integer ma_danh_muc) {
		this.ma_danh_muc = ma_danh_muc;
	}
	
}
