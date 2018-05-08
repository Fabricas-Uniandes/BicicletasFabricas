package Bicishare.persistencia;

import Bicishare.persistencia.entity.*;
import java.util.List;
import javax.persistence.*;
import javax.ejb.Stateless;

@Stateless
public class BancoDAO {
	@PersistenceContext
	private EntityManager em;

	public List<Banco> obtenerTodos() {
		return em.createNamedQuery("Banco.obtenerTodos").getResultList();
	}

	/**
	 * Obtiene Banco dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Banco
	 * @return Banco del id dado
	 */
	public Banco obtener(Long id) {
		return em.find(Banco.class, id);
	}

	/**
	 * Almacena la informacion de Banco
	 * 
	 * @param entidad
	 *            Banco a guardar
	 * @return Banco con los cambios realizados por el proceso de guardar
	 */
	public Banco guardar(Banco entidad) {
		em.persist(entidad);
		return entidad;
	}

	/**
	 * Elimina el registro Banco con el identificador dado.
	 * 
	 * @param id
	 *            identificador del Banco
	 */
	public void borrar(Long id) {
		em.remove(em.find(Banco.class, id));
	}

	/**
	 * Actualiza la informacion de Banco.
	 * 
	 * @param entidad
	 *            Banco a actualizar
	 */
	public void actualizar(Banco entidad) {
		em.merge(entidad);
	}
}
