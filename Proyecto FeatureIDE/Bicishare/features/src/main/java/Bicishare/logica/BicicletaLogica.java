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
public class BicicletaLogica {

	@EJB
	private BicicletaDAO persistencia;

	/**
	 * Retorna una lista con los Bicicleta que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de BicicletaDTO
	 * @generated
	 */
	public List<BicicletaDTO> obtenerTodos() {
		return convertirEntidad(persistencia.obtenerTodos());
	}

	/**
	 * Obtiene Bicicleta dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Bicicleta
	 * @return Bicicleta del id dado
	 * @generated
	 */
	public BicicletaDTO obtener(Long id) {
		return convertirEntidad(persistencia.obtener(id));
	}

	/**
	 * Almacena la informacion de Bicicleta
	 * 
	 * @param dto
	 *            Bicicleta a guardar
	 * @return Bicicleta con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public BicicletaDTO guardar(BicicletaDTO dto) {
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}

	/**
	 * Elimina el registro Bicicleta con el identificador dado
	 * 
	 * @param id
	 *            identificador del Bicicleta
	 * @generated
	 */
	public void borrar(Long id) {
		persistencia.borrar(id);
	}

	/**
	 * Actualiza la informacion de Bicicleta
	 * 
	 * @param dto
	 *            Bicicleta a guardar
	 * @generated
	 */
	public void actualizar(BicicletaDTO dto) {
		persistencia.actualizar(convertirDTO(dto));
	}

	/**
	 * Convierte un BicicletaDTO en la entidad Bicicleta.
	 * 
	 * @param dto
	 *            a convertir
	 * @return entidad Bicicleta
	 * @generated
	 */
	public Bicicleta convertirDTO(BicicletaDTO dto) {
		if (dto == null)
			return null;
		Bicicleta entidad = new Bicicleta();
		entidad.setId(dto.getId());
		entidad.setReferencia(dto.getReferencia());
		entidad.setSerial(dto.getSerial());
		entidad.setPrecio(dto.getPrecio());
		entidad.setPrecioAlquiler(dto.getPrecioAlquiler());
		entidad.setFoto(dto.getFoto());

		if (dto.getProveedor() != null) {
			entidad.setProveedor(new Proveedor());
			entidad.getProveedor().setId(dto.getProveedor().getId());
		}
		if (dto.getMarca() != null) {
			entidad.setMarca(new Marca());
			entidad.getMarca().setId(dto.getMarca().getId());
		}

		return entidad;
	}

	/**
	 * Convierte una lista de BicicletaDTO en una lista de Bicicleta.
	 * 
	 * @param dtos
	 *            a convertir
	 * @return entidades List<Bicicleta>
	 * @generated
	 */
	public List<Bicicleta> convertirDTO(List<BicicletaDTO> dtos) {
		List<Bicicleta> entidades = new ArrayList<Bicicleta>();
		for (BicicletaDTO dto : dtos) {
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}

	/**
	 * Convierte Bicicleta en un DTO BicicletaDTO.
	 * 
	 * @param entidad
	 *            a convertir
	 * @return dto BicicletaDTO
	 * @generated
	 */
	public BicicletaDTO convertirEntidad(Bicicleta entidad) {
		BicicletaDTO dto = new BicicletaDTO();
		dto.setId(entidad.getId());
		dto.setReferencia(entidad.getReferencia());
		dto.setSerial(entidad.getSerial());
		dto.setPrecio(entidad.getPrecio());
		dto.setPrecioAlquiler(entidad.getPrecioAlquiler());
		dto.setFoto(entidad.getFoto());

		if (entidad.getProveedor() != null) {
			dto.setProveedor(new ProveedorDTO(entidad.getProveedor().getId()));
		}
		if (entidad.getMarca() != null) {
			dto.setMarca(new MarcaDTO(entidad.getMarca().getId()));
		}

		return dto;
	}

	/**
	 * Convierte una lista de Bicicleta en una lista de BicicletaDTO.
	 * 
	 * @param entidades
	 *            a convertir
	 * @return dtos List<BicicletaDTO>
	 * @generated
	 */
	public List<BicicletaDTO> convertirEntidad(List<Bicicleta> entidades) {
		List<BicicletaDTO> dtos = new ArrayList<BicicletaDTO>();
		for (Bicicleta entidad : entidades) {
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}

}
