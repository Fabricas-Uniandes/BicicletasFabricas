package Bicishare.persistencia.entity;

import javax.persistence.*;

/**
 *
 * @author eaperador
 * @generated
 */
@Entity
@Table(name = "LogroCliente") // , schema="${schema}")
@NamedQueries({
  @NamedQuery(name = "LogroCliente.obtenerTodos", query = "select e from LogroCliente e"),
  @NamedQuery(name = "LogroCliente.obtenerTodosPorUsuario", query = "select e from LogroCliente e "
          + "where e.biciusuario.id = :userId")
})
public class LogroCliente {

  /**
   * Identificador de la tabla Logro.
   */
  @Id
  // @Column(name = "Logro_id")
  @GeneratedValue(generator = "LogroClienteGen", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "LogroClienteGen", sequenceName = "LogroCliente_SEQ", allocationSize = 1)
  private Long id;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @generated 0--1-true
   */
  @ManyToOne(cascade = {}, fetch = javax.persistence.FetchType.LAZY)
  private Logro logro;

  /**
   * @generated 0--1-true
   */
  @ManyToOne(cascade = {}, fetch = javax.persistence.FetchType.LAZY)
  private Biciusuario biciusuario;

  public Logro getLogro() {
    return logro;
  }

  public void setLogro(Logro logro) {
    this.logro = logro;
  }

  public Biciusuario getBiciusuario() {
    return biciusuario;
  }

  public void setBiciusuario(Biciusuario biciusuario) {
    this.biciusuario = biciusuario;
  }
}
