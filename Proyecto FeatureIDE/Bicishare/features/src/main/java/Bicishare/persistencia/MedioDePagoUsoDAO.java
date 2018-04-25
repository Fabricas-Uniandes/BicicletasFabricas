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
public class MedioDePagoUsoDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los MedioDePagoUso que se encuentran en la base de datos.
	 * @return lista de MedioDePagoUso
	 * @generated
	 */
	public List<MedioDePagoUso> obtenerTodos(){
		return em.createNamedQuery("MedioDePagoUso.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene MedioDePagoUso dado su identificador. 	
	 * @param id identificador del elemento MedioDePagoUso
	 * @return MedioDePagoUso del id dado
	 * @generated
	 */
	public MedioDePagoUso obtener(Long id){
		return em.find(MedioDePagoUso.class, id);
	}
	
	
	/**
	 * Almacena la informacion de MedioDePagoUso
	 * @param entidad MedioDePagoUso a guardar
	 * @return MedioDePagoUso con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public MedioDePagoUso guardar(MedioDePagoUso entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro MedioDePagoUso con el identificador dado.
	 * @param id identificador del MedioDePagoUso
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(MedioDePagoUso.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de MedioDePagoUso.
	 * @param entidad MedioDePagoUso a actualizar
	 * @generated
	 */
	public void actualizar(MedioDePagoUso entidad){
		em.merge(entidad);
	}
	
	
}
