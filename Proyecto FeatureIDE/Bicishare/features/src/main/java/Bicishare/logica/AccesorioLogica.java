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
public class AccesorioLogica {

  @EJB
  private AccesorioDAO persistencia;

  /**
   * Retorna una lista con los Accesorio que se encuentran en la base de datos
   *
   * @return retorna una lista de AccesorioDTO
   * @generated
   */
  public List<AccesorioDTO> obtenerTodos() {
    return convertirEntidad(persistencia.obtenerTodos());
  }

  /**
   * Obtiene Accesorio dado su identificador.
   *
   * @param id identificador del elemento Accesorio
   * @return Accesorio del id dado
   * @generated
   */
  public AccesorioDTO obtener(Long id) {
    return convertirEntidad(persistencia.obtener(id));
  }

  /**
   * Almacena la informacion de Accesorio
   *
   * @param dto Accesorio a guardar
   * @return Accesorio con los cambios realizados por el proceso de guardar
   * @generated
   */
  public AccesorioDTO guardar(AccesorioDTO dto) {
    return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
  }

  /**
   * Elimina el registro Accesorio con el identificador dado
   *
   * @param id identificador del Accesorio
   * @generated
   */
  public void borrar(Long id) {
    persistencia.borrar(id);
  }

  /**
   * Actualiza la informacion de Accesorio
   *
   * @param dto Accesorio a guardar
   * @generated
   */
  public void actualizar(AccesorioDTO dto) {
    persistencia.actualizar(convertirDTO(dto));
  }

  /**
   * Convierte un AccesorioDTO en la entidad Accesorio.
   *
   * @param dto a convertir
   * @return entidad Accesorio
   * @generated
   */
  public Accesorio convertirDTO(AccesorioDTO dto) {
    if (dto == null) {
      return null;
    }
    Accesorio entidad = new Accesorio();
    entidad.setId(dto.getId());
    entidad.setNombre(dto.getNombre());
    entidad.setTipo(dto.getTipo());
    entidad.setFoto(dto.getFoto());
    /*if[Pago]*/
    entidad.setPrecio(dto.getPrecio());
    /*end[Pago]*/
    return entidad;
  }

  /**
   * Convierte una lista de AccesorioDTO en una lista de Accesorio.
   *
   * @param dtos a convertir
   * @return entidades List<Accesorio>
   * @generated
   */
  public List<Accesorio> convertirDTO(List<AccesorioDTO> dtos) {
    List<Accesorio> entidades = new ArrayList<Accesorio>();
    for (AccesorioDTO dto : dtos) {
      entidades.add(convertirDTO(dto));
    }
    return entidades;
  }

  /**
   * Convierte Accesorio en un DTO AccesorioDTO.
   *
   * @param entidad a convertir
   * @return dto AccesorioDTO
   * @generated
   */
  public AccesorioDTO convertirEntidad(Accesorio entidad) {
    AccesorioDTO dto = new AccesorioDTO();
    dto.setId(entidad.getId());
    dto.setNombre(entidad.getNombre());
    dto.setTipo(entidad.getTipo());
    dto.setFoto(entidad.getFoto());
    /*if[Pago]*/
    dto.setPrecio(entidad.getPrecio());
    /*end[Pago]*/
    return dto;
  }

  /**
   * Convierte una lista de Accesorio en una lista de AccesorioDTO.
   *
   * @param entidades a convertir
   * @return dtos List<AccesorioDTO>
   * @generated
   */
  public List<AccesorioDTO> convertirEntidad(List<Accesorio> entidades) {
    List<AccesorioDTO> dtos = new ArrayList<AccesorioDTO>();
    for (Accesorio entidad : entidades) {
      dtos.add(convertirEntidad(entidad));
    }
    return dtos;
  }

}
