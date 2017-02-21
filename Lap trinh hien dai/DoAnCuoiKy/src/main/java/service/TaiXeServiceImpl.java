package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TaiXeDAO;
import model.TaiXeDTO;


@Service
public class TaiXeServiceImpl implements TaiXeService{

	TaiXeDAO dao;
	


	public TaiXeDAO getDao() {
		return dao;
	}


	@Autowired
	public void setDao(TaiXeDAO dao) {
		this.dao = dao;
	}



	@Override
	public List<TaiXeDTO> getAllTaiXe() {
		// TODO Auto-generated method stub
		return dao.getAllTX();
	}
	@Override
	public void createTX(TaiXeDTO sp) {
		dao.createTaiXe(sp);
		
	}
//	@Override
//	public SanPhamDTO getSPbyId(SanPhamDTO sp) {
//		// TODO Auto-generated method stub
//		return sanphamdao.findSPById(sp);
//	}
//	@Override
//	public List<SanPhamDTO> getlistsp() {
//		// TODO Auto-generated method stub
//		return sanphamdao.getListSanPham();
//	}
//	@Override
//	public List<SanPhamDTO> getSanPhamDanhMuc(SanPhamDTO sp) {
//		// TODO Auto-generated method stub
//		return sanphamdao.getSanPhamDanhMuc(sp);
//	}
//	@Override
//	public void deletesp(SanPhamDTO sp) {
//		sanphamdao.delete(sp);
//		
//	}
//	

}
