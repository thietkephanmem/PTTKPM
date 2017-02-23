package service;

import java.util.List;

import model.KhachHangDTO;

public interface KhachHangService {
	public List<KhachHangDTO> getAllKhachHang();
	public void createKhachHang(KhachHangDTO dto);

}
