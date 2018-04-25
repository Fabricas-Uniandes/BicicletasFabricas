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
public class ProveedorDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Proveedor que se encuentran en la base de datos.
	 * @return lista de Proveedor
	 * @generated
	 */
	public List<Proveedor> obtenerTodos(){
		return em.createNamedQuery("Proveedor.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Proveedor dado su identificador. 	
	 * @param id identificador del elemento Proveedor
	 * @return Proveedor del id dado
	 * @generated
	 */
	public Proveedor obtener(Long id){
		return em.find(Proveedor.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Proveedor
	 * @param entidad Proveedor a guardar
	 * @return Proveedor con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Proveedor guardar(Proveedor entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Proveedor con el identificador dado.
	 * @param id identificador del Proveedor
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Proveedor.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Proveedor.
	 * @param entidad Proveedor a actualizar
	 * @generated
	 */
	public void actualizar(Proveedor entidad){
		em.merge(entidad);
	}
	
	
}
