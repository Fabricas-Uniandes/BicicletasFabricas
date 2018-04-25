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
public class PSELogica extends MedioDePago {
	
	@EJB
    private PSEDAO persistencia;


	
	/**
	* Retorna una lista con los PSE que se encuentran en la base de datos
	* @return retorna una lista de PSEDTO
	* @generated
	*/
	public List<PSEDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene PSE dado su identificador. 	
	* @param id identificador del elemento PSE
	* @return PSE del id dado
	* @generated
	*/
	public PSEDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de PSE
	 * @param dto PSE a guardar
	 * @return PSE con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public PSEDTO guardar(PSEDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro PSE con el identificador dado
	 * @param id identificador del PSE
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de PSE
	 * @param dto PSE a guardar
	 * @generated
	 */
	public void actualizar(PSEDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un PSEDTO en la entidad PSE.  
	* @param dto a convertir
	* @return entidad PSE
	* @generated
	*/
	public PSE convertirDTO(PSEDTO dto){
		if(dto==null)return null;
		PSE entidad=new PSE();
		entidad.setId(dto.getId());
			entidad.setConfiguracion(dto.getConfiguracion());
		
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  PSEDTO en una lista de PSE.  
	* @param dtos a convertir
	* @return entidades List<PSE>
	* @generated
	*/
	public List<PSE> convertirDTO(List<PSEDTO> dtos){
		List<PSE> entidades=new ArrayList<PSE>();
		for(PSEDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte PSE en un DTO PSEDTO.  
	* @param entidad a convertir
	* @return dto PSEDTO
	* @generated
	*/
	public PSEDTO convertirEntidad(PSE entidad){
		PSEDTO dto=new PSEDTO();
		dto.setId(entidad.getId());
				dto.setConfiguracion(entidad.getConfiguracion());
		
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de PSE en una lista de PSEDTO.  
	* @param entidades a convertir
	* @return dtos List<PSEDTO>
	* @generated
	*/
	public List<PSEDTO> convertirEntidad(List<PSE> entidades){
		List<PSEDTO> dtos=new ArrayList<PSEDTO>();
		for(PSE entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
