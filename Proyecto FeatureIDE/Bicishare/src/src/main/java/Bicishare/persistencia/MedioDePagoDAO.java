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
public class MedioDePagoDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los MedioDePago que se encuentran en la base de datos.
	 * @return lista de MedioDePago
	 * @generated
	 */
	public List<MedioDePago> obtenerTodos(){
		return em.createNamedQuery("MedioDePago.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene MedioDePago dado su identificador. 	
	 * @param id identificador del elemento MedioDePago
	 * @return MedioDePago del id dado
	 * @generated
	 */
	public MedioDePago obtener(Long id){
		return em.find(MedioDePago.class, id);
	}
	
	
	/**
	 * Almacena la informacion de MedioDePago
	 * @param entidad MedioDePago a guardar
	 * @return MedioDePago con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public MedioDePago guardar(MedioDePago entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro MedioDePago con el identificador dado.
	 * @param id identificador del MedioDePago
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(MedioDePago.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de MedioDePago.
	 * @param entidad MedioDePago a actualizar
	 * @generated
	 */
	public void actualizar(MedioDePago entidad){
		em.merge(entidad);
	}
	
	
}
