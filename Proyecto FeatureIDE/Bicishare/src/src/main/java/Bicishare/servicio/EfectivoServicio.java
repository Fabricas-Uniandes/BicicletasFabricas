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
@Path("/Efectivo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EfectivoServicio {

	@EJB
	private EfectivoLogica logica;

	/**
	 * retorna una lista con los Efectivo que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de EfectivoDTO
	 * @generated
	 */
	@GET
	public List<EfectivoDTO> obtenerTodosEfectivos() {
		return logica.obtenerTodos();
	}

	/**
	 * @param id
	 *            identificador del elemento Efectivo
	 * @return Efectivo del id dado
	 * @generated
	 */
	@GET
	@Path("/{id}")
	public EfectivoDTO obtenerEfectivo(@PathParam("id") Long id) {
		return logica.obtener(id);
	}

	/**
	 * almacena la informacion de Efectivo
	 * 
	 * @param dto
	 *            Efectivo a guardar
	 * @return Efectivo con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public EfectivoDTO guardarEfectivo(EfectivoDTO dto) {
		if (dto.getId() != null) {
			logica.actualizar(dto);
			return dto;
		} else {
			return logica.guardar(dto);
		}
	}

	/**
	 * elimina el registro Efectivo con el identificador dado
	 * 
	 * @param id
	 *            identificador del Efectivo
	 * @generated
	 */
	@DELETE
	@Path("/{id}")
	public void borrarEfectivo(@PathParam("id") Long id) {
		logica.borrar(id);
	}

}
