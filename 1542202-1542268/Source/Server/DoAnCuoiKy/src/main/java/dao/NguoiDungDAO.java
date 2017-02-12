package dao;

import model.NguoiDungDTO;

public interface NguoiDungDAO {
	public NguoiDungDTO findById(NguoiDungDTO nd);
	public void create(NguoiDungDTO nd);

}
