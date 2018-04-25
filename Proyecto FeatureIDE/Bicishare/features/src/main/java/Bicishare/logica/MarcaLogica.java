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
public class MarcaLogica {
	
	@EJB
    private MarcaDAO persistencia;


	
	/**
	* Retorna una lista con los Marca que se encuentran en la base de datos
	* @return retorna una lista de MarcaDTO
	* @generated
	*/
	public List<MarcaDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Marca dado su identificador. 	
	* @param id identificador del elemento Marca
	* @return Marca del id dado
	* @generated
	*/
	public MarcaDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Marca
	 * @param dto Marca a guardar
	 * @return Marca con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public MarcaDTO guardar(MarcaDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Marca con el identificador dado
	 * @param id identificador del Marca
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Marca
	 * @param dto Marca a guardar
	 * @generated
	 */
	public void actualizar(MarcaDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un MarcaDTO en la entidad Marca.  
	* @param dto a convertir
	* @return entidad Marca
	* @generated
	*/
	public Marca convertirDTO(MarcaDTO dto){
		if(dto==null)return null;
		Marca entidad=new Marca();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
		
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  MarcaDTO en una lista de Marca.  
	* @param dtos a convertir
	* @return entidades List<Marca>
	* @generated
	*/
	public List<Marca> convertirDTO(List<MarcaDTO> dtos){
		List<Marca> entidades=new ArrayList<Marca>();
		for(MarcaDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Marca en un DTO MarcaDTO.  
	* @param entidad a convertir
	* @return dto MarcaDTO
	* @generated
	*/
	public MarcaDTO convertirEntidad(Marca entidad){
		MarcaDTO dto=new MarcaDTO();
		dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
		
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Marca en una lista de MarcaDTO.  
	* @param entidades a convertir
	* @return dtos List<MarcaDTO>
	* @generated
	*/
	public List<MarcaDTO> convertirEntidad(List<Marca> entidades){
		List<MarcaDTO> dtos=new ArrayList<MarcaDTO>();
		for(Marca entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
