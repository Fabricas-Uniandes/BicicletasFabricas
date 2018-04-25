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
@Path("/Bicicleta")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BicicletaServicio {
	
	@EJB
    private BicicletaLogica logica;

	
	/**
	* retorna una lista con los Bicicleta que se encuentran en la base de datos
	* @return retorna una lista de BicicletaDTO
	* @generated
	*/
	@GET
	public List<BicicletaDTO> obtenerTodosBicicletas(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Bicicleta
	* @return Bicicleta del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public BicicletaDTO obtenerBicicleta(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Bicicleta
	 * @param dto Bicicleta a guardar
	 * @return Bicicleta con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public BicicletaDTO guardarBicicleta(BicicletaDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro Bicicleta con el identificador dado
	 * @param id identificador del Bicicleta
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarBicicleta(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
