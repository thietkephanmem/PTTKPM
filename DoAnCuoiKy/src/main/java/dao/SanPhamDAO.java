package dao;

import java.util.List;

import model.SanPhamDTO;

public interface SanPhamDAO {
	
	public List<SanPhamDTO> getAllSanPham();
	public void createSanPham(SanPhamDTO sp);
	public SanPhamDTO findSPById(SanPhamDTO id);
	public List<SanPhamDTO> getListSanPham();

}
