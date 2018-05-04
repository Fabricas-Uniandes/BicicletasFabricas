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
public class ConvenioLogica extends MedioDePago {

	@EJB
	private ConvenioDAO persistencia;

	/**
	 * Retorna una lista con los Convenio que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de ConvenioDTO
	 * @generated
	 */
	public List<ConvenioDTO> obtenerTodos() {
		return convertirEntidad(persistencia.obtenerTodos());
	}

	/**
	 * Obtiene Convenio dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Convenio
	 * @return Convenio del id dado
	 * @generated
	 */
	public ConvenioDTO obtener(Long id) {
		return convertirEntidad(persistencia.obtener(id));
	}

	/**
	 * Almacena la informacion de Convenio
	 * 
	 * @param dto
	 *            Convenio a guardar
	 * @return Convenio con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public ConvenioDTO guardar(ConvenioDTO dto) {
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}

	/**
	 * Elimina el registro Convenio con el identificador dado
	 * 
	 * @param id
	 *            identificador del Convenio
	 * @generated
	 */
	public void borrar(Long id) {
		persistencia.borrar(id);
	}

	/**
	 * Actualiza la informacion de Convenio
	 * 
	 * @param dto
	 *            Convenio a guardar
	 * @generated
	 */
	public void actualizar(ConvenioDTO dto) {
		persistencia.actualizar(convertirDTO(dto));
	}

	/**
	 * Convierte un ConvenioDTO en la entidad Convenio.
	 * 
	 * @param dto
	 *            a convertir
	 * @return entidad Convenio
	 * @generated
	 */
	public Convenio convertirDTO(ConvenioDTO dto) {
		if (dto == null)
			return null;
		Convenio entidad = new Convenio();
		entidad.setId(dto.getId());
		entidad.setConfiguracion(dto.getConfiguracion());

		return entidad;
	}

	/**
	 * Convierte una lista de ConvenioDTO en una lista de Convenio.
	 * 
	 * @param dtos
	 *            a convertir
	 * @return entidades List<Convenio>
	 * @generated
	 */
	public List<Convenio> convertirDTO(List<ConvenioDTO> dtos) {
		List<Convenio> entidades = new ArrayList<Convenio>();
		for (ConvenioDTO dto : dtos) {
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}

	/**
	 * Convierte Convenio en un DTO ConvenioDTO.
	 * 
	 * @param entidad
	 *            a convertir
	 * @return dto ConvenioDTO
	 * @generated
	 */
	public ConvenioDTO convertirEntidad(Convenio entidad) {
		ConvenioDTO dto = new ConvenioDTO();
		dto.setId(entidad.getId());
		dto.setConfiguracion(entidad.getConfiguracion());

		return dto;
	}

	/**
	 * Convierte una lista de Convenio en una lista de ConvenioDTO.
	 * 
	 * @param entidades
	 *            a convertir
	 * @return dtos List<ConvenioDTO>
	 * @generated
	 */
	public List<ConvenioDTO> convertirEntidad(List<Convenio> entidades) {
		List<ConvenioDTO> dtos = new ArrayList<ConvenioDTO>();
		for (Convenio entidad : entidades) {
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}

}
