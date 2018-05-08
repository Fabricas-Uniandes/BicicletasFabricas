package Bicishare.persistencia;

import Bicishare.persistencia.entity.*;
import java.util.List;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
 * @generated @author eaperador
 */
@Stateless
public class LogroClienteDAO {

  @PersistenceContext
  private EntityManager em;

  /**
   * Retorna una lista con los Logro que se encuentran en la base de datos.
   *
   * @return lista de Logro
   * @generated
   */
  public List<LogroCliente> obtenerTodos() {
    return em.createNamedQuery("LogroCliente.obtenerTodos").getResultList();
  }

  /**
   * Obtiene Logro dado su identificador.
   *
   * @param id identificador del elemento Logro
   * @return Logro del id dado
   * @generated
   */
  public LogroCliente obtener(Long id) {
    return em.find(LogroCliente.class, id);
  }

  /**
   * Almacena la informacion de Logro
   *
   * @param entidad Logro a guardar
   * @return Logro con los cambios realizados por el proceso de guardar
   * @generated
   */
  public LogroCliente guardar(LogroCliente entidad) {
    em.persist(entidad);
    return entidad;
  }

  /**
   * Elimina el registro Logro con el identificador dado.
   *
   * @param id identificador del Logro
   * @generated
   */
  public void borrar(Long id) {
    em.remove(em.find(LogroCliente.class, id));
  }

  /**
   * Actualiza la informacion de Logro.
   *
   * @param entidad Logro a actualizar
   * @generated
   */
  public void actualizar(LogroCliente entidad) {
    em.merge(entidad);
  }

  public List<LogroCliente> obtenerTodosPorUsuario(Long id) {
    return em.createNamedQuery("LogroCliente.obtenerTodosPorUsuario")
            .setParameter("userId", id)
            .getResultList();
  }

}
