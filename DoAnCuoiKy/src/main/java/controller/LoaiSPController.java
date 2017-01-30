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

import model.LoaiSPDTO;
import service.LoaiSPService;

@Controller
@Transactional
@EnableTransactionManagement
public class LoaiSPController {
	LoaiSPService loaiSPService;

	public LoaiSPService getLoaiSPService() {
		return loaiSPService;
	}
	@Autowired
	public void setLoaiSPService(LoaiSPService loaiSPService) {
		this.loaiSPService = loaiSPService;
	}
	
	@RequestMapping(value ="/loaisanpham/list", method = RequestMethod.GET)
	public @ResponseBody String getlist() 
	{
		List<LoaiSPDTO> list = new  ArrayList<LoaiSPDTO>();
		list = loaiSPService.getALLLoaisp();
		String json = new Gson().toJson(list);
		return json;
	}
	
}
