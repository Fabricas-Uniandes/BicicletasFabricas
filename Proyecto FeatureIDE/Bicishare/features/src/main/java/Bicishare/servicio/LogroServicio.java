package Bicishare.servicio;

import Bicishare.dto.*;
import Bicishare.logica.*;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * @author eaperador
 * @generated
 */
@Stateless
@Path("/Logro")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LogroServicio {

  

  @EJB
  private LogroLogica logica;

  /**
   * retorna una lista con los Logro que se encuentran en la base de datos
   *
   * @return retorna una lista de LogroDTO
   * @generated
   */
  @GET
  public List<LogroDTO> obtenerTodosLogros() {
    return logica.obtenerTodos();
  }

  /**
   * @param id identificador del elemento Logro
   * @return Logro del id dado
   * @generated
   */
  @GET
  @Path("/{id}")
  public LogroDTO obtenerLogro(@PathParam("id") Long id) {
    return logica.obtener(id);
  }
  
}
