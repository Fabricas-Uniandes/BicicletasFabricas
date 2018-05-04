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
@Path("/Multa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MultaServicio {

	@EJB
	private MultaLogica logica;

	/**
	 * retorna una lista con los Multa que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de MultaDTO
	 * @generated
	 */
	@GET
	public List<MultaDTO> obtenerTodosMultas() {
		return logica.obtenerTodos();
	}

	/**
	 * @param id
	 *            identificador del elemento Multa
	 * @return Multa del id dado
	 * @generated
	 */
	@GET
	@Path("/{id}")
	public MultaDTO obtenerMulta(@PathParam("id") Long id) {
		return logica.obtener(id);
	}

	/**
	 * almacena la informacion de Multa
	 * 
	 * @param dto
	 *            Multa a guardar
	 * @return Multa con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public MultaDTO guardarMulta(MultaDTO dto) {
		if (dto.getId() != null) {
			logica.actualizar(dto);
			return dto;
		} else {
			return logica.guardar(dto);
		}
	}

	/**
	 * elimina el registro Multa con el identificador dado
	 * 
	 * @param id
	 *            identificador del Multa
	 * @generated
	 */
	@DELETE
	@Path("/{id}")
	public void borrarMulta(@PathParam("id") Long id) {
		logica.borrar(id);
	}

}
