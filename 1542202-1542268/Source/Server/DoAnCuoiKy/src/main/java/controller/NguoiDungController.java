package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import model.NguoiDungDTO;
import service.NguoiDungService;

@Controller
@Transactional
@EnableTransactionManagement
public class NguoiDungController {
	NguoiDungService dungService;

	public NguoiDungService getDungService() {
		return dungService;
	}

	@Autowired
	public void setDungService(NguoiDungService dungService) {
		this.dungService = dungService;
	}

	@RequestMapping(value = "/nguoidung/create", method = RequestMethod.POST)
	public @ResponseBody String create(@RequestBody String dm) {
		Gson gson = new Gson();
		NguoiDungDTO oj = gson.fromJson(dm, NguoiDungDTO.class);

		dungService.creatend(oj);
		String json = new Gson().toJson(oj);
		return json;
	}

	@RequestMapping(value = "/nguoidung/login", method = RequestMethod.POST)
	public @ResponseBody String login(@RequestBody String dm) {
		Gson gson = new Gson();
		NguoiDungDTO oj = gson.fromJson(dm, NguoiDungDTO.class);

		NguoiDungDTO tim = dungService.findByIdnd(oj);
		String json = new Gson().toJson(tim);
		return json;

	}

}
