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
public class BicicletaDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Bicicleta que se encuentran en la base de datos.
	 * @return lista de Bicicleta
	 * @generated
	 */
	public List<Bicicleta> obtenerTodos(){
		return em.createNamedQuery("Bicicleta.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Bicicleta dado su identificador. 	
	 * @param id identificador del elemento Bicicleta
	 * @return Bicicleta del id dado
	 * @generated
	 */
	public Bicicleta obtener(Long id){
		return em.find(Bicicleta.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Bicicleta
	 * @param entidad Bicicleta a guardar
	 * @return Bicicleta con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Bicicleta guardar(Bicicleta entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Bicicleta con el identificador dado.
	 * @param id identificador del Bicicleta
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Bicicleta.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Bicicleta.
	 * @param entidad Bicicleta a actualizar
	 * @generated
	 */
	public void actualizar(Bicicleta entidad){
		em.merge(entidad);
	}
	
	
}
