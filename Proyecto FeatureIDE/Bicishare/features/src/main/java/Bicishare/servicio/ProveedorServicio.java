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
@Path("/Proveedor")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProveedorServicio {
	
	@EJB
    private ProveedorLogica logica;

	
	/**
	* retorna una lista con los Proveedor que se encuentran en la base de datos
	* @return retorna una lista de ProveedorDTO
	* @generated
	*/
	@GET
	public List<ProveedorDTO> obtenerTodosProveedors(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Proveedor
	* @return Proveedor del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public ProveedorDTO obtenerProveedor(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Proveedor
	 * @param dto Proveedor a guardar
	 * @return Proveedor con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public ProveedorDTO guardarProveedor(ProveedorDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro Proveedor con el identificador dado
	 * @param id identificador del Proveedor
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarProveedor(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
