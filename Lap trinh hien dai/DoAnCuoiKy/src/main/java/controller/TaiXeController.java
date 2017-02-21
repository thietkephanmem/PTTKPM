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

import model.TaiXeDTO;
import service.TaiXeService;

@Controller
@Transactional
@EnableTransactionManagement
public class TaiXeController {
	
	TaiXeService taiXeService;


	
	public TaiXeService getTaiXeService() {
		return taiXeService;
	}


	@Autowired
	public void setTaiXeService(TaiXeService taiXeService) {
		this.taiXeService = taiXeService;
	}



	@RequestMapping(value ="/taixe/list", method = RequestMethod.GET)
	public @ResponseBody String getlist() 
	{
		List<TaiXeDTO> list = new  ArrayList<TaiXeDTO>();
		list = taiXeService.getAllTaiXe();
		String json = new Gson().toJson(list);
		return json;
	}
	
	@RequestMapping(value ="/taixe/create", method = RequestMethod.POST,produces = "application/json; charset=UTF-8")
	public  @ResponseBody String txcreate(@RequestBody String tx) 
	{
		try {
			Gson gson = new Gson();
			TaiXeDTO oj = gson.fromJson(tx, TaiXeDTO.class);
			taiXeService.createTX(oj);
			return new Gson().toJson(oj);
		} catch (Exception e) {
			return e.getMessage();
		}
		
	}
//	
//	@RequestMapping(value ="/sanpham/findbyid", method = RequestMethod.POST,produces = "application/json; charset=UTF-8")
//	public  @ResponseBody String findSP(@RequestBody String sp) 
//	{
//		Gson gson = new Gson();
//		SanPhamDTO oj = gson.fromJson(sp, SanPhamDTO.class);
//		
//		return new Gson().toJson(phamService.getSPbyId(oj));
//	}
//	@RequestMapping(value ="/sanpham/listall", method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
//	public  @ResponseBody String getAllSP() 
//	{
//		
//		
//		return new Gson().toJson(phamService.getlistsp());
//	}
//	
//	@RequestMapping(value ="/sanpham/getdmsanpham", method = RequestMethod.POST,produces = "application/json; charset=UTF-8")
//	public  @ResponseBody String getdmsanpham(@RequestBody String sp) 
//	{
//		Gson gson = new Gson();
//		SanPhamDTO oj = gson.fromJson(sp, SanPhamDTO.class);
//		
//		List<SanPhamDTO> list = new  ArrayList<SanPhamDTO>();
//		list = phamService.getSanPhamDanhMuc(oj);
//		String json = new Gson().toJson(list);
//		return json;
//	}
//	@RequestMapping(value ="/sanpham/delete", method = RequestMethod.POST,produces = "application/json; charset=UTF-8")
//	public  @ResponseBody String deletesp(@RequestBody String sp) 
//	{
//		Gson gson = new Gson();
//		SanPhamDTO oj = gson.fromJson(sp, SanPhamDTO.class);
//		phamService.deletesp(oj);
//		String json = new Gson().toJson(oj);
//		return json;
//	}

}
