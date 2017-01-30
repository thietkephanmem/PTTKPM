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
import model.SanPhamDTO;
import service.SanPhamService;

@Controller
@Transactional
@EnableTransactionManagement
public class SanPhamController {
	
	SanPhamService phamService;

	public SanPhamService getPhamService() {
		return phamService;
	}
	@Autowired
	public void setPhamService(SanPhamService phamService) {
		this.phamService = phamService;
	}
	
	@RequestMapping(value ="/sanpham/list", method = RequestMethod.GET)
	public @ResponseBody String getlist() 
	{
		List<SanPhamDTO> list = new  ArrayList<SanPhamDTO>();
		list = phamService.getAllSanPham();
		String json = new Gson().toJson(list);
		return json;
	}
	
	@RequestMapping(value ="/sanpham/create", method = RequestMethod.POST,produces = "application/json; charset=UTF-8")
	public  @ResponseBody String createSanPham(@RequestBody String sp) 
	{
		Gson gson = new Gson();
		SanPhamDTO oj = gson.fromJson(sp, SanPhamDTO.class);
		phamService.createSP(oj);
		return "OK";
	}
	

}
