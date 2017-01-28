package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import model.NhaSanXuatDTO;
import service.NhaSanXuatService;

@Controller
@Transactional
@EnableTransactionManagement
public class NhaSanXuatController {

	NhaSanXuatService nhaSanXuatService;

	public NhaSanXuatService getNhaSanXuatService() {
		return nhaSanXuatService;
	}
	
	@Autowired
	public void setNhaSanXuatService(NhaSanXuatService nhaSanXuatService) {
		this.nhaSanXuatService = nhaSanXuatService;
	}
	
	@RequestMapping(value ="/test3", method = RequestMethod.GET)
	public @ResponseBody String getlist() 
	{
		List<NhaSanXuatDTO> list = new  ArrayList<NhaSanXuatDTO>();
		list = nhaSanXuatService.getAll();
		String json = new Gson().toJson(list);
		return json;
	}
}
