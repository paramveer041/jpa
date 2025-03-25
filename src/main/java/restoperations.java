import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;

public class restoperations {
	public static void main(String[] args) {
		
	
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=factory.createEntityManager();
		Query query=(Query) entityManager.createQuery("from employee");
		List<employee> list=query.list();
		for(employee e:list)
		{
			System.out.println(e.getName());
		}
;		
		
		
		//entityManager.getTransaction().begin();
		//employee employee=entityManager.find(employee.class, 14);
		//employee.setName("fromjpaupdate");
		//entityManager.remove(employee);
		//entityManager.persist(employee);
	//	entityManager.getTransaction().commit();
		//entityManager.close();
		//factory.close();
		
		//System.out.println(employee.getName());

}
}