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
@Path("/Biciusuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BiciusuarioServicio {

  @EJB
  private BiciusuarioLogica logica;

  /**
   * retorna una lista con los Biciusuario que se encuentran en la base de datos
   *
   * @return retorna una lista de BiciusuarioDTO
   * @generated
   */
  @GET
  public List<BiciusuarioDTO> obtenerTodosBiciusuarios() {
    return logica.obtenerTodos();
  }

  /**
   * @param id identificador del elemento Biciusuario
   * @return Biciusuario del id dado
   * @generated
   */
  @GET
  @Path("/{id}")
  public BiciusuarioDTO obtenerBiciusuario(@PathParam("id") Long id) {
    return logica.obtener(id);
  }

  /**
   * almacena la informacion de Biciusuario
   *
   * @param dto Biciusuario a guardar
   * @return Biciusuario con los cambios realizados por el proceso de guardar
   * @generated
   */
  @POST
  public BiciusuarioDTO guardarBiciusuario(BiciusuarioDTO dto) {
    if (dto.getId() != null) {
      logica.actualizar(dto);
      return dto;
    } else {
      return logica.guardar(dto);
    }
  }

  /**
   * elimina el registro Biciusuario con el identificador dado
   *
   * @param id identificador del Biciusuario
   * @generated
   */
  @DELETE
  @Path("/{id}")
  public void borrarBiciusuario(@PathParam("id") Long id) {
    logica.borrar(id);
  }

}
