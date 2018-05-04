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
public class LogroDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Retorna una lista con los Logro que se encuentran en la base de datos.
	 * 
	 * @return lista de Logro
	 * @generated
	 */
	public List<Logro> obtenerTodos() {
		return em.createNamedQuery("Logro.obtenerTodos").getResultList();
	}

	/**
	 * Obtiene Logro dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Logro
	 * @return Logro del id dado
	 * @generated
	 */
	public Logro obtener(Long id) {
		return em.find(Logro.class, id);
	}

	/**
	 * Almacena la informacion de Logro
	 * 
	 * @param entidad
	 *            Logro a guardar
	 * @return Logro con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Logro guardar(Logro entidad) {
		em.persist(entidad);
		return entidad;
	}

	/**
	 * Elimina el registro Logro con el identificador dado.
	 * 
	 * @param id
	 *            identificador del Logro
	 * @generated
	 */
	public void borrar(Long id) {
		em.remove(em.find(Logro.class, id));
	}

	/**
	 * Actualiza la informacion de Logro.
	 * 
	 * @param entidad
	 *            Logro a actualizar
	 * @generated
	 */
	public void actualizar(Logro entidad) {
		em.merge(entidad);
	}

}
