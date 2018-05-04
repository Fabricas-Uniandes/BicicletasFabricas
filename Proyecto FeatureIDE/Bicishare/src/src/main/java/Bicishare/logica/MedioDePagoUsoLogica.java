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
public class MedioDePagoUsoLogica {

	@EJB
	private MedioDePagoUsoDAO persistencia;

	/**
	 * Retorna una lista con los MedioDePagoUso que se encuentran en la base de
	 * datos
	 * 
	 * @return retorna una lista de MedioDePagoUsoDTO
	 * @generated
	 */
	public List<MedioDePagoUsoDTO> obtenerTodos() {
		return convertirEntidad(persistencia.obtenerTodos());
	}

	/**
	 * Obtiene MedioDePagoUso dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento MedioDePagoUso
	 * @return MedioDePagoUso del id dado
	 * @generated
	 */
	public MedioDePagoUsoDTO obtener(Long id) {
		return convertirEntidad(persistencia.obtener(id));
	}

	/**
	 * Almacena la informacion de MedioDePagoUso
	 * 
	 * @param dto
	 *            MedioDePagoUso a guardar
	 * @return MedioDePagoUso con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public MedioDePagoUsoDTO guardar(MedioDePagoUsoDTO dto) {
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}

	/**
	 * Elimina el registro MedioDePagoUso con el identificador dado
	 * 
	 * @param id
	 *            identificador del MedioDePagoUso
	 * @generated
	 */
	public void borrar(Long id) {
		persistencia.borrar(id);
	}

	/**
	 * Actualiza la informacion de MedioDePagoUso
	 * 
	 * @param dto
	 *            MedioDePagoUso a guardar
	 * @generated
	 */
	public void actualizar(MedioDePagoUsoDTO dto) {
		persistencia.actualizar(convertirDTO(dto));
	}

	/**
	 * Convierte un MedioDePagoUsoDTO en la entidad MedioDePagoUso.
	 * 
	 * @param dto
	 *            a convertir
	 * @return entidad MedioDePagoUso
	 * @generated
	 */
	public MedioDePagoUso convertirDTO(MedioDePagoUsoDTO dto) {
		if (dto == null)
			return null;
		MedioDePagoUso entidad = new MedioDePagoUso();
		entidad.setId(dto.getId());
		entidad.setRegistroJson(dto.getRegistroJson());

		if (dto.getPago() != null) {
			entidad.setPago(new Pago());
			entidad.getPago().setId(dto.getPago().getId());
		}
		if (dto.getMedioDePago() != null) {
			entidad.setMedioDePago(new MedioDePago());
			entidad.getMedioDePago().setId(dto.getMedioDePago().getId());
		}

		return entidad;
	}

	/**
	 * Convierte una lista de MedioDePagoUsoDTO en una lista de MedioDePagoUso.
	 * 
	 * @param dtos
	 *            a convertir
	 * @return entidades List<MedioDePagoUso>
	 * @generated
	 */
	public List<MedioDePagoUso> convertirDTO(List<MedioDePagoUsoDTO> dtos) {
		List<MedioDePagoUso> entidades = new ArrayList<MedioDePagoUso>();
		for (MedioDePagoUsoDTO dto : dtos) {
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}

	/**
	 * Convierte MedioDePagoUso en un DTO MedioDePagoUsoDTO.
	 * 
	 * @param entidad
	 *            a convertir
	 * @return dto MedioDePagoUsoDTO
	 * @generated
	 */
	public MedioDePagoUsoDTO convertirEntidad(MedioDePagoUso entidad) {
		MedioDePagoUsoDTO dto = new MedioDePagoUsoDTO();
		dto.setId(entidad.getId());
		dto.setRegistroJson(entidad.getRegistroJson());

		if (entidad.getMedioDePago() != null) {
			dto.setMedioDePago(new MedioDePagoDTO(entidad.getMedioDePago().getId()));
		}
		if (entidad.getPago() != null) {
			dto.setPago(new PagoDTO(entidad.getPago().getId()));
		}

		return dto;
	}

	/**
	 * Convierte una lista de MedioDePagoUso en una lista de MedioDePagoUsoDTO.
	 * 
	 * @param entidades
	 *            a convertir
	 * @return dtos List<MedioDePagoUsoDTO>
	 * @generated
	 */
	public List<MedioDePagoUsoDTO> convertirEntidad(List<MedioDePagoUso> entidades) {
		List<MedioDePagoUsoDTO> dtos = new ArrayList<MedioDePagoUsoDTO>();
		for (MedioDePagoUso entidad : entidades) {
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}

}
