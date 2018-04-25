package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author eaperador
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProveedorDTO {

    public ProveedorDTO(){
        //constructor base
    }
    
    public ProveedorDTO(Long id){
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
    private List<BicicletaDTO> bicicletas;
    
    public List<BicicletaDTO> getBicicletas(){
    	if(this.bicicletas==null){
    		bicicletas=new ArrayList<BicicletaDTO>();
    	}
    	return bicicletas;
    }
    
    public void setBicicletas(List<BicicletaDTO> bicicletas){
    	this.bicicletas=bicicletas;
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
    
	
}
