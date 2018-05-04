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
@Path("/Marca")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MarcaServicio {

	@EJB
	private MarcaLogica logica;

	/**
	 * retorna una lista con los Marca que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de MarcaDTO
	 * @generated
	 */
	@GET
	public List<MarcaDTO> obtenerTodosMarcas() {
		return logica.obtenerTodos();
	}

	/**
	 * @param id
	 *            identificador del elemento Marca
	 * @return Marca del id dado
	 * @generated
	 */
	@GET
	@Path("/{id}")
	public MarcaDTO obtenerMarca(@PathParam("id") Long id) {
		return logica.obtener(id);
	}

	/**
	 * almacena la informacion de Marca
	 * 
	 * @param dto
	 *            Marca a guardar
	 * @return Marca con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public MarcaDTO guardarMarca(MarcaDTO dto) {
		if (dto.getId() != null) {
			logica.actualizar(dto);
			return dto;
		} else {
			return logica.guardar(dto);
		}
	}

	/**
	 * elimina el registro Marca con el identificador dado
	 * 
	 * @param id
	 *            identificador del Marca
	 * @generated
	 */
	@DELETE
	@Path("/{id}")
	public void borrarMarca(@PathParam("id") Long id) {
		logica.borrar(id);
	}

}
