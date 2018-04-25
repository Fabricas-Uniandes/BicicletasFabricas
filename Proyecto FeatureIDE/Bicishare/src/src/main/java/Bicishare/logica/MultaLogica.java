package Bicishare.logica;

import Bicishare.dto.*;
import Bicishare.persistencia.*;
import Bicishare.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
  *  @generated
  *  @author eaperador
  */
@Stateless
public class MultaLogica {
	
	@EJB
    private MultaDAO persistencia;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	
	/**
	* Retorna una lista con los Multa que se encuentran en la base de datos
	* @return retorna una lista de MultaDTO
	* @generated
	*/
	public List<MultaDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Multa dado su identificador. 	
	* @param id identificador del elemento Multa
	* @return Multa del id dado
	* @generated
	*/
	public MultaDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Multa
	 * @param dto Multa a guardar
	 * @return Multa con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public MultaDTO guardar(MultaDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Multa con el identificador dado
	 * @param id identificador del Multa
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Multa
	 * @param dto Multa a guardar
	 * @generated
	 */
	public void actualizar(MultaDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un MultaDTO en la entidad Multa.  
	* @param dto a convertir
	* @return entidad Multa
	* @generated
	*/
	public Multa convertirDTO(MultaDTO dto){
		if(dto==null)return null;
		Multa entidad=new Multa();
		entidad.setId(dto.getId());
			entidad.setValor(dto.getValor());
			if(dto.getFecha()!=null){
				try {
					entidad.setFecha(fecha.parse(dto.getFecha()));
				} catch (ParseException ex) {
		            throw new RuntimeException("Error al convertir la fecha Fecha " + dto.getFecha());
		        }
			}
		
			if(dto.getPrestamo()!=null){
				entidad.setPrestamo(new Prestamo());
				entidad.getPrestamo().setId(dto.getPrestamo().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  MultaDTO en una lista de Multa.  
	* @param dtos a convertir
	* @return entidades List<Multa>
	* @generated
	*/
	public List<Multa> convertirDTO(List<MultaDTO> dtos){
		List<Multa> entidades=new ArrayList<Multa>();
		for(MultaDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Multa en un DTO MultaDTO.  
	* @param entidad a convertir
	* @return dto MultaDTO
	* @generated
	*/
	public MultaDTO convertirEntidad(Multa entidad){
		MultaDTO dto=new MultaDTO();
		dto.setId(entidad.getId());
				dto.setValor(entidad.getValor());
				if(entidad.getFecha()!=null){
					dto.setFecha(fecha.format(entidad.getFecha()));
				}
		
			if(entidad.getPrestamo()!=null){
				dto.setPrestamo(
					new PrestamoDTO(
						entidad.getPrestamo().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Multa en una lista de MultaDTO.  
	* @param entidades a convertir
	* @return dtos List<MultaDTO>
	* @generated
	*/
	public List<MultaDTO> convertirEntidad(List<Multa> entidades){
		List<MultaDTO> dtos=new ArrayList<MultaDTO>();
		for(Multa entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
