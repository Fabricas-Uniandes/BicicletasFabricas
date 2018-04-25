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
@Path("/Usuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioServicio {
	
	@EJB
    private UsuarioLogica logica;

	
	/**
	* retorna una lista con los Usuario que se encuentran en la base de datos
	* @return retorna una lista de UsuarioDTO
	* @generated
	*/
	@GET
	public List<UsuarioDTO> obtenerTodosUsuarios(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Usuario
	* @return Usuario del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public UsuarioDTO obtenerUsuario(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Usuario
	 * @param dto Usuario a guardar
	 * @return Usuario con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public UsuarioDTO guardarUsuario(UsuarioDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro Usuario con el identificador dado
	 * @param id identificador del Usuario
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarUsuario(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
