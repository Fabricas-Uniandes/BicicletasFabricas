package Bicishare.persistencia;

import Bicishare.persistencia.entity.*;
import java.util.List;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
 * @generated
 * @author eaperador
 */
@Stateless
public class EfectivoDAO extends MedioDePago {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Retorna una lista con los Efectivo que se encuentran en la base de datos.
	 * 
	 * @return lista de Efectivo
	 * @generated
	 */
	public List<Efectivo> obtenerTodos() {
		return em.createNamedQuery("Efectivo.obtenerTodos").getResultList();
	}

	/**
	 * Obtiene Efectivo dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Efectivo
	 * @return Efectivo del id dado
	 * @generated
	 */
	public Efectivo obtener(Long id) {
		return em.find(Efectivo.class, id);
	}

	/**
	 * Almacena la informacion de Efectivo
	 * 
	 * @param entidad
	 *            Efectivo a guardar
	 * @return Efectivo con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Efectivo guardar(Efectivo entidad) {
		em.persist(entidad);
		return entidad;
	}

	/**
	 * Elimina el registro Efectivo con el identificador dado.
	 * 
	 * @param id
	 *            identificador del Efectivo
	 * @generated
	 */
	public void borrar(Long id) {
		em.remove(em.find(Efectivo.class, id));
	}

	/**
	 * Actualiza la informacion de Efectivo.
	 * 
	 * @param entidad
	 *            Efectivo a actualizar
	 * @generated
	 */
	public void actualizar(Efectivo entidad) {
		em.merge(entidad);
	}

}
