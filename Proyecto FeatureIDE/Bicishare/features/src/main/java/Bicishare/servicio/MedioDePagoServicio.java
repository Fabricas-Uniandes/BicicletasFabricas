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
@Path("/MedioDePago")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MedioDePagoServicio {

	@EJB
	private MedioDePagoLogica logica;

	/**
	 * retorna una lista con los MedioDePago que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de MedioDePagoDTO
	 * @generated
	 */
	@GET
	public List<MedioDePagoDTO> obtenerTodosMedioDePagos() {
		return logica.obtenerTodos();
	}

	/**
	 * @param id
	 *            identificador del elemento MedioDePago
	 * @return MedioDePago del id dado
	 * @generated
	 */
	@GET
	@Path("/{id}")
	public MedioDePagoDTO obtenerMedioDePago(@PathParam("id") Long id) {
		return logica.obtener(id);
	}

	/**
	 * almacena la informacion de MedioDePago
	 * 
	 * @param dto
	 *            MedioDePago a guardar
	 * @return MedioDePago con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public MedioDePagoDTO guardarMedioDePago(MedioDePagoDTO dto) {
		if (dto.getId() != null) {
			logica.actualizar(dto);
			return dto;
		} else {
			return logica.guardar(dto);
		}
	}

	/**
	 * elimina el registro MedioDePago con el identificador dado
	 * 
	 * @param id
	 *            identificador del MedioDePago
	 * @generated
	 */
	@DELETE
	@Path("/{id}")
	public void borrarMedioDePago(@PathParam("id") Long id) {
		logica.borrar(id);
	}

}
