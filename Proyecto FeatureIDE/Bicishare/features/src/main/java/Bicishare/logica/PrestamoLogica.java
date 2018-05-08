package Bicishare.logica;
import Bicishare.dto.*;
import Bicishare.persistencia.*;
import Bicishare.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.sun.org.apache.xml.internal.dtm.DTMDOMException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @generated
 * @author eaperador
 */
@Stateless
public class PrestamoLogica {

	@EJB
	private PrestamoDAO persistencia;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	/**
	 * Retorna una lista con los Prestamo que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de PrestamoDTO
	 * @generated
	 */
	public List<PrestamoDTO> obtenerTodos() {
		return convertirEntidad(persistencia.obtenerTodos());
	}

	/**
	 * Obtiene Prestamo dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Prestamo
	 * @return Prestamo del id dado
	 * @generated
	 */
	public PrestamoDTO obtener(Long id) {
		return convertirEntidad(persistencia.obtener(id));
	}

	/**
	 * Almacena la informacion de Prestamo
	 * 
	 * @param dto
	 *            Prestamo a guardar
	 * @return Prestamo con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public PrestamoDTO guardar(PrestamoDTO dto) {
		
		if(ValidarDto(dto)) {
			return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
		}
		
		//throw new Exception("El prestamo no es valido");
		return dto;
	}

	/**
	 * Elimina el registro Prestamo con el identificador dado
	 * 
	 * @param id
	 *            identificador del Prestamo
	 * @generated
	 */
	public void borrar(Long id) {
		persistencia.borrar(id);
	}

	/**
	 * Actualiza la informacion de Prestamo
	 * 
	 * @param dto
	 *            Prestamo a guardar
	 * @generated
	 */
	public void actualizar(PrestamoDTO dto) {
		
		if(ValidarDto(dto)) {
			
			if(ValidarSiMultar(dto)) {
				Multar(dto);
			}
			
			persistencia.actualizar(convertirDTO(dto));
		}
		
		//throw new Exception("El prestamo no es valido");
	}

	/**
	 * Convierte un PrestamoDTO en la entidad Prestamo.
	 * 
	 * @param dto
	 *            a convertir
	 * @return entidad Prestamo
	 * @generated
	 */
	public Prestamo convertirDTO(PrestamoDTO dto) {
		if (dto == null)
			return null;
		Prestamo entidad = new Prestamo();
		entidad.setId(dto.getId());
		if (dto.getFechaInicio() != null) {
			try {
				entidad.setFechaInicio(fecha.parse(dto.getFechaInicio()));
			} catch (ParseException ex) {
				throw new RuntimeException("Error al convertir la fecha FechaInicio " + dto.getFechaInicio());
			}
		}
		if (dto.getFechaFin() != null) {
			try {
				entidad.setFechaFin(fecha.parse(dto.getFechaFin()));
			} catch (ParseException ex) {
				throw new RuntimeException("Error al convertir la fecha FechaFin " + dto.getFechaFin());
			}
		}

		if (dto.getBiciusuario() != null) {
			entidad.setBiciusuario(new Biciusuario());
			entidad.getBiciusuario().setId(dto.getBiciusuario().getId());
		}
		if (dto.getPago() != null) {
			entidad.setPago(new Pago());
			entidad.getPago().setId(dto.getPago().getId());
		}
		if (dto.getMulta() != null) {
			entidad.setMulta(new Multa());
			entidad.getMulta().setId(dto.getMulta().getId());
		}

		return entidad;
	}

	/**
	 * Convierte una lista de PrestamoDTO en una lista de Prestamo.
	 * 
	 * @param dtos
	 *            a convertir
	 * @return entidades List<Prestamo>
	 * @generated
	 */
	public List<Prestamo> convertirDTO(List<PrestamoDTO> dtos) {
		List<Prestamo> entidades = new ArrayList<Prestamo>();
		for (PrestamoDTO dto : dtos) {
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}

	/**
	 * Convierte Prestamo en un DTO PrestamoDTO.
	 * 
	 * @param entidad
	 *            a convertir
	 * @return dto PrestamoDTO
	 * @generated
	 */
	public PrestamoDTO convertirEntidad(Prestamo entidad) {
		PrestamoDTO dto = new PrestamoDTO();
		dto.setId(entidad.getId());
		if (entidad.getFechaInicio() != null) {
			dto.setFechaInicio(fecha.format(entidad.getFechaInicio()));
		}
		if (entidad.getFechaFin() != null) {
			dto.setFechaFin(fecha.format(entidad.getFechaFin()));
		}

		if (entidad.getPago() != null) {
			dto.setPago(new PagoDTO(entidad.getPago().getId()));
		}
		if (entidad.getMulta() != null) {
			dto.setMulta(new MultaDTO(entidad.getMulta().getId()));
		}
		if (entidad.getBiciusuario() != null) {
			dto.setBiciusuario(new BiciusuarioDTO(entidad.getBiciusuario().getId()));
		}

		return dto;
	}

	/**
	 * Convierte una lista de Prestamo en una lista de PrestamoDTO.
	 * 
	 * @param entidades
	 *            a convertir
	 * @return dtos List<PrestamoDTO>
	 * @generated
	 */
	public List<PrestamoDTO> convertirEntidad(List<Prestamo> entidades) {
		List<PrestamoDTO> dtos = new ArrayList<PrestamoDTO>();
		for (Prestamo entidad : entidades) {
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}

	private boolean ValidarDto(PrestamoDTO dto) {
		return true;
	}
	
	private boolean ValidarSiMultar(PrestamoDTO dto) {
		return false;
	}
	
	private void Multar(PrestamoDTO dto) {
		MultaDTO multa = new MultaDTO();
        multa.setFecha(new Date().toString());
        multa.setValor(10000);
        dto.setMulta(multa);
	}	
}
