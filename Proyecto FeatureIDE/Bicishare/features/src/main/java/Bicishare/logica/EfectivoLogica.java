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
public class EfectivoLogica extends MedioDePago {

	@EJB
	private EfectivoDAO persistencia;

	/**
	 * Retorna una lista con los Efectivo que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de EfectivoDTO
	 * @generated
	 */
	public List<EfectivoDTO> obtenerTodos() {
		return convertirEntidad(persistencia.obtenerTodos());
	}

	/**
	 * Obtiene Efectivo dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Efectivo
	 * @return Efectivo del id dado
	 * @generated
	 */
	public EfectivoDTO obtener(Long id) {
		return convertirEntidad(persistencia.obtener(id));
	}

	/**
	 * Almacena la informacion de Efectivo
	 * 
	 * @param dto
	 *            Efectivo a guardar
	 * @return Efectivo con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public EfectivoDTO guardar(EfectivoDTO dto) {
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}

	/**
	 * Elimina el registro Efectivo con el identificador dado
	 * 
	 * @param id
	 *            identificador del Efectivo
	 * @generated
	 */
	public void borrar(Long id) {
		persistencia.borrar(id);
	}

	/**
	 * Actualiza la informacion de Efectivo
	 * 
	 * @param dto
	 *            Efectivo a guardar
	 * @generated
	 */
	public void actualizar(EfectivoDTO dto) {
		persistencia.actualizar(convertirDTO(dto));
	}

	/**
	 * Convierte un EfectivoDTO en la entidad Efectivo.
	 * 
	 * @param dto
	 *            a convertir
	 * @return entidad Efectivo
	 * @generated
	 */
	public Efectivo convertirDTO(EfectivoDTO dto) {
		if (dto == null)
			return null;
		Efectivo entidad = new Efectivo();
		entidad.setId(dto.getId());

		return entidad;
	}

	/**
	 * Convierte una lista de EfectivoDTO en una lista de Efectivo.
	 * 
	 * @param dtos
	 *            a convertir
	 * @return entidades List<Efectivo>
	 * @generated
	 */
	public List<Efectivo> convertirDTO(List<EfectivoDTO> dtos) {
		List<Efectivo> entidades = new ArrayList<Efectivo>();
		for (EfectivoDTO dto : dtos) {
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}

	/**
	 * Convierte Efectivo en un DTO EfectivoDTO.
	 * 
	 * @param entidad
	 *            a convertir
	 * @return dto EfectivoDTO
	 * @generated
	 */
	public EfectivoDTO convertirEntidad(Efectivo entidad) {
		EfectivoDTO dto = new EfectivoDTO();
		dto.setId(entidad.getId());

		return dto;
	}

	/**
	 * Convierte una lista de Efectivo en una lista de EfectivoDTO.
	 * 
	 * @param entidades
	 *            a convertir
	 * @return dtos List<EfectivoDTO>
	 * @generated
	 */
	public List<EfectivoDTO> convertirEntidad(List<Efectivo> entidades) {
		List<EfectivoDTO> dtos = new ArrayList<EfectivoDTO>();
		for (Efectivo entidad : entidades) {
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}

}
