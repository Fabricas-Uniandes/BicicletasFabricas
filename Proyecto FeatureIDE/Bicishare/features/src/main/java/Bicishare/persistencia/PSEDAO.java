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
public class PSEDAO extends MedioDePago {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los PSE que se encuentran en la base de datos.
	 * @return lista de PSE
	 * @generated
	 */
	public List<PSE> obtenerTodos(){
		return em.createNamedQuery("PSE.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene PSE dado su identificador. 	
	 * @param id identificador del elemento PSE
	 * @return PSE del id dado
	 * @generated
	 */
	public PSE obtener(Long id){
		return em.find(PSE.class, id);
	}
	
	
	/**
	 * Almacena la informacion de PSE
	 * @param entidad PSE a guardar
	 * @return PSE con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public PSE guardar(PSE entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro PSE con el identificador dado.
	 * @param id identificador del PSE
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(PSE.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de PSE.
	 * @param entidad PSE a actualizar
	 * @generated
	 */
	public void actualizar(PSE entidad){
		em.merge(entidad);
	}
	
	
}
