/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Efrai
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LogroClienteDTO {

  public LogroClienteDTO() {
  }
  
  private Long id;
  
  private BiciusuarioDTO biciusuario;
  
  private LogroDTO logro;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BiciusuarioDTO getBiciusuario() {
    return biciusuario;
  }

  public void setBiciusuario(BiciusuarioDTO biciusuario) {
    this.biciusuario = biciusuario;
  }

  public LogroDTO getLogro() {
    return logro;
  }

  public void setLogro(LogroDTO logro) {
    this.logro = logro;
  }
}
