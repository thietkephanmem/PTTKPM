package service;

import java.util.List;

import model.LoaiSPDTO;

public interface LoaiSPService {
	public List<LoaiSPDTO> getALLLoaisp();
	public List<LoaiSPDTO> getmenusp(int dm);
	public void deletelsp(LoaiSPDTO lsps);
}
