package service;

import model.NguoiDungDTO;

public interface NguoiDungService {
	public NguoiDungDTO findByIdnd(NguoiDungDTO nd);
	public void creatend(NguoiDungDTO nd);
}
