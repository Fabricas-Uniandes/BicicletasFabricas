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
@Path("/Logro")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LogroServicio {

	@EJB
	private LogroLogica logica;

	/**
	 * retorna una lista con los Logro que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de LogroDTO
	 * @generated
	 */
	@GET
	public List<LogroDTO> obtenerTodosLogros() {
		return logica.obtenerTodos();
	}

	/**
	 * @param id
	 *            identificador del elemento Logro
	 * @return Logro del id dado
	 * @generated
	 */
	@GET
	@Path("/{id}")
	public LogroDTO obtenerLogro(@PathParam("id") Long id) {
		return logica.obtener(id);
	}

	/**
	 * almacena la informacion de Logro
	 * 
	 * @param dto
	 *            Logro a guardar
	 * @return Logro con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public LogroDTO guardarLogro(LogroDTO dto) {
		if (dto.getId() != null) {
			logica.actualizar(dto);
			return dto;
		} else {
			return logica.guardar(dto);
		}
	}

	/**
	 * elimina el registro Logro con el identificador dado
	 * 
	 * @param id
	 *            identificador del Logro
	 * @generated
	 */
	@DELETE
	@Path("/{id}")
	public void borrarLogro(@PathParam("id") Long id) {
		logica.borrar(id);
	}

}
