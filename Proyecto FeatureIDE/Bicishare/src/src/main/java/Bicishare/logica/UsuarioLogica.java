package Bicishare.logica;

import Bicishare.dto.*;
import Bicishare.persistencia.*;
import Bicishare.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * @generated
 * @author eaperador
 */
@Stateless
public class UsuarioLogica {

	@EJB
	private UsuarioDAO persistencia;

	/**
	 * Retorna una lista con los Usuario que se encuentran en la base de datos
	 * 
	 * @return retorna una lista de UsuarioDTO
	 * @generated
	 */
	public List<UsuarioDTO> obtenerTodos() {
		return convertirEntidad(persistencia.obtenerTodos());
	}

	/**
	 * Obtiene Usuario dado su identificador.
	 * 
	 * @param id
	 *            identificador del elemento Usuario
	 * @return Usuario del id dado
	 * @generated
	 */
	public UsuarioDTO obtener(Long id) {
		return convertirEntidad(persistencia.obtener(id));
	}

	/**
	 * Almacena la informacion de Usuario
	 * 
	 * @param dto
	 *            Usuario a guardar
	 * @return Usuario con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public UsuarioDTO guardar(UsuarioDTO dto) {
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}

	/**
	 * Elimina el registro Usuario con el identificador dado
	 * 
	 * @param id
	 *            identificador del Usuario
	 * @generated
	 */
	public void borrar(Long id) {
		persistencia.borrar(id);
	}

	/**
	 * Actualiza la informacion de Usuario
	 * 
	 * @param dto
	 *            Usuario a guardar
	 * @generated
	 */
	public void actualizar(UsuarioDTO dto) {
		persistencia.actualizar(convertirDTO(dto));
	}

	/**
	* Convierte un UsuarioDTO en la entidad Usuario.  
	* @param dto a convertir
	* @return entidad Usuario
	* @generated
	*/
	public Usuario convertirDTO(UsuarioDTO dto){
		if(dto==null)return null;
		Usuario entidad=new Usuario();
		entidad.setId(dto.getId());
			entidad.setNombreDeUsuario(dto.getNombreDeUsuario());
			entidad.setContraseña(dto.getContraseña());
			entidad.setRol(dto.getRol());
		
		
		return entidad;
	}

	/**
	 * Convierte una lista de UsuarioDTO en una lista de Usuario.
	 * 
	 * @param dtos
	 *            a convertir
	 * @return entidades List<Usuario>
	 * @generated
	 */
	public List<Usuario> convertirDTO(List<UsuarioDTO> dtos) {
		List<Usuario> entidades = new ArrayList<Usuario>();
		for (UsuarioDTO dto : dtos) {
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}

	/**
	* Convierte Usuario en un DTO UsuarioDTO.  
	* @param entidad a convertir
	* @return dto UsuarioDTO
	* @generated
	*/
	public UsuarioDTO convertirEntidad(Usuario entidad){
		UsuarioDTO dto=new UsuarioDTO();
		dto.setId(entidad.getId());
				dto.setNombreDeUsuario(entidad.getNombreDeUsuario());
				dto.setContraseña(entidad.getContraseña());
				dto.setRol(entidad.getRol());
		
		
		return dto;
	}

	/**
	 * Convierte una lista de Usuario en una lista de UsuarioDTO.
	 * 
	 * @param entidades
	 *            a convertir
	 * @return dtos List<UsuarioDTO>
	 * @generated
	 */
	public List<UsuarioDTO> convertirEntidad(List<Usuario> entidades) {
		List<UsuarioDTO> dtos = new ArrayList<UsuarioDTO>();
		for (Usuario entidad : entidades) {
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}

}
