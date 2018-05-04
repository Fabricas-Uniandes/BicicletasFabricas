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
public class ConvenioDAO extends MedioDePago {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Retorna una lista con los Convenio que se encuentran en la base de datos.
	 * 
	 * @return lista de Convenio
	 * @generated
	 */
	public List<Convenio> obtenerTodos() {
		return em.createNamedQuery("Convenio.obtenerTodos").getResultList();
	}

	/**
	 * Obtiene Convenio dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Convenio
	 * @return Convenio del id dado
	 * @generated
	 */
	public Convenio obtener(Long id) {
		return em.find(Convenio.class, id);
	}

	/**
	 * Almacena la informacion de Convenio
	 * 
	 * @param entidad
	 *            Convenio a guardar
	 * @return Convenio con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Convenio guardar(Convenio entidad) {
		em.persist(entidad);
		return entidad;
	}

	/**
	 * Elimina el registro Convenio con el identificador dado.
	 * 
	 * @param id
	 *            identificador del Convenio
	 * @generated
	 */
	public void borrar(Long id) {
		em.remove(em.find(Convenio.class, id));
	}

	/**
	 * Actualiza la informacion de Convenio.
	 * 
	 * @param entidad
	 *            Convenio a actualizar
	 * @generated
	 */
	public void actualizar(Convenio entidad) {
		em.merge(entidad);
	}

}
