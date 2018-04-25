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
@Table(name = "Proveedor")//, schema="${schema}")
@NamedQueries({
  @NamedQuery(name = "Proveedor.obtenerTodos", query = "select e from Proveedor e")
})
public class Proveedor {

  /**
   * Identificador de la tabla Proveedor.
   */
  @Id
  //@Column(name = "Proveedor_id")
  @GeneratedValue(generator = "ProveedorGen", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "ProveedorGen", sequenceName = "Proveedor_SEQ", allocationSize = 1)
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
  //@Column(name = "nombre")
  private String nombre;

  /**
   * @generated 1--1-true
   */
  @OneToMany(cascade = {}, fetch = javax.persistence.FetchType.LAZY)
  private List<Bicicleta> bicicletas;

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

  public List<Bicicleta> getBicicletas() {
    if (bicicletas != null) {
      bicicletas = new ArrayList<Bicicleta>();
    }
    return this.bicicletas;
  }

  public void setBicicletas(List<Bicicleta> bicicletas) {
    this.bicicletas = bicicletas;
  }

}
