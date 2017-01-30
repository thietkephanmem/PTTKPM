package dao;

import java.util.List;

import model.PhanQuyenDTO;

public interface PhanQuyenDAO {
	public List<PhanQuyenDTO> getAll();
	public void createPhanQuyen(PhanQuyenDTO pq);

}
