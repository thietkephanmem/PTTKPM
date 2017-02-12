package service;

import java.util.List;

import model.NhaSanXuatDTO;

public interface NhaSanXuatService {
	public List<NhaSanXuatDTO> getAll();
	public void deletensanx(NhaSanXuatDTO nsx);
	public void createNSanXuat(NhaSanXuatDTO nsx);
}
