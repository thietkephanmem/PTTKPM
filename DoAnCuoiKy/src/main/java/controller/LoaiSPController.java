package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import model.LoaiSPDTO;
import model.SanPhamDTO;
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
	@RequestMapping(value ="/loaisanpham/menu", method = RequestMethod.POST)
	public @ResponseBody String getmenu(@RequestBody String dm) 
	{
		Gson gson = new Gson();
		LoaiSPDTO oj = gson.fromJson(dm, LoaiSPDTO.class);
		List<LoaiSPDTO> list = new  ArrayList<LoaiSPDTO>();
		list = loaiSPService.getmenusp(oj.getMa_danh_muc());
		String json = new Gson().toJson(list);
		return json;
	}
	
	@RequestMapping(value ="/loaisanpham/delete", method = RequestMethod.POST)
	public @ResponseBody String delete(@RequestBody String dm) 
	{
		Gson gson = new Gson();
		LoaiSPDTO oj = gson.fromJson(dm, LoaiSPDTO.class);
		
		loaiSPService.deletelsp(oj);
		String json = new Gson().toJson(oj);
		return json;
	}
	
}
