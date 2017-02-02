package dao;

import java.util.List;

import model.SanPhamDTO;

public interface SanPhamDAO {
	
	public List<SanPhamDTO> getAllSanPham();
	public void createSanPham(SanPhamDTO sp);
	public SanPhamDTO findSPById(SanPhamDTO id);
	public List<SanPhamDTO> getListSanPham();
	public List<SanPhamDTO> getSanPhamDanhMuc(SanPhamDTO sp);
	public void delete(SanPhamDTO sp);

}
