package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author eaperador
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PagoDTO {

    public PagoDTO(){
        //constructor base
    }
    
    public PagoDTO(Long id){
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
    private String medioPago;
    
    /**
    * @generated
    */
    private Long Valor;
    
    
    /**
    * @generated
    */
    private PrestamoDTO prestamo;
    
    /**
    * @generated
    */
    private MedioDePagoUsoDTO MedioDePagoUso;
    
    /**
    * @return
    * @generated
    */
    public String getMedioPago() {
        return this.medioPago;
    }
    
    /**
    * @param
    * @generated
    */
    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
    /**
    * @return
    * @generated
    */
    public Long getValor() {
        return this.Valor;
    }
    
    /**
    * @param
    * @generated
    */
    public void setValor(Long Valor) {
        this.Valor = Valor;
    }
    
	/**
	* @return
	* @generated
	*/
	public PrestamoDTO getPrestamo() {
	    return this.prestamo;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setPrestamo(PrestamoDTO prestamo) {
	    this.prestamo = prestamo;
	}
	/**
	* @return
	* @generated
	*/
	public MedioDePagoUsoDTO getMedioDePagoUso() {
	    return this.MedioDePagoUso;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setMedioDePagoUso(MedioDePagoUsoDTO MedioDePagoUso) {
	    this.MedioDePagoUso = MedioDePagoUso;
	}
	
}
