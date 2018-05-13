package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 * @generated @author eaperador
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LogroDTO {

  public LogroDTO() {
    // constructor base
  }

  public LogroDTO(Long id) {
    this.id = id;
  }

  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @generated
   */
  private String nombre;

  /**
   * @generated
   */
  private Integer valor;

  private String imagen;

  /**
   * @return @generated
   */
  public String getNombre() {
    return this.nombre;
  }

  /**
   * @param @generated
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * @return @generated
   */
  public Integer getValor() {
    return this.valor;
  }

  /**
   * @param @generated
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
