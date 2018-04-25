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
public class BiciusuarioLogica extends Usuario {
	
	@EJB
    private BiciusuarioDAO persistencia;


	
	/**
	* Retorna una lista con los Biciusuario que se encuentran en la base de datos
	* @return retorna una lista de BiciusuarioDTO
	* @generated
	*/
	public List<BiciusuarioDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Biciusuario dado su identificador. 	
	* @param id identificador del elemento Biciusuario
	* @return Biciusuario del id dado
	* @generated
	*/
	public BiciusuarioDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Biciusuario
	 * @param dto Biciusuario a guardar
	 * @return Biciusuario con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public BiciusuarioDTO guardar(BiciusuarioDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Biciusuario con el identificador dado
	 * @param id identificador del Biciusuario
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Biciusuario
	 * @param dto Biciusuario a guardar
	 * @generated
	 */
	public void actualizar(BiciusuarioDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un BiciusuarioDTO en la entidad Biciusuario.  
	* @param dto a convertir
	* @return entidad Biciusuario
	* @generated
	*/
	public Biciusuario convertirDTO(BiciusuarioDTO dto){
		if(dto==null)return null;
		Biciusuario entidad=new Biciusuario();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
			entidad.setNumeroDocumento(dto.getNumeroDocumento());
			entidad.setFoto(dto.getFoto());
		
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  BiciusuarioDTO en una lista de Biciusuario.  
	* @param dtos a convertir
	* @return entidades List<Biciusuario>
	* @generated
	*/
	public List<Biciusuario> convertirDTO(List<BiciusuarioDTO> dtos){
		List<Biciusuario> entidades=new ArrayList<Biciusuario>();
		for(BiciusuarioDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Biciusuario en un DTO BiciusuarioDTO.  
	* @param entidad a convertir
	* @return dto BiciusuarioDTO
	* @generated
	*/
	public BiciusuarioDTO convertirEntidad(Biciusuario entidad){
		BiciusuarioDTO dto=new BiciusuarioDTO();
		dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
				dto.setNumeroDocumento(entidad.getNumeroDocumento());
				dto.setFoto(entidad.getFoto());
		
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Biciusuario en una lista de BiciusuarioDTO.  
	* @param entidades a convertir
	* @return dtos List<BiciusuarioDTO>
	* @generated
	*/
	public List<BiciusuarioDTO> convertirEntidad(List<Biciusuario> entidades){
		List<BiciusuarioDTO> dtos=new ArrayList<BiciusuarioDTO>();
		for(Biciusuario entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
