package dao;

import java.util.List;

import model.TaiXeDTO;

public interface TaiXeDAO {
	
	public List<TaiXeDTO> getAllTX();
	public void createTaiXe(TaiXeDTO sp);
//	public SanPhamDTO findSPById(SanPhamDTO id);
//	public List<SanPhamDTO> getListSanPham();
//	public List<SanPhamDTO> getSanPhamDanhMuc(SanPhamDTO sp);
//	public void delete(SanPhamDTO sp);

}
