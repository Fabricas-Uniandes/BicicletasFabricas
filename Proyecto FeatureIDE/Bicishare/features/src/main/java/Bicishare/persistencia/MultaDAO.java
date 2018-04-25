package Bicishare.persistencia;

import Bicishare.persistencia.entity.*;
import java.util.List;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
 *  @generated
 *  @author eaperador
 */
@Stateless
public class MultaDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Multa que se encuentran en la base de datos.
	 * @return lista de Multa
	 * @generated
	 */
	public List<Multa> obtenerTodos(){
		return em.createNamedQuery("Multa.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Multa dado su identificador. 	
	 * @param id identificador del elemento Multa
	 * @return Multa del id dado
	 * @generated
	 */
	public Multa obtener(Long id){
		return em.find(Multa.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Multa
	 * @param entidad Multa a guardar
	 * @return Multa con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Multa guardar(Multa entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Multa con el identificador dado.
	 * @param id identificador del Multa
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Multa.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Multa.
	 * @param entidad Multa a actualizar
	 * @generated
	 */
	public void actualizar(Multa entidad){
		em.merge(entidad);
	}
	
	
}
