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
@Path("/PSE")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PSEServicio {

	@EJB
	private PSELogica logica;

	/**
	 * retorna una lista con los PSE que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de PSEDTO
	 * @generated
	 */
	@GET
	public List<PSEDTO> obtenerTodosPSEs() {
		return logica.obtenerTodos();
	}

	/**
	 * @param id
	 *            identificador del elemento PSE
	 * @return PSE del id dado
	 * @generated
	 */
	@GET
	@Path("/{id}")
	public PSEDTO obtenerPSE(@PathParam("id") Long id) {
		return logica.obtener(id);
	}

	/**
	 * almacena la informacion de PSE
	 * 
	 * @param dto
	 *            PSE a guardar
	 * @return PSE con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public PSEDTO guardarPSE(PSEDTO dto) {
		if (dto.getId() != null) {
			logica.actualizar(dto);
			return dto;
		} else {
			return logica.guardar(dto);
		}
	}

	/**
	 * elimina el registro PSE con el identificador dado
	 * 
	 * @param id
	 *            identificador del PSE
	 * @generated
	 */
	@DELETE
	@Path("/{id}")
	public void borrarPSE(@PathParam("id") Long id) {
		logica.borrar(id);
	}

}
