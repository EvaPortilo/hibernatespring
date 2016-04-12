package py.edu.facitec.hibernatespring.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.hibernatespring.dao.ClienteDAO;
import py.edu.facitec.hibernatespring.model.Cliente;

@Transactional
@Controller//en vez del archivo .xml
public class ClienteController {
				//yya viene con datos cargados
				//mediante spring
	

		@Autowired //crea un objeto
		private ClienteDAO clienteDAO;

		@RequestMapping("/cliente")
		public String save(Cliente cliente){

		System.out.println("Registrando el cliente: "+cliente);
		clienteDAO.save(cliente);

		return "/cliente/ok";
		}
		@RequestMapping("/cliente/formulario")
		public String formulario(){


		return "/cliente/formulario";
		}


}
