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
public class BonificacionDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Retorna una lista con los Bonificacion que se encuentran en la base de datos.
	 * 
	 * @return lista de Bonificacion
	 * @generated
	 */
	public List<Bonificacion> obtenerTodos() {
		return em.createNamedQuery("Bonificacion.obtenerTodos").getResultList();
	}

	/**
	 * Obtiene Bonificacion dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Bonificacion
	 * @return Bonificacion del id dado
	 * @generated
	 */
	public Bonificacion obtener(Long id) {
		return em.find(Bonificacion.class, id);
	}

	/**
	 * Almacena la informacion de Bonificacion
	 * 
	 * @param entidad
	 *            Bonificacion a guardar
	 * @return Bonificacion con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Bonificacion guardar(Bonificacion entidad) {
		em.persist(entidad);
		return entidad;
	}

	/**
	 * Elimina el registro Bonificacion con el identificador dado.
	 * 
	 * @param id
	 *            identificador del Bonificacion
	 * @generated
	 */
	public void borrar(Long id) {
		em.remove(em.find(Bonificacion.class, id));
	}

	/**
	 * Actualiza la informacion de Bonificacion.
	 * 
	 * @param entidad
	 *            Bonificacion a actualizar
	 * @generated
	 */
	public void actualizar(Bonificacion entidad) {
		em.merge(entidad);
	}

}
