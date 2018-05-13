/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bicishare.persistencia;

import Bicishare.persistencia.entity.Logro;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Efrai
 */
@Stateless
public class LogroDAO {
  
	@PersistenceContext
	private EntityManager em;

	/**
	 * Retorna una lista con los Logro que se encuentran en la base de datos.
	 * 
	 * @return lista de Logro
	 * @generated
	 */
	public List<Logro> obtenerTodos() {
		return em.createNamedQuery("Logro.obtenerTodos").getResultList();
	}

	/**
	 * Obtiene Logro dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Logro
	 * @return Logro del id dado
	 * @generated
	 */
	public Logro obtener(Long id) {
		return em.find(Logro.class, id);
	}

	/**
	 * Almacena la informacion de Logro
	 * 
	 * @param entidad
	 *            Logro a guardar
	 * @return Logro con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Logro guardar(Logro entidad) {
		em.persist(entidad);
		return entidad;
	}

	/**
	 * Elimina el registro Logro con el identificador dado.
	 * 
	 * @param id
	 *            identificador del Logro
	 * @generated
	 */
	public void borrar(Long id) {
		em.remove(em.find(Logro.class, id));
	}

	/**
	 * Actualiza la informacion de Logro.
	 * 
	 * @param entidad
	 *            Logro a actualizar
	 * @generated
	 */
	public void actualizar(Logro entidad) {
		em.merge(entidad);
	}
}
