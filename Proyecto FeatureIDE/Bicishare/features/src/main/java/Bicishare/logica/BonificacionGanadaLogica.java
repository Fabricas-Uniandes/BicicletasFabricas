package Bicishare.logica;

import Bicishare.dto.*;
import Bicishare.persistencia.*;
import Bicishare.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
  *  @generated
  *  @author eaperador
  */
@Stateless
public class BonificacionGanadaLogica {
	
	@EJB
    private BonificacionGanadaDAO persistencia;


	
	/**
	* Retorna una lista con los BonificacionGanada que se encuentran en la base de datos
	* @return retorna una lista de BonificacionGanadaDTO
	* @generated
	*/
	public List<BonificacionGanadaDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene BonificacionGanada dado su identificador. 	
	* @param id identificador del elemento BonificacionGanada
	* @return BonificacionGanada del id dado
	* @generated
	*/
	public BonificacionGanadaDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de BonificacionGanada
	 * @param dto BonificacionGanada a guardar
	 * @return BonificacionGanada con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public BonificacionGanadaDTO guardar(BonificacionGanadaDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro BonificacionGanada con el identificador dado
	 * @param id identificador del BonificacionGanada
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de BonificacionGanada
	 * @param dto BonificacionGanada a guardar
	 * @generated
	 */
	public void actualizar(BonificacionGanadaDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un BonificacionGanadaDTO en la entidad BonificacionGanada.  
	* @param dto a convertir
	* @return entidad BonificacionGanada
	* @generated
	*/
	public BonificacionGanada convertirDTO(BonificacionGanadaDTO dto){
		if(dto==null)return null;
		BonificacionGanada entidad=new BonificacionGanada();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
		
			if(dto.getBiciusuario()!=null){
				entidad.setBiciusuario(new Biciusuario());
				entidad.getBiciusuario().setId(dto.getBiciusuario().getId());
			}
			if(dto.getBonificacion()!=null){
				entidad.setBonificacion(new Bonificacion());
				entidad.getBonificacion().setId(dto.getBonificacion().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  BonificacionGanadaDTO en una lista de BonificacionGanada.  
	* @param dtos a convertir
	* @return entidades List<BonificacionGanada>
	* @generated
	*/
	public List<BonificacionGanada> convertirDTO(List<BonificacionGanadaDTO> dtos){
		List<BonificacionGanada> entidades=new ArrayList<BonificacionGanada>();
		for(BonificacionGanadaDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte BonificacionGanada en un DTO BonificacionGanadaDTO.  
	* @param entidad a convertir
	* @return dto BonificacionGanadaDTO
	* @generated
	*/
	public BonificacionGanadaDTO convertirEntidad(BonificacionGanada entidad){
		BonificacionGanadaDTO dto=new BonificacionGanadaDTO();
		dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
		
			if(entidad.getBiciusuario()!=null){
				dto.setBiciusuario(
					new BiciusuarioDTO(
						entidad.getBiciusuario().getId()));
			}
			if(entidad.getBonificacion()!=null){
				dto.setBonificacion(
					new BonificacionDTO(
						entidad.getBonificacion().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de BonificacionGanada en una lista de BonificacionGanadaDTO.  
	* @param entidades a convertir
	* @return dtos List<BonificacionGanadaDTO>
	* @generated
	*/
	public List<BonificacionGanadaDTO> convertirEntidad(List<BonificacionGanada> entidades){
		List<BonificacionGanadaDTO> dtos=new ArrayList<BonificacionGanadaDTO>();
		for(BonificacionGanada entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
