
package tn.esprit.spring.service;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.util.List;






import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;

import tn.esprit.spring.services.IEmployeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeServiceImplTest {
	
	Integer idE;
	@Autowired 
	IEmployeService us;
	
	
	@Test
	public void testAjouterEmploye()  {      
		 idE=us.addEmploye(new Employe("gaied", "mohamed","mohamed@esprit.tn","123456", Role.INGENIEUR));
		assertNotNull(idE);
	}
	
	@Test
	public void testRetrieveAllEmployes() {
		List<Employe> listEmployes = us.retrieveAllEmployes(); 
		 
		assertEquals(4, listEmployes.size());
	}

	@Test
	public void testModifyEmploye() {
		
		Employe u = new Employe("gaied", "mohamed","test@esprit.tn","12345", Role.INGENIEUR); 
		Employe userUpdated  = us.updateEmploye(u); 
		assertEquals(u.getPrenom(), userUpdated.getPrenom());
	}
		
	@Test
	public void testGetEmployeById() {
		Employe e =us.getEmployeeById(2); 
		assertEquals(2, e.getId());
	}
	
	@Test
	public void testDeleteEmployeById()
	{
		if(idE!=null){
		int i = us.deleteEmployeById(idE);
		
		assertEquals(0, i);}
		else {
			int i = us.deleteEmployeById(1);
			
			assertEquals(0, i);}
	}
}
    

