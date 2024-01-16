package fa.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.training.entities.Dto;
import fa.training.repository.KhachHangRepository;

@Service
public class DtoService {
	
	@Autowired
	private KhachHangRepository khachHangRepository ;

	public List<Dto> listAll() {
		List<Dto> listDto = new ArrayList<Dto>();
		listDto = khachHangRepository.getData();
		return listDto;
		
	}
}
