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
public class PagoDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Pago que se encuentran en la base de datos.
	 * @return lista de Pago
	 * @generated
	 */
	public List<Pago> obtenerTodos(){
		return em.createNamedQuery("Pago.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Pago dado su identificador. 	
	 * @param id identificador del elemento Pago
	 * @return Pago del id dado
	 * @generated
	 */
	public Pago obtener(Long id){
		return em.find(Pago.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Pago
	 * @param entidad Pago a guardar
	 * @return Pago con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Pago guardar(Pago entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Pago con el identificador dado.
	 * @param id identificador del Pago
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Pago.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Pago.
	 * @param entidad Pago a actualizar
	 * @generated
	 */
	public void actualizar(Pago entidad){
		em.merge(entidad);
	}
	
	
}
