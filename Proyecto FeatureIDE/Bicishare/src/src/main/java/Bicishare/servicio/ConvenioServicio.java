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
@Path("/Convenio")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ConvenioServicio {

	@EJB
	private ConvenioLogica logica;

	/**
	 * retorna una lista con los Convenio que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de ConvenioDTO
	 * @generated
	 */
	@GET
	public List<ConvenioDTO> obtenerTodosConvenios() {
		return logica.obtenerTodos();
	}

	/**
	 * @param id
	 *            identificador del elemento Convenio
	 * @return Convenio del id dado
	 * @generated
	 */
	@GET
	@Path("/{id}")
	public ConvenioDTO obtenerConvenio(@PathParam("id") Long id) {
		return logica.obtener(id);
	}

	/**
	 * almacena la informacion de Convenio
	 * 
	 * @param dto
	 *            Convenio a guardar
	 * @return Convenio con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public ConvenioDTO guardarConvenio(ConvenioDTO dto) {
		if (dto.getId() != null) {
			logica.actualizar(dto);
			return dto;
		} else {
			return logica.guardar(dto);
		}
	}

	/**
	 * elimina el registro Convenio con el identificador dado
	 * 
	 * @param id
	 *            identificador del Convenio
	 * @generated
	 */
	@DELETE
	@Path("/{id}")
	public void borrarConvenio(@PathParam("id") Long id) {
		logica.borrar(id);
	}

}
