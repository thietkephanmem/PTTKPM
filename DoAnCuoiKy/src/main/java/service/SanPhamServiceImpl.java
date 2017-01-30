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
	

}
