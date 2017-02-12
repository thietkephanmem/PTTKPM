package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.NguoiDungDAO;
import model.NguoiDungDTO;
@Service

public class NguoiDungServiceImpl implements NguoiDungService {

	NguoiDungDAO  dao;
	
	public NguoiDungDAO getDao() {
		return dao;
	}
	@Autowired
	public void setDao(NguoiDungDAO dao) {
		this.dao = dao;
	}

	@Override
	public NguoiDungDTO findByIdnd(NguoiDungDTO nd) {
		// TODO Auto-generated method stub
		return dao.findById(nd);
	}

	@Override
	public void creatend(NguoiDungDTO nd) {
		dao.create(nd);
		
	}

}
