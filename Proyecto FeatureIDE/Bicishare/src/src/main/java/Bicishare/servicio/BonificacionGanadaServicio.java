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
 *  @author eaperador
 *  @generated
 */
@Stateless
@Path("/BonificacionGanada")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BonificacionGanadaServicio {
	
	@EJB
    private BonificacionGanadaLogica logica;

	
	/**
	* retorna una lista con los BonificacionGanada que se encuentran en la base de datos
	* @return retorna una lista de BonificacionGanadaDTO
	* @generated
	*/
	@GET
	public List<BonificacionGanadaDTO> obtenerTodosBonificacionGanadas(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento BonificacionGanada
	* @return BonificacionGanada del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public BonificacionGanadaDTO obtenerBonificacionGanada(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de BonificacionGanada
	 * @param dto BonificacionGanada a guardar
	 * @return BonificacionGanada con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public BonificacionGanadaDTO guardarBonificacionGanada(BonificacionGanadaDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro BonificacionGanada con el identificador dado
	 * @param id identificador del BonificacionGanada
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarBonificacionGanada(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
