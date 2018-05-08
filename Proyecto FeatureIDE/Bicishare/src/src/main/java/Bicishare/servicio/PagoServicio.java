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
@Path("/Pago")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PagoServicio {
	
	@EJB
	private PagoLogica logica;

	/**
	 * retorna una lista con los Pago que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de PagoDTO
	 * @generated
	 */
	@GET
	public List<PagoDTO> obtenerTodosPagos() {
		return logica.obtenerTodos();
	}

	/**
	 * @param id
	 *            identificador del elemento Pago
	 * @return Pago del id dado
	 * @generated
	 */
	@GET
	@Path("/{id}")
	public PagoDTO obtenerPago(@PathParam("id") Long id) {
		return logica.obtener(id);
	}
	
	@GET
	@Path("/bancos")
	public List<BancoDTO> obtenerBancos() {
		return logica.listaBancos();
	}

	/**
	 * almacena la informacion de Pago
	 * 
	 * @param dto
	 *            Pago a guardar
	 * @return Pago con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public PagoDTO guardarPago(PagoDTO dto) {
		if (dto.getId() != null) {
			logica.actualizar(dto);
			return dto;
		} else {
			return logica.guardar(dto);
		}
	}

	/**
	 * elimina el registro Pago con el identificador dado
	 * 
	 * @param id
	 *            identificador del Pago
	 * @generated
	 */
	@DELETE
	@Path("/{id}")
	public void borrarPago(@PathParam("id") Long id) {
		logica.borrar(id);
	}
	
}
