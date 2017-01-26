package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="sanpham")
public class SanPhamDTO {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ma_sp")
	private Integer ma_sp;
	@Column(name="ten_sp")
	private String ten_sp;
	@Column(name="mau_sac")
	private String mau_sac;
	@Column(name="kich_thuoc")
	private String kich_thuoc;
	@Column(name="gia")
	private Double gia;
	@Column(name="soluong")
	private Integer soluong;
	@Column(name="ma_loai")
	private Integer ma_loai;
	@Column(name="hinh_anh")
	private String hinh_anh;
	@Column(name="ngay_nhap")
	private Date ngay_nhap;
	@Column(name="mo_ta")
	private String mo_ta;
	@Column(name="trang_thai")
	private String trang_thai;
	@Column(name="nha_sx")
	private Integer nha_sx;
	
	
	
	public Integer getMa_sp() {
		return ma_sp;
	}
	public void setMa_sp(Integer ma_sp) {
		this.ma_sp = ma_sp;
	}
	public String getTen_sp() {
		return ten_sp;
	}
	public void setTen_sp(String ten_sp) {
		this.ten_sp = ten_sp;
	}
	public String getMau_sac() {
		return mau_sac;
	}
	public void setMau_sac(String mau_sac) {
		this.mau_sac = mau_sac;
	}
	public String getKich_thuoc() {
		return kich_thuoc;
	}
	public void setKich_thuoc(String kich_thuoc) {
		this.kich_thuoc = kich_thuoc;
	}
	public Double getGia() {
		return gia;
	}
	public void setGia(Double gia) {
		this.gia = gia;
	}
	public Integer getSoluong() {
		return soluong;
	}
	public void setSoluong(Integer soluong) {
		this.soluong = soluong;
	}
	public Integer getMa_loai() {
		return ma_loai;
	}
	public void setMa_loai(Integer ma_loai) {
		this.ma_loai = ma_loai;
	}
	public String getHinh_anh() {
		return hinh_anh;
	}
	public void setHinh_anh(String hinh_anh) {
		this.hinh_anh = hinh_anh;
	}
	public Date getNgay_nhap() {
		return ngay_nhap;
	}
	public void setNgay_nhap(Date ngay_nhap) {
		this.ngay_nhap = ngay_nhap;
	}
	public String getMo_ta() {
		return mo_ta;
	}
	public void setMo_ta(String mo_ta) {
		this.mo_ta = mo_ta;
	}
	public String getTrang_thai() {
		return trang_thai;
	}
	public void setTrang_thai(String trang_thai) {
		this.trang_thai = trang_thai;
	}
	public Integer getNha_sx() {
		return nha_sx;
	}
	public void setNha_sx(Integer nha_sx) {
		this.nha_sx = nha_sx;
	}
	
	
	
	

}
