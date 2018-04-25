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
public class MarcaDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Marca que se encuentran en la base de datos.
	 * @return lista de Marca
	 * @generated
	 */
	public List<Marca> obtenerTodos(){
		return em.createNamedQuery("Marca.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Marca dado su identificador. 	
	 * @param id identificador del elemento Marca
	 * @return Marca del id dado
	 * @generated
	 */
	public Marca obtener(Long id){
		return em.find(Marca.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Marca
	 * @param entidad Marca a guardar
	 * @return Marca con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Marca guardar(Marca entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Marca con el identificador dado.
	 * @param id identificador del Marca
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Marca.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Marca.
	 * @param entidad Marca a actualizar
	 * @generated
	 */
	public void actualizar(Marca entidad){
		em.merge(entidad);
	}
	
	
}
