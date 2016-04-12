package py.edu.facitec.hibernatespring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//Para indcar que se trata de un modelo a persistir en la bd
@Entity
public class Cliente {
	//Para indicar que se trata de una case primaria
	@Id
	@GeneratedValue// generacion automatica de codigo
	private Integer id;
	private String  nombre;
	private String correo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", correo=" + correo + "]";
	}
	
	
	

}
