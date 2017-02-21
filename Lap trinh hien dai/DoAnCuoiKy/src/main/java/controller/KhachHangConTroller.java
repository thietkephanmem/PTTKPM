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

import model.KhachHangDTO;
import service.KhachHangService;

@Controller
@Transactional
@EnableTransactionManagement
public class KhachHangConTroller {
	KhachHangService hangService;

	public KhachHangService getHangService() {
		return hangService;
	}
	@Autowired
	public void setHangService(KhachHangService hangService) {
		this.hangService = hangService;
	}
	
	@RequestMapping(value ="/khachhang/list", method = RequestMethod.GET)
	public @ResponseBody String getlist() 
	{
		List<KhachHangDTO> list = new  ArrayList<KhachHangDTO>();
		list = hangService.getAllKhachHang();
		String json = new Gson().toJson(list);
		return json;
	}
	
	
}
