package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author eaperador
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BonificacionGanadaDTO {

    public BonificacionGanadaDTO(){
        //constructor base
    }
    
    public BonificacionGanadaDTO(Long id){
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
    private String nombre;
    
    
    /**
    * @generated
    */
    private BiciusuarioDTO biciusuario;
    
    /**
    * @generated
    */
    private BonificacionDTO Bonificacion;
    
    /**
    * @return
    * @generated
    */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
    * @param
    * @generated
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
	/**
	* @return
	* @generated
	*/
	public BonificacionDTO getBonificacion() {
	    return this.Bonificacion;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setBonificacion(BonificacionDTO Bonificacion) {
	    this.Bonificacion = Bonificacion;
	}
	/**
	* @return
	* @generated
	*/
	public BiciusuarioDTO getBiciusuario() {
	    return this.biciusuario;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setBiciusuario(BiciusuarioDTO biciusuario) {
	    this.biciusuario = biciusuario;
	}
	
}
