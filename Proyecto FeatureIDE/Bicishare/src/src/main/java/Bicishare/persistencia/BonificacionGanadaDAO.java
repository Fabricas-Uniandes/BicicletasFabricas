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
public class BonificacionGanadaDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los BonificacionGanada que se encuentran en la base de datos.
	 * @return lista de BonificacionGanada
	 * @generated
	 */
	public List<BonificacionGanada> obtenerTodos(){
		return em.createNamedQuery("BonificacionGanada.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene BonificacionGanada dado su identificador. 	
	 * @param id identificador del elemento BonificacionGanada
	 * @return BonificacionGanada del id dado
	 * @generated
	 */
	public BonificacionGanada obtener(Long id){
		return em.find(BonificacionGanada.class, id);
	}
	
	
	/**
	 * Almacena la informacion de BonificacionGanada
	 * @param entidad BonificacionGanada a guardar
	 * @return BonificacionGanada con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public BonificacionGanada guardar(BonificacionGanada entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro BonificacionGanada con el identificador dado.
	 * @param id identificador del BonificacionGanada
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(BonificacionGanada.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de BonificacionGanada.
	 * @param entidad BonificacionGanada a actualizar
	 * @generated
	 */
	public void actualizar(BonificacionGanada entidad){
		em.merge(entidad);
	}
	
	
}
