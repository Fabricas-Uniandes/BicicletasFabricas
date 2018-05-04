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
public class BonificacionLogica {

	@EJB
	private BonificacionDAO persistencia;

	/**
	 * Retorna una lista con los Bonificacion que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de BonificacionDTO
	 * @generated
	 */
	public List<BonificacionDTO> obtenerTodos() {
		return convertirEntidad(persistencia.obtenerTodos());
	}

	/**
	 * Obtiene Bonificacion dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Bonificacion
	 * @return Bonificacion del id dado
	 * @generated
	 */
	public BonificacionDTO obtener(Long id) {
		return convertirEntidad(persistencia.obtener(id));
	}

	/**
	 * Almacena la informacion de Bonificacion
	 * 
	 * @param dto
	 *            Bonificacion a guardar
	 * @return Bonificacion con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public BonificacionDTO guardar(BonificacionDTO dto) {
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}

	/**
	 * Elimina el registro Bonificacion con el identificador dado
	 * 
	 * @param id
	 *            identificador del Bonificacion
	 * @generated
	 */
	public void borrar(Long id) {
		persistencia.borrar(id);
	}

	/**
	 * Actualiza la informacion de Bonificacion
	 * 
	 * @param dto
	 *            Bonificacion a guardar
	 * @generated
	 */
	public void actualizar(BonificacionDTO dto) {
		persistencia.actualizar(convertirDTO(dto));
	}

	/**
	 * Convierte un BonificacionDTO en la entidad Bonificacion.
	 * 
	 * @param dto
	 *            a convertir
	 * @return entidad Bonificacion
	 * @generated
	 */
	public Bonificacion convertirDTO(BonificacionDTO dto) {
		if (dto == null)
			return null;
		Bonificacion entidad = new Bonificacion();
		entidad.setId(dto.getId());
		entidad.setNombre(dto.getNombre());
		entidad.setConfiguracion(dto.getConfiguracion());

		return entidad;
	}

	/**
	 * Convierte una lista de BonificacionDTO en una lista de Bonificacion.
	 * 
	 * @param dtos
	 *            a convertir
	 * @return entidades List<Bonificacion>
	 * @generated
	 */
	public List<Bonificacion> convertirDTO(List<BonificacionDTO> dtos) {
		List<Bonificacion> entidades = new ArrayList<Bonificacion>();
		for (BonificacionDTO dto : dtos) {
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}

	/**
	 * Convierte Bonificacion en un DTO BonificacionDTO.
	 * 
	 * @param entidad
	 *            a convertir
	 * @return dto BonificacionDTO
	 * @generated
	 */
	public BonificacionDTO convertirEntidad(Bonificacion entidad) {
		BonificacionDTO dto = new BonificacionDTO();
		dto.setId(entidad.getId());
		dto.setNombre(entidad.getNombre());
		dto.setConfiguracion(entidad.getConfiguracion());

		return dto;
	}

	/**
	 * Convierte una lista de Bonificacion en una lista de BonificacionDTO.
	 * 
	 * @param entidades
	 *            a convertir
	 * @return dtos List<BonificacionDTO>
	 * @generated
	 */
	public List<BonificacionDTO> convertirEntidad(List<Bonificacion> entidades) {
		List<BonificacionDTO> dtos = new ArrayList<BonificacionDTO>();
		for (Bonificacion entidad : entidades) {
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}

}
