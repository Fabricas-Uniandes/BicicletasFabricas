package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author eaperador
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TarjetaCreditoDTO extends MedioDePagoDTO {

    public TarjetaCreditoDTO(){
        //constructor base
    }
    
    public TarjetaCreditoDTO(Long id){
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
    private String fechaVencimiento;
    
    
    /**
    * @generated
    */
    private BiciusuarioDTO biciusuario;
    
    /**
    * @return
    * @generated
    */
    public String getFechaVencimiento() {
        return this.fechaVencimiento;
    }
    
    /**
    * @param
    * @generated
    */
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
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
