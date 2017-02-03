package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.LoaiSPDAO;
import model.LoaiSPDTO;
@Service
public class LoaiSPServiceImpl implements LoaiSPService {

	LoaiSPDAO lsp;
	
	public LoaiSPDAO getLsp() {
		return lsp;
	}
	@Autowired
	public void setLsp(LoaiSPDAO lsp) {
		this.lsp = lsp;
	}

	@Override
	public List<LoaiSPDTO> getALLLoaisp() {
		// TODO Auto-generated method stub
		return lsp.getALL();
	}
	@Override
	public List<LoaiSPDTO> getmenusp(int dm) {
		// TODO Auto-generated method stub
		return lsp.getmenu(dm);
	}
	@Override
	public void deletelsp(LoaiSPDTO lsps) {
		lsp.deleteloai(lsps);

	}
	@Override
	public void createLoaiSP(LoaiSPDTO lsps) {
		lsp.createLSP(lsps);
		
	}

}
