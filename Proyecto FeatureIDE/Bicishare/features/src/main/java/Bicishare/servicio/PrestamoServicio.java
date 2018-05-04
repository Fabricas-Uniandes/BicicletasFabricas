package Bicishare.servicio;

import Bicishare.dto.*;
import Bicishare.logica.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * @author eaperador
 * @generated
 */
@Stateless
@Path("/Prestamo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PrestamoServicio {

	@EJB
	private PrestamoLogica logica;

	/**
	 * retorna una lista con los Prestamo que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de PrestamoDTO
	 * @generated
	 */
	@GET
	public List<PrestamoDTO> obtenerTodosPrestamos() {
		return logica.obtenerTodos();
	}

	/**
	 * @param id
	 *            identificador del elemento Prestamo
	 * @return Prestamo del id dado
	 * @generated
	 */
	@GET
	@Path("/{id}")
	public PrestamoDTO obtenerPrestamo(@PathParam("id") Long id) {
		return logica.obtener(id);
	}

	/**
	 * almacena la informacion de Prestamo
	 * 
	 * @param dto
	 *            Prestamo a guardar
	 * @return Prestamo con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public PrestamoDTO guardarPrestamo(PrestamoDTO dto) {
		if (dto.getId() != null) {
			logica.actualizar(dto);
			return dto;
		} else {
			return logica.guardar(dto);
		}
	}

	/**
	 * elimina el registro Prestamo con el identificador dado
	 * 
	 * @param id
	 *            identificador del Prestamo
	 * @generated
	 */
	@DELETE
	@Path("/{id}")
	public void borrarPrestamo(@PathParam("id") Long id) {
		logica.borrar(id);
	}

}
