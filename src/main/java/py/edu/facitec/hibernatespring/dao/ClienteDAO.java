package py.edu.facitec.hibernatespring.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.hibernatespring.model.Cliente;
//para gestionar los datos
@Repository
public class ClienteDAO {
	
	


	@PersistenceContext
	private EntityManager manager;


	public void save(Cliente cliente){
		//para insertar un dato en la bd
	manager.persist(cliente);
	}


}
