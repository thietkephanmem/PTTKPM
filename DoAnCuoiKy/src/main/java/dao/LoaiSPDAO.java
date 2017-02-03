package dao;

import java.util.List;

import model.LoaiSPDTO;

public interface LoaiSPDAO {

	public List<LoaiSPDTO> getALL();
	public List<LoaiSPDTO> getmenu(int dm);
	public void deleteloai(LoaiSPDTO lsp);
	public void createLSP(LoaiSPDTO lsp);
}
