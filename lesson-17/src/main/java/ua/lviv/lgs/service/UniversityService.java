package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.domain.University;

public interface UniversityService {
	
	University save(University university);
	
	University findById(int Id);
	
	University update(University university);
	
	void deleteById(int id);
	
	List<University> findAll();
	
	University findByName(String name);
	
	List<University> findByNumberStudents(int numberStudents);

}
