package service;

import java.util.List;

import model.TaiXeDTO;

public interface TaiXeService {
	
	public List<TaiXeDTO> getAllTaiXe();
//	public void dao(TaiXeDTO sp);
//	public SanPhamDTO getSPbyId(SanPhamDTO sp);
//	public List<SanPhamDTO> getlistsp();
//	public List<SanPhamDTO> getSanPhamDanhMuc(SanPhamDTO sp);
//	public void deletesp(SanPhamDTO sp);
	void createTX(TaiXeDTO sp);

}
