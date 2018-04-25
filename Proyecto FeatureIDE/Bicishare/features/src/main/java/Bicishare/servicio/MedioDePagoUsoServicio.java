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
@Path("/MedioDePagoUso")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MedioDePagoUsoServicio {
	
	@EJB
    private MedioDePagoUsoLogica logica;

	
	/**
	* retorna una lista con los MedioDePagoUso que se encuentran en la base de datos
	* @return retorna una lista de MedioDePagoUsoDTO
	* @generated
	*/
	@GET
	public List<MedioDePagoUsoDTO> obtenerTodosMedioDePagoUsos(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento MedioDePagoUso
	* @return MedioDePagoUso del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public MedioDePagoUsoDTO obtenerMedioDePagoUso(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de MedioDePagoUso
	 * @param dto MedioDePagoUso a guardar
	 * @return MedioDePagoUso con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public MedioDePagoUsoDTO guardarMedioDePagoUso(MedioDePagoUsoDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro MedioDePagoUso con el identificador dado
	 * @param id identificador del MedioDePagoUso
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarMedioDePagoUso(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
