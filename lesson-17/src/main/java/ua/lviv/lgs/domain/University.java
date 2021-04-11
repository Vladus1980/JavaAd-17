package ua.lviv.lgs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class University {
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String name;
	@Column
	private int acredLevel;
	@Column
	private int numberInstitute;
	@Column
	private int numberStudents;
	@Column
	private String address;
	
	
	public University() {
		super();
	}


	public University(String name, int acredLevel, int numberInstitute, int numberStudents, String address) {
		super();
		this.name = name;
		this.acredLevel = acredLevel;
		this.numberInstitute = numberInstitute;
		this.numberStudents = numberStudents;
		this.address = address;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAcredLevel() {
		return acredLevel;
	}


	public void setAcredLevel(int acredLevel) {
		this.acredLevel = acredLevel;
	}


	public int getNumberInstitute() {
		return numberInstitute;
	}


	public void setNumberInstitute(int numberInstitute) {
		this.numberInstitute = numberInstitute;
	}


	public int getNumberStudents() {
		return numberStudents;
	}


	public void setNumberStudents(int numberStudents) {
		this.numberStudents = numberStudents;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", acredLevel=" + acredLevel + ", numberInstitute="
				+ numberInstitute + ", numberStudents=" + numberStudents + ", address=" + address + "]";
	}
	
	
	
	
	

}
