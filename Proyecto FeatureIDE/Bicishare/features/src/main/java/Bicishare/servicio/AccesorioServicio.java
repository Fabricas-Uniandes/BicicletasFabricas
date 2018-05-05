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
@Path("/Accesorio")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AccesorioServicio {
	/*if[Accesorios]*/
	@EJB
	private AccesorioLogica logica;

	/**
	 * retorna una lista con los Accesorio que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de AccesorioDTO
	 * @generated
	 */
	@GET
	public List<AccesorioDTO> obtenerTodosAccesorios() {
		return logica.obtenerTodos();
	}

	/**
	 * @param id
	 *            identificador del elemento Accesorio
	 * @return Accesorio del id dado
	 * @generated
	 */
	@GET
	@Path("/{id}")
	public AccesorioDTO obtenerAccesorio(@PathParam("id") Long id) {
		return logica.obtener(id);
	}

	/**
	 * almacena la informacion de Accesorio
	 * 
	 * @param dto
	 *            Accesorio a guardar
	 * @return Accesorio con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public AccesorioDTO guardarAccesorio(AccesorioDTO dto) {
		if (dto.getId() != null) {
			logica.actualizar(dto);
			return dto;
		} else {
			return logica.guardar(dto);
		}
	}

	/**
	 * elimina el registro Accesorio con el identificador dado
	 * 
	 * @param id
	 *            identificador del Accesorio
	 * @generated
	 */
	@DELETE
	@Path("/{id}")
	public void borrarAccesorio(@PathParam("id") Long id) {
		logica.borrar(id);
	}
	/*end[Accesorios]*/
}
