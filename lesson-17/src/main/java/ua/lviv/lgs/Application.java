package ua.lviv.lgs;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.domain.University;
import ua.lviv.lgs.service.UniversityService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		UniversityService universityService = ctx.getBean(UniversityService.class);
		
		University university1 = new University();
		university1.setName("Університет 1");
		university1.setAcredLevel(5);
		university1.setNumberInstitute(7);
		university1.setNumberStudents(5000);
		university1.setAddress("Адреса 1");
		universityService.save(university1);
		
		University university2 = new University();
		university2.setName("Університет 2");
		university2.setAcredLevel(6);
		university2.setNumberInstitute(8);
		university2.setNumberStudents(6000);
		university2.setAddress("Адреса 2");
		universityService.save(university2);
		
		University university3 = new University();
		university3.setName("Університет 3");
		university3.setAcredLevel(4);
		university3.setNumberInstitute(8);
		university3.setNumberStudents(4000);
		university3.setAddress("Адреса 3");
		universityService.save(university3);
		
		University university4 = new University();
		university4.setName("Університет 4");
		university4.setAcredLevel(5);
		university4.setNumberInstitute(4);
		university4.setNumberStudents(8000);
		university4.setAddress("Адреса 4");
		universityService.save(university4);
		
		University university5 = new University();
		university5.setName("Університет 5");
		university5.setAcredLevel(6);
		university5.setNumberInstitute(7);
		university5.setNumberStudents(2000);
		university5.setAddress("Адреса 5");
		universityService.save(university5);
		
		
		System.out.println(universityService.findById(1));

		System.out.println(universityService.findByNumberStudents(6000));
		
		University university = universityService.findByName("Університет 5");
		
		universityService.update(university);

		universityService.findAll().stream().forEach(System.out::println);
		
		universityService.deleteById(3);
		
		
	}

}
