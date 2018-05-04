package Bicishare.logica;

import Bicishare.dto.*;
import Bicishare.persistencia.*;
import Bicishare.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * @generated
 * @author eaperador
 */
@Stateless
public class LogroLogica {

	@EJB
	private LogroDAO persistencia;

	/**
	 * Retorna una lista con los Logro que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de LogroDTO
	 * @generated
	 */
	public List<LogroDTO> obtenerTodos() {
		return convertirEntidad(persistencia.obtenerTodos());
	}

	/**
	 * Obtiene Logro dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Logro
	 * @return Logro del id dado
	 * @generated
	 */
	public LogroDTO obtener(Long id) {
		return convertirEntidad(persistencia.obtener(id));
	}

	/**
	 * Almacena la informacion de Logro
	 * 
	 * @param dto
	 *            Logro a guardar
	 * @return Logro con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public LogroDTO guardar(LogroDTO dto) {
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}

	/**
	 * Elimina el registro Logro con el identificador dado
	 * 
	 * @param id
	 *            identificador del Logro
	 * @generated
	 */
	public void borrar(Long id) {
		persistencia.borrar(id);
	}

	/**
	 * Actualiza la informacion de Logro
	 * 
	 * @param dto
	 *            Logro a guardar
	 * @generated
	 */
	public void actualizar(LogroDTO dto) {
		persistencia.actualizar(convertirDTO(dto));
	}

	/**
	 * Convierte un LogroDTO en la entidad Logro.
	 * 
	 * @param dto
	 *            a convertir
	 * @return entidad Logro
	 * @generated
	 */
	public Logro convertirDTO(LogroDTO dto) {
		if (dto == null)
			return null;
		Logro entidad = new Logro();
		entidad.setId(dto.getId());
		entidad.setNombre(dto.getNombre());
		entidad.setValor(dto.getValor());

		return entidad;
	}

	/**
	 * Convierte una lista de LogroDTO en una lista de Logro.
	 * 
	 * @param dtos
	 *            a convertir
	 * @return entidades List<Logro>
	 * @generated
	 */
	public List<Logro> convertirDTO(List<LogroDTO> dtos) {
		List<Logro> entidades = new ArrayList<Logro>();
		for (LogroDTO dto : dtos) {
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}

	/**
	 * Convierte Logro en un DTO LogroDTO.
	 * 
	 * @param entidad
	 *            a convertir
	 * @return dto LogroDTO
	 * @generated
	 */
	public LogroDTO convertirEntidad(Logro entidad) {
		LogroDTO dto = new LogroDTO();
		dto.setId(entidad.getId());
		dto.setNombre(entidad.getNombre());
		dto.setValor(entidad.getValor());

		return dto;
	}

	/**
	 * Convierte una lista de Logro en una lista de LogroDTO.
	 * 
	 * @param entidades
	 *            a convertir
	 * @return dtos List<LogroDTO>
	 * @generated
	 */
	public List<LogroDTO> convertirEntidad(List<Logro> entidades) {
		List<LogroDTO> dtos = new ArrayList<LogroDTO>();
		for (Logro entidad : entidades) {
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}

}
