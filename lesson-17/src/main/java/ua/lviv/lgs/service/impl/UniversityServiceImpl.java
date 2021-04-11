package ua.lviv.lgs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.UniversityRepository;
import ua.lviv.lgs.domain.University;
import ua.lviv.lgs.service.UniversityService;


@Service
public class UniversityServiceImpl implements UniversityService{
	
	@Autowired
	private UniversityRepository universityRepository;

	@Override
	public University save(University university) {
		
		return universityRepository.save(university);
	}

	@Override
	public University findById(int Id) {
		
		return universityRepository.getOne(Id);
	}

	@Override
	public University update(University university) {
		
		return universityRepository.save(university);
	}

	@Override
	public void deleteById(int id) {
		universityRepository.deleteById(id);
	}

	@Override
	public List<University> findAll() {
		
		return universityRepository.findAll();
	}

	@Override
	public University findByName(String name) {
		
		return universityRepository.findByName(name);
	}

	@Override
	public List<University> findByNumberStudents(int numberStudents) {
		
		return universityRepository.findbyNumberStudents(numberStudents);
	}

}
