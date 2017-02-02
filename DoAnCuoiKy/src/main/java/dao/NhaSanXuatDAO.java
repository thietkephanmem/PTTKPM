package dao;

import java.util.List;

import model.NhaSanXuatDTO;

public interface NhaSanXuatDAO {
	public List<NhaSanXuatDTO> getAll();
	public void deletensx(NhaSanXuatDTO nsx);

}
