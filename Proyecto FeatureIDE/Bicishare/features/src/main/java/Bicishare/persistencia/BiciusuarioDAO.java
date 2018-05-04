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
public class BiciusuarioDAO extends Usuario {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Retorna una lista con los Biciusuario que se encuentran en la base de datos.
	 * 
	 * @return lista de Biciusuario
	 * @generated
	 */
	public List<Biciusuario> obtenerTodos() {
		return em.createNamedQuery("Biciusuario.obtenerTodos").getResultList();
	}

	/**
	 * Obtiene Biciusuario dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Biciusuario
	 * @return Biciusuario del id dado
	 * @generated
	 */
	public Biciusuario obtener(Long id) {
		return em.find(Biciusuario.class, id);
	}

	/**
	 * Almacena la informacion de Biciusuario
	 * 
	 * @param entidad
	 *            Biciusuario a guardar
	 * @return Biciusuario con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Biciusuario guardar(Biciusuario entidad) {
		em.persist(entidad);
		return entidad;
	}

	/**
	 * Elimina el registro Biciusuario con el identificador dado.
	 * 
	 * @param id
	 *            identificador del Biciusuario
	 * @generated
	 */
	public void borrar(Long id) {
		em.remove(em.find(Biciusuario.class, id));
	}

	/**
	 * Actualiza la informacion de Biciusuario.
	 * 
	 * @param entidad
	 *            Biciusuario a actualizar
	 * @generated
	 */
	public void actualizar(Biciusuario entidad) {
		em.merge(entidad);
	}

}
