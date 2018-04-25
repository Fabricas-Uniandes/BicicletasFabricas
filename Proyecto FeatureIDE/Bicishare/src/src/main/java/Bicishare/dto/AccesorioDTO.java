package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author eaperador
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccesorioDTO {

    public AccesorioDTO(){
        //constructor base
    }
    
    public AccesorioDTO(Long id){
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
    private String tipo;
    
    /**
    * @generated
    */
    private String foto;
    
    
    
    
    /**
    * @generated
    */
    private List<PrestamoDTO> prestamo;
    
    public List<PrestamoDTO> getPrestamo(){
    	if(this.prestamo==null){
    		prestamo=new ArrayList<PrestamoDTO>();
    	}
    	return prestamo;
    }
    
    public void setPrestamo(List<PrestamoDTO> prestamo){
    	this.prestamo=prestamo;
    }
    
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
    public String getTipo() {
        return this.tipo;
    }
    
    /**
    * @param
    * @generated
    */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
    * @return
    * @generated
    */
    public String getFoto() {
        return this.foto;
    }
    
    /**
    * @param
    * @generated
    */
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
	
}
