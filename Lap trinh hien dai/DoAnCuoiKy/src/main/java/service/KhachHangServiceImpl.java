package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.KhachHangDAO;
import model.KhachHangDTO;
@Service

public class KhachHangServiceImpl implements KhachHangService {

	KhachHangDAO kh ;
	public KhachHangDAO getKh() {
		return kh;
	}
	@Autowired
	public void setKh(KhachHangDAO kh) {
		this.kh = kh;
	}
	@Override
	public List<KhachHangDTO> getAllKhachHang() {
		// TODO Auto-generated method stub
		return kh.getAllKH();
	}
	@Override
	public void createKhachHang(KhachHangDTO dto) {
		 kh.createKH(dto);
		
	}

}
