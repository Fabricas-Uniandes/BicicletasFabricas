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
@Path("/Bonificacion")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BonificacionServicio {

	@EJB
	private BonificacionLogica logica;

	/**
	 * retorna una lista con los Bonificacion que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de BonificacionDTO
	 * @generated
	 */
	@GET
	public List<BonificacionDTO> obtenerTodosBonificacions() {
		return logica.obtenerTodos();
	}

	/**
	 * @param id
	 *            identificador del elemento Bonificacion
	 * @return Bonificacion del id dado
	 * @generated
	 */
	@GET
	@Path("/{id}")
	public BonificacionDTO obtenerBonificacion(@PathParam("id") Long id) {
		return logica.obtener(id);
	}

	/**
	 * almacena la informacion de Bonificacion
	 * 
	 * @param dto
	 *            Bonificacion a guardar
	 * @return Bonificacion con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public BonificacionDTO guardarBonificacion(BonificacionDTO dto) {
		if (dto.getId() != null) {
			logica.actualizar(dto);
			return dto;
		} else {
			return logica.guardar(dto);
		}
	}

	/**
	 * elimina el registro Bonificacion con el identificador dado
	 * 
	 * @param id
	 *            identificador del Bonificacion
	 * @generated
	 */
	@DELETE
	@Path("/{id}")
	public void borrarBonificacion(@PathParam("id") Long id) {
		logica.borrar(id);
	}

}
