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
public class PrestamoDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Prestamo que se encuentran en la base de datos.
	 * @return lista de Prestamo
	 * @generated
	 */
	public List<Prestamo> obtenerTodos(){
		return em.createNamedQuery("Prestamo.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Prestamo dado su identificador. 	
	 * @param id identificador del elemento Prestamo
	 * @return Prestamo del id dado
	 * @generated
	 */
	public Prestamo obtener(Long id){
		return em.find(Prestamo.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Prestamo
	 * @param entidad Prestamo a guardar
	 * @return Prestamo con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Prestamo guardar(Prestamo entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Prestamo con el identificador dado.
	 * @param id identificador del Prestamo
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Prestamo.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Prestamo.
	 * @param entidad Prestamo a actualizar
	 * @generated
	 */
	public void actualizar(Prestamo entidad){
		em.merge(entidad);
	}
	
	
}
