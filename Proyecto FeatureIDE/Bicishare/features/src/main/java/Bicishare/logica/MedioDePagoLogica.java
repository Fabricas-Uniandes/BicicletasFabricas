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
public class MedioDePagoLogica {
	
	@EJB
    private MedioDePagoDAO persistencia;


	
	/**
	* Retorna una lista con los MedioDePago que se encuentran en la base de datos
	* @return retorna una lista de MedioDePagoDTO
	* @generated
	*/
	public List<MedioDePagoDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene MedioDePago dado su identificador. 	
	* @param id identificador del elemento MedioDePago
	* @return MedioDePago del id dado
	* @generated
	*/
	public MedioDePagoDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de MedioDePago
	 * @param dto MedioDePago a guardar
	 * @return MedioDePago con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public MedioDePagoDTO guardar(MedioDePagoDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro MedioDePago con el identificador dado
	 * @param id identificador del MedioDePago
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de MedioDePago
	 * @param dto MedioDePago a guardar
	 * @generated
	 */
	public void actualizar(MedioDePagoDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un MedioDePagoDTO en la entidad MedioDePago.  
	* @param dto a convertir
	* @return entidad MedioDePago
	* @generated
	*/
	public MedioDePago convertirDTO(MedioDePagoDTO dto){
		if(dto==null)return null;
		MedioDePago entidad=new MedioDePago();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
		
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  MedioDePagoDTO en una lista de MedioDePago.  
	* @param dtos a convertir
	* @return entidades List<MedioDePago>
	* @generated
	*/
	public List<MedioDePago> convertirDTO(List<MedioDePagoDTO> dtos){
		List<MedioDePago> entidades=new ArrayList<MedioDePago>();
		for(MedioDePagoDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte MedioDePago en un DTO MedioDePagoDTO.  
	* @param entidad a convertir
	* @return dto MedioDePagoDTO
	* @generated
	*/
	public MedioDePagoDTO convertirEntidad(MedioDePago entidad){
		MedioDePagoDTO dto=new MedioDePagoDTO();
		dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
		
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de MedioDePago en una lista de MedioDePagoDTO.  
	* @param entidades a convertir
	* @return dtos List<MedioDePagoDTO>
	* @generated
	*/
	public List<MedioDePagoDTO> convertirEntidad(List<MedioDePago> entidades){
		List<MedioDePagoDTO> dtos=new ArrayList<MedioDePagoDTO>();
		for(MedioDePago entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
