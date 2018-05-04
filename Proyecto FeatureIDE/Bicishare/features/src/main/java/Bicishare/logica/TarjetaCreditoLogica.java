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
public class TarjetaCreditoLogica extends MedioDePago {

	@EJB
	private TarjetaCreditoDAO persistencia;

	/**
	 * Retorna una lista con los TarjetaCredito que se encuentran en la base de
	 * datos
	 * 
	 * @return retorna una lista de TarjetaCreditoDTO
	 * @generated
	 */
	public List<TarjetaCreditoDTO> obtenerTodos() {
		return convertirEntidad(persistencia.obtenerTodos());
	}

	/**
	 * Obtiene TarjetaCredito dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento TarjetaCredito
	 * @return TarjetaCredito del id dado
	 * @generated
	 */
	public TarjetaCreditoDTO obtener(Long id) {
		return convertirEntidad(persistencia.obtener(id));
	}

	/**
	 * Almacena la informacion de TarjetaCredito
	 * 
	 * @param dto
	 *            TarjetaCredito a guardar
	 * @return TarjetaCredito con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public TarjetaCreditoDTO guardar(TarjetaCreditoDTO dto) {
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}

	/**
	 * Elimina el registro TarjetaCredito con el identificador dado
	 * 
	 * @param id
	 *            identificador del TarjetaCredito
	 * @generated
	 */
	public void borrar(Long id) {
		persistencia.borrar(id);
	}

	/**
	 * Actualiza la informacion de TarjetaCredito
	 * 
	 * @param dto
	 *            TarjetaCredito a guardar
	 * @generated
	 */
	public void actualizar(TarjetaCreditoDTO dto) {
		persistencia.actualizar(convertirDTO(dto));
	}

	/**
	 * Convierte un TarjetaCreditoDTO en la entidad TarjetaCredito.
	 * 
	 * @param dto
	 *            a convertir
	 * @return entidad TarjetaCredito
	 * @generated
	 */
	public TarjetaCredito convertirDTO(TarjetaCreditoDTO dto) {
		if (dto == null)
			return null;
		TarjetaCredito entidad = new TarjetaCredito();
		entidad.setId(dto.getId());
		entidad.setFechaVencimiento(dto.getFechaVencimiento());

		if (dto.getBiciusuario() != null) {
			entidad.setBiciusuario(new Biciusuario());
			entidad.getBiciusuario().setId(dto.getBiciusuario().getId());
		}

		return entidad;
	}

	/**
	 * Convierte una lista de TarjetaCreditoDTO en una lista de TarjetaCredito.
	 * 
	 * @param dtos
	 *            a convertir
	 * @return entidades List<TarjetaCredito>
	 * @generated
	 */
	public List<TarjetaCredito> convertirDTO(List<TarjetaCreditoDTO> dtos) {
		List<TarjetaCredito> entidades = new ArrayList<TarjetaCredito>();
		for (TarjetaCreditoDTO dto : dtos) {
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}

	/**
	 * Convierte TarjetaCredito en un DTO TarjetaCreditoDTO.
	 * 
	 * @param entidad
	 *            a convertir
	 * @return dto TarjetaCreditoDTO
	 * @generated
	 */
	public TarjetaCreditoDTO convertirEntidad(TarjetaCredito entidad) {
		TarjetaCreditoDTO dto = new TarjetaCreditoDTO();
		dto.setId(entidad.getId());
		dto.setFechaVencimiento(entidad.getFechaVencimiento());

		if (entidad.getBiciusuario() != null) {
			dto.setBiciusuario(new BiciusuarioDTO(entidad.getBiciusuario().getId()));
		}

		return dto;
	}

	/**
	 * Convierte una lista de TarjetaCredito en una lista de TarjetaCreditoDTO.
	 * 
	 * @param entidades
	 *            a convertir
	 * @return dtos List<TarjetaCreditoDTO>
	 * @generated
	 */
	public List<TarjetaCreditoDTO> convertirEntidad(List<TarjetaCredito> entidades) {
		List<TarjetaCreditoDTO> dtos = new ArrayList<TarjetaCreditoDTO>();
		for (TarjetaCredito entidad : entidades) {
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}

}
