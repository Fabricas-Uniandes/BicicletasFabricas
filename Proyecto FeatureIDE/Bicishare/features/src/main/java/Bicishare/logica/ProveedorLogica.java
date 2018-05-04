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
public class ProveedorLogica {

	@EJB
	private ProveedorDAO persistencia;

	/**
	 * Retorna una lista con los Proveedor que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de ProveedorDTO
	 * @generated
	 */
	public List<ProveedorDTO> obtenerTodos() {
		return convertirEntidad(persistencia.obtenerTodos());
	}

	/**
	 * Obtiene Proveedor dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Proveedor
	 * @return Proveedor del id dado
	 * @generated
	 */
	public ProveedorDTO obtener(Long id) {
		return convertirEntidad(persistencia.obtener(id));
	}

	/**
	 * Almacena la informacion de Proveedor
	 * 
	 * @param dto
	 *            Proveedor a guardar
	 * @return Proveedor con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public ProveedorDTO guardar(ProveedorDTO dto) {
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}

	/**
	 * Elimina el registro Proveedor con el identificador dado
	 * 
	 * @param id
	 *            identificador del Proveedor
	 * @generated
	 */
	public void borrar(Long id) {
		persistencia.borrar(id);
	}

	/**
	 * Actualiza la informacion de Proveedor
	 * 
	 * @param dto
	 *            Proveedor a guardar
	 * @generated
	 */
	public void actualizar(ProveedorDTO dto) {
		persistencia.actualizar(convertirDTO(dto));
	}

	/**
	 * Convierte un ProveedorDTO en la entidad Proveedor.
	 * 
	 * @param dto
	 *            a convertir
	 * @return entidad Proveedor
	 * @generated
	 */
	public Proveedor convertirDTO(ProveedorDTO dto) {
		if (dto == null)
			return null;
		Proveedor entidad = new Proveedor();
		entidad.setId(dto.getId());
		entidad.setNombre(dto.getNombre());

		return entidad;
	}

	/**
	 * Convierte una lista de ProveedorDTO en una lista de Proveedor.
	 * 
	 * @param dtos
	 *            a convertir
	 * @return entidades List<Proveedor>
	 * @generated
	 */
	public List<Proveedor> convertirDTO(List<ProveedorDTO> dtos) {
		List<Proveedor> entidades = new ArrayList<Proveedor>();
		for (ProveedorDTO dto : dtos) {
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}

	/**
	 * Convierte Proveedor en un DTO ProveedorDTO.
	 * 
	 * @param entidad
	 *            a convertir
	 * @return dto ProveedorDTO
	 * @generated
	 */
	public ProveedorDTO convertirEntidad(Proveedor entidad) {
		ProveedorDTO dto = new ProveedorDTO();
		dto.setId(entidad.getId());
		dto.setNombre(entidad.getNombre());

		return dto;
	}

	/**
	 * Convierte una lista de Proveedor en una lista de ProveedorDTO.
	 * 
	 * @param entidades
	 *            a convertir
	 * @return dtos List<ProveedorDTO>
	 * @generated
	 */
	public List<ProveedorDTO> convertirEntidad(List<Proveedor> entidades) {
		List<ProveedorDTO> dtos = new ArrayList<ProveedorDTO>();
		for (Proveedor entidad : entidades) {
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}

}
