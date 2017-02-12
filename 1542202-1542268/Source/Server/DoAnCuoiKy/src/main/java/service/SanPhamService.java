package service;

import java.util.List;

import model.SanPhamDTO;

public interface SanPhamService {
	
	public List<SanPhamDTO> getAllSanPham();
	public void createSP(SanPhamDTO sp);
	public SanPhamDTO getSPbyId(SanPhamDTO sp);
	public List<SanPhamDTO> getlistsp();
	public List<SanPhamDTO> getSanPhamDanhMuc(SanPhamDTO sp);
	public void deletesp(SanPhamDTO sp);

}
