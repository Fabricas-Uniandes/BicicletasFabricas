package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author eaperador
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MedioDePagoDTO {

    public MedioDePagoDTO(){
        //constructor base
    }
    
    public MedioDePagoDTO(Long id){
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
    private String Nombre;
    
    
    
    
    /**
    * @generated
    */
    private List<MedioDePagoUsoDTO> MedioDePagoUso;
    
    public List<MedioDePagoUsoDTO> getMedioDePagoUso(){
    	if(this.MedioDePagoUso==null){
    		MedioDePagoUso=new ArrayList<MedioDePagoUsoDTO>();
    	}
    	return MedioDePagoUso;
    }
    
    public void setMedioDePagoUso(List<MedioDePagoUsoDTO> MedioDePagoUso){
    	this.MedioDePagoUso=MedioDePagoUso;
    }
    
    /**
    * @return
    * @generated
    */
    public String getNombre() {
        return this.Nombre;
    }
    
    /**
    * @param
    * @generated
    */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
	
}
