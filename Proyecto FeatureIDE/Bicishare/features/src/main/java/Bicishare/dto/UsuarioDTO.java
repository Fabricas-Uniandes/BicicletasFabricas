package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author eaperador
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UsuarioDTO {

    public UsuarioDTO(){
        //constructor base
    }
    
    public UsuarioDTO(Long id){
        this.id=id;
    }

	private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	
    
    /**
    * @generated
    */
    private String NombreDeUsuario;
    
    /**
    * @generated
    */
    private String contraseña;
    
    /**
    * @generated
    */
    private Integer Rol;
    
    
    /**
    * @return
    * @generated
    */
    public String getNombreDeUsuario() {
        return this.NombreDeUsuario;
    }
    
    /**
    * @param
    * @generated
    */
    public void setNombreDeUsuario(String NombreDeUsuario) {
        this.NombreDeUsuario = NombreDeUsuario;
    }
    /**
    * @return
    * @generated
    */
    public String getContraseña() {
        return this.contraseña;
    }
    
    /**
    * @param
    * @generated
    */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    /**
    * @return
    * @generated
    */
    public Integer getRol() {
        return this.Rol;
    }
    
    /**
    * @param
    * @generated
    */
    public void setRol(Integer Rol) {
        this.Rol = Rol;
    }
    
	
}
