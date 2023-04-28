package tn.esprit.spring.services;


import java.util.List;


import tn.esprit.spring.entities.Employe;

import tn.esprit.spring.entities.Role;




public interface IEmployeService {
	
	

	public Employe getEmployeeById(int employeId);
	public Integer addEmploye(Employe employe);
	public Employe updateEmploye(Employe em);
	public List<Employe> retrieveAllEmployes();
	public int deleteEmployeById(int employeId);
	

	
	

	
}
