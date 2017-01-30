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

import model.PhanQuyenDTO;
import service.PhanQuyenService;
@Controller
@Transactional
@EnableTransactionManagement
public class PhanQuyenController {
	
	PhanQuyenService phanQuyenService;

	public PhanQuyenService getPhanQuyenService() {
		return phanQuyenService;
	}
	@Autowired
	public void setPhanQuyenService(PhanQuyenService phanQuyenService) {
		this.phanQuyenService = phanQuyenService;
	}
	
	@RequestMapping(value ="/phanquyen/list", method = RequestMethod.POST)
	public @ResponseBody String getlist() 
	{
		System.out.println("sssss");
		List<PhanQuyenDTO> list = new  ArrayList<PhanQuyenDTO>();
		list = phanQuyenService.getAll();
		String json = new Gson().toJson(list);
		return json;
	}
	@RequestMapping(value ="/phanquyen/create", method = RequestMethod.POST,consumes = {"application/xml", "application/json"})

	public @ResponseBody String create(@RequestBody String pq) 
	{
		
		Gson gson = new Gson();
		PhanQuyenDTO oj = gson.fromJson(pq, PhanQuyenDTO.class);
		System.out.println(oj.getTen_phanquyen());
		phanQuyenService.PhanQuyenCreate(oj);
		return "dafas";
	}

}
