
package Bicishare.logica;

import Bicishare.dto.*;
import Bicishare.persistencia.*;
import Bicishare.persistencia.entity.*;
/*import jdk.nashorn.internal.parser.JSONParser;*/

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.io.FileNotFoundException;

/**
 * @generated
 * @author eaperador
 */
@Stateless
public class PagoLogica {
/*if[Pago]*/
	@EJB
	private PagoDAO persistencia;

	/**
	 * Retorna una lista con los Pago que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de PagoDTO
	 * @generated
	 */
	public List<PagoDTO> obtenerTodos() {
		return convertirEntidad(persistencia.obtenerTodos());
	}

	/**
	 * Obtiene Pago dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Pago
	 * @return Pago del id dado
	 * @generated
	 */
	public PagoDTO obtener(Long id) {
		return convertirEntidad(persistencia.obtener(id));
	}

	/**
	 * Almacena la informacion de Pago
	 * 
	 * @param dto
	 *            Pago a guardar
	 * @return Pago con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public PagoDTO guardar(PagoDTO dto) {
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}

	/**
	 * Elimina el registro Pago con el identificador dado
	 * 
	 * @param id
	 *            identificador del Pago
	 * @generated
	 */
	public void borrar(Long id) {
		persistencia.borrar(id);
	}

	/**
	 * Actualiza la informacion de Pago
	 * 
	 * @param dto
	 *            Pago a guardar
	 * @generated
	 */
	public void actualizar(PagoDTO dto) {
		persistencia.actualizar(convertirDTO(dto));
	}

	/**
	 * Convierte un PagoDTO en la entidad Pago.
	 * 
	 * @param dto
	 *            a convertir
	 * @return entidad Pago
	 * @generated
	 */
	public Pago convertirDTO(PagoDTO dto) {
		if (dto == null)
			return null;
		Pago entidad = new Pago();
		entidad.setId(dto.getId());
		entidad.setMedioPago(dto.getMedioPago());
		entidad.setValor(dto.getValor());

		if (dto.getPrestamo() != null) {
			entidad.setPrestamo(new Prestamo());
			entidad.getPrestamo().setId(dto.getPrestamo().getId());
		}
		if (dto.getMedioDePagoUso() != null) {
			entidad.setMedioDePagoUso(new MedioDePagoUso());
			entidad.getMedioDePagoUso().setId(dto.getMedioDePagoUso().getId());
		}

		return entidad;
	}

	/**
	 * Convierte una lista de PagoDTO en una lista de Pago.
	 * 
	 * @param dtos
	 *            a convertir
	 * @return entidades List<Pago>
	 * @generated
	 */
	public List<Pago> convertirDTO(List<PagoDTO> dtos) {
		List<Pago> entidades = new ArrayList<Pago>();
		for (PagoDTO dto : dtos) {
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}

	/**
	 * Convierte Pago en un DTO PagoDTO.
	 * 
	 * @param entidad
	 *            a convertir
	 * @return dto PagoDTO
	 * @generated
	 */
	public PagoDTO convertirEntidad(Pago entidad) {
		PagoDTO dto = new PagoDTO();
		dto.setId(entidad.getId());
		dto.setMedioPago(entidad.getMedioPago());
		dto.setValor(entidad.getValor());

		if (entidad.getPrestamo() != null) {
			dto.setPrestamo(new PrestamoDTO(entidad.getPrestamo().getId()));
		}
		if (entidad.getMedioDePagoUso() != null) {
			dto.setMedioDePagoUso(new MedioDePagoUsoDTO(entidad.getMedioDePagoUso().getId()));
		}

		return dto;
	}

	/**
	 * Convierte una lista de Pago en una lista de PagoDTO.
	 * 
	 * @param entidades
	 *            a convertir
	 * @return dtos List<PagoDTO>
	 * @generated
	 */
	public List<PagoDTO> convertirEntidad(List<Pago> entidades) {
		List<PagoDTO> dtos = new ArrayList<PagoDTO>();
		for (Pago entidad : entidades) {
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	/*end[Pago]*/
}

