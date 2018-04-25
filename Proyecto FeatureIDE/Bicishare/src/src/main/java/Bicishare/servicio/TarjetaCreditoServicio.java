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
@Path("/TarjetaCredito")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TarjetaCreditoServicio {

  @EJB
  private TarjetaCreditoLogica logica;

  /**
   * retorna una lista con los TarjetaCredito que se encuentran en la base de
   * datos
   *
   * @return retorna una lista de TarjetaCreditoDTO
   * @generated
   */
  @GET
  public List<TarjetaCreditoDTO> obtenerTodosTarjetaCreditos() {
    return logica.obtenerTodos();
  }

  /**
   * @param id identificador del elemento TarjetaCredito
   * @return TarjetaCredito del id dado
   * @generated
   */
  @GET
  @Path("/{id}")
  public TarjetaCreditoDTO obtenerTarjetaCredito(@PathParam("id") Long id) {
    return logica.obtener(id);
  }

  /**
   * almacena la informacion de TarjetaCredito
   *
   * @param dto TarjetaCredito a guardar
   * @return TarjetaCredito con los cambios realizados por el proceso de guardar
   * @generated
   */
  @POST
  public TarjetaCreditoDTO guardarTarjetaCredito(TarjetaCreditoDTO dto) {
    if (dto.getId() != null) {
      logica.actualizar(dto);
      return dto;
    } else {
      return logica.guardar(dto);
    }
  }

  /**
   * elimina el registro TarjetaCredito con el identificador dado
   *
   * @param id identificador del TarjetaCredito
   * @generated
   */
  @DELETE
  @Path("/{id}")
  public void borrarTarjetaCredito(@PathParam("id") Long id) {
    logica.borrar(id);
  }

}
