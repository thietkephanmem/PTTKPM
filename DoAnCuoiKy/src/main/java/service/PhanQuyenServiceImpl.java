package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.PhanQuyenDAO;
import model.PhanQuyenDTO;
@Service
public class PhanQuyenServiceImpl implements PhanQuyenService {
	
	
	PhanQuyenDAO dao;
	public PhanQuyenDAO getDao() {
		return dao;
	}
	@Autowired
	public void setDao(PhanQuyenDAO dao) {
		this.dao = dao;
	}
	@Override
	public List<PhanQuyenDTO> getAll() {
		
		return dao.getAll();
	}

}
