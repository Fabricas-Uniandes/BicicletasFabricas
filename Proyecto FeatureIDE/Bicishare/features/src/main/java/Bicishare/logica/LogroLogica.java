package Bicishare.logica;

import Bicishare.dto.*;
import Bicishare.persistencia.*;
import Bicishare.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * @generated @author eaperador
 */
@Stateless
public class LogroLogica {
  
  @EJB
  private LogroClienteDAO persistencia;

  /**
   * Retorna una lista con los Logro que se encuentran en la base de datos
   *
   * @return retorna una lista de LogroDTO
   * @generated
   */
  public List<LogroClienteDTO> obtenerTodos() {
    return convertirEntidad(persistencia.obtenerTodos());
  }

  /**
   * Obtiene Logro dado su identificador.
   *
   * @param id identificador del elemento Logro
   * @return Logro del id dado
   * @generated
   */
  public LogroClienteDTO obtener(Long id) {
    return convertirEntidad(persistencia.obtener(id));
  }

  /**
   * Almacena la informacion de Logro
   *
   * @param dto Logro a guardar
   * @return Logro con los cambios realizados por el proceso de guardar
   * @generated
   */
  public LogroClienteDTO guardar(LogroClienteDTO dto) {
    return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
  }

  /**
   * Elimina el registro Logro con el identificador dado
   *
   * @param id identificador del Logro
   * @generated
   */
  public void borrar(Long id) {
    persistencia.borrar(id);
  }

  /**
   * Actualiza la informacion de Logro
   *
   * @param dto Logro a guardar
   * @generated
   */
  public void actualizar(LogroClienteDTO dto) {
    persistencia.actualizar(convertirDTO(dto));
  }

  /**
   * Convierte un LogroDTO en la entidad Logro.
   *
   * @param dto a convertir
   * @return entidad Logro
   * @generated
   */
  public LogroCliente convertirDTO(LogroClienteDTO dto) {
    if (dto == null) {
      return null;
    }
    LogroCliente entidad = new LogroCliente();
    entidad.setId(dto.getId());
    Biciusuario biciEntity = new Biciusuario();
    biciEntity.setId(dto.getBiciusuario().getId());
    entidad.setBiciusuario(biciEntity);
    
    Logro logroEntity = new Logro();
    logroEntity.setId(dto.getLogro().getId());
    entidad.setLogro(logroEntity);
    
    return entidad;
  }

  /**
   * Convierte una lista de LogroDTO en una lista de Logro.
   *
   * @param dtos a convertir
   * @return entidades List<Logro>
   * @generated
   */
  public List<LogroCliente> convertirDTO(List<LogroClienteDTO> dtos) {
    List<LogroCliente> entidades = new ArrayList<LogroCliente>();
    for (LogroClienteDTO dto : dtos) {
      entidades.add(convertirDTO(dto));
    }
    return entidades;
  }

  /**
   * Convierte Logro en un DTO LogroDTO.
   *
   * @param entidad a convertir
   * @return dto LogroDTO
   * @generated
   */
  public LogroClienteDTO convertirEntidad(LogroCliente entidad) {
    LogroClienteDTO dto = new LogroClienteDTO();
    dto.setId(entidad.getId());
    
    BiciusuarioDTO bicidto = new BiciusuarioDTO();
    bicidto.setId(entidad.getBiciusuario().getId());
    bicidto.setFoto(entidad.getBiciusuario().getFoto());
    bicidto.setNombre(entidad.getBiciusuario().getNombre());
    dto.setBiciusuario(bicidto);
    
    LogroDTO logrodto = new LogroDTO();
    logrodto.setId(entidad.getLogro().getId());
    logrodto.setImagen(entidad.getLogro().getImagen());
    logrodto.setNombre(entidad.getLogro().getNombre());
    logrodto.setValor(entidad.getLogro().getValor());
    dto.setLogro(logrodto);
    
    return dto;
  }

  /**
   * Convierte una lista de Logro en una lista de LogroDTO.
   *
   * @param entidades a convertir
   * @return dtos List<LogroDTO>
   * @generated
   */
  public List<LogroClienteDTO> convertirEntidad(List<LogroCliente> entidades) {
    List<LogroClienteDTO> dtos = new ArrayList<LogroClienteDTO>();
    for (LogroCliente entidad : entidades) {
      dtos.add(convertirEntidad(entidad));
    }
    return dtos;
  }
  
  public List<LogroClienteDTO> obtenerTodosPorUsuario(Long id) {
    return convertirEntidad(persistencia.obtenerTodosPorUsuario(id));
  }
  
}
