import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class tester {
	
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=factory.createEntityManager();
		entityManager.getTransaction().begin();
		employee employee=new employee();
		employee.setName("Fromjpa");
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();

	}
	

}
