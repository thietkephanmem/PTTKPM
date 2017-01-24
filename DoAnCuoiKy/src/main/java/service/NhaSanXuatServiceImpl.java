package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.NhaSanXuatDAO;
import model.NhaSanXuatDTO;
@Service
public class NhaSanXuatServiceImpl implements NhaSanXuatService {

	NhaSanXuatDAO dao ;
	public NhaSanXuatDAO getDao() {
		return dao;
	}
	@Autowired
	public void setDao(NhaSanXuatDAO dao) {
		this.dao = dao;
	}
	@Override
	public List<NhaSanXuatDTO> getAll()

	{
		
		// TODO Auto-generated method stub
		return dao.getAll();
	}



}
