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
public class TarjetaCreditoDAO extends MedioDePago {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los TarjetaCredito que se encuentran en la base de datos.
	 * @return lista de TarjetaCredito
	 * @generated
	 */
	public List<TarjetaCredito> obtenerTodos(){
		return em.createNamedQuery("TarjetaCredito.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene TarjetaCredito dado su identificador. 	
	 * @param id identificador del elemento TarjetaCredito
	 * @return TarjetaCredito del id dado
	 * @generated
	 */
	public TarjetaCredito obtener(Long id){
		return em.find(TarjetaCredito.class, id);
	}
	
	
	/**
	 * Almacena la informacion de TarjetaCredito
	 * @param entidad TarjetaCredito a guardar
	 * @return TarjetaCredito con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public TarjetaCredito guardar(TarjetaCredito entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro TarjetaCredito con el identificador dado.
	 * @param id identificador del TarjetaCredito
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(TarjetaCredito.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de TarjetaCredito.
	 * @param entidad TarjetaCredito a actualizar
	 * @generated
	 */
	public void actualizar(TarjetaCredito entidad){
		em.merge(entidad);
	}
	
	
}
