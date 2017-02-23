package dao;

import java.util.List;

import model.KhachHangDTO;

public interface KhachHangDAO {
	public List<KhachHangDTO> getAllKH();
	public void createKH(KhachHangDTO dto);
	

}
