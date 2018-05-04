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
public class UsuarioDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Retorna una lista con los Usuario que se encuentran en la base de datos.
	 * 
	 * @return lista de Usuario
	 * @generated
	 */
	public List<Usuario> obtenerTodos() {
		return em.createNamedQuery("Usuario.obtenerTodos").getResultList();
	}

	/**
	 * Obtiene Usuario dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Usuario
	 * @return Usuario del id dado
	 * @generated
	 */
	public Usuario obtener(Long id) {
		return em.find(Usuario.class, id);
	}

	/**
	 * Almacena la informacion de Usuario
	 * 
	 * @param entidad
	 *            Usuario a guardar
	 * @return Usuario con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Usuario guardar(Usuario entidad) {
		em.persist(entidad);
		return entidad;
	}

	/**
	 * Elimina el registro Usuario con el identificador dado.
	 * 
	 * @param id
	 *            identificador del Usuario
	 * @generated
	 */
	public void borrar(Long id) {
		em.remove(em.find(Usuario.class, id));
	}

	/**
	 * Actualiza la informacion de Usuario.
	 * 
	 * @param entidad
	 *            Usuario a actualizar
	 * @generated
	 */
	public void actualizar(Usuario entidad) {
		em.merge(entidad);
	}

}
