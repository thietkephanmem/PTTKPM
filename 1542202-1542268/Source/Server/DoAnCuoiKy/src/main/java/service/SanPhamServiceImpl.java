package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.SanPhamDAO;
import model.SanPhamDTO;
@Service
public class SanPhamServiceImpl implements SanPhamService{

	SanPhamDAO sanphamdao;
	
	public SanPhamDAO getSanphamdao() {
		return sanphamdao;
	}
	@Autowired
	public void setSanphamdao(SanPhamDAO sanphamdao) {
		this.sanphamdao = sanphamdao;
	}

	@Override
	public List<SanPhamDTO> getAllSanPham() {
		// TODO Auto-generated method stub
		return sanphamdao.getAllSanPham();
	}
	@Override
	public void createSP(SanPhamDTO sp) {
		sanphamdao.createSanPham(sp);
		
	}
	@Override
	public SanPhamDTO getSPbyId(SanPhamDTO sp) {
		// TODO Auto-generated method stub
		return sanphamdao.findSPById(sp);
	}
	@Override
	public List<SanPhamDTO> getlistsp() {
		// TODO Auto-generated method stub
		return sanphamdao.getListSanPham();
	}
	@Override
	public List<SanPhamDTO> getSanPhamDanhMuc(SanPhamDTO sp) {
		// TODO Auto-generated method stub
		return sanphamdao.getSanPhamDanhMuc(sp);
	}
	@Override
	public void deletesp(SanPhamDTO sp) {
		sanphamdao.delete(sp);
		
	}
	

}
