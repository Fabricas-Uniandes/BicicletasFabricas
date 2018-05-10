package Bicishare.persistencia.entity;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/**
 *
 * @author eaperador
 * @generated
 */
@Entity
@Table(name = "Logro") // , schema="${schema}")
@NamedQueries({
  @NamedQuery(name = "Logro.obtenerTodos", query = "select e from Logro e")})
public class Logro {

  /**
   * Identificador de la tabla Logro.
   */
  @Id
  // @Column(name = "Logro_id")
  @GeneratedValue(generator = "LogroGen", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "LogroGen", sequenceName = "Logro_SEQ", allocationSize = 1)
  private Long id;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @generated 1-1-false
   */
  // @Column(name = "nombre")
  private String nombre;

  /**
   * @generated 1-1-false
   */
  // @Column(name = "valor")
  private Integer valor;

  private String imagen;
  /**
   * @generated
   */
  public String getNombre() {
    return this.nombre;
  }

  /**
   * @generated
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * @generated
   */
  public Integer getValor() {
    return this.valor;
  }

  /**
   * @generated
   */
  public void setValor(Integer valor) {
    this.valor = valor;
  }

  public String getImagen() {
    return imagen;
  }

  public void setImagen(String imagen) {
    this.imagen = imagen;
  }

}
