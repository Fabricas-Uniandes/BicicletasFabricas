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
public class AccesorioDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Retorna una lista con los Accesorio que se encuentran en la base de datos.
	 * 
	 * @return lista de Accesorio
	 * @generated
	 */
	public List<Accesorio> obtenerTodos() {
		return em.createNamedQuery("Accesorio.obtenerTodos").getResultList();
	}

	/**
	 * Obtiene Accesorio dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Accesorio
	 * @return Accesorio del id dado
	 * @generated
	 */
	public Accesorio obtener(Long id) {
		return em.find(Accesorio.class, id);
	}

	/**
	 * Almacena la informacion de Accesorio
	 * 
	 * @param entidad
	 *            Accesorio a guardar
	 * @return Accesorio con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Accesorio guardar(Accesorio entidad) {
		em.persist(entidad);
		return entidad;
	}

	/**
	 * Elimina el registro Accesorio con el identificador dado.
	 * 
	 * @param id
	 *            identificador del Accesorio
	 * @generated
	 */
	public void borrar(Long id) {
		em.remove(em.find(Accesorio.class, id));
	}

	/**
	 * Actualiza la informacion de Accesorio.
	 * 
	 * @param entidad
	 *            Accesorio a actualizar
	 * @generated
	 */
	public void actualizar(Accesorio entidad) {
		em.merge(entidad);
	}

}
