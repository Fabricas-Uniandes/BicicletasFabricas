package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author eaperador
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LogroDTO {

    public LogroDTO(){
        //constructor base
    }
    
    public LogroDTO(Long id){
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
    private Integer valor;
    
    
    
    
    /**
    * @generated
    */
    private List<BiciusuarioDTO> biciusuario;
    
    public List<BiciusuarioDTO> getBiciusuario(){
    	if(this.biciusuario==null){
    		biciusuario=new ArrayList<BiciusuarioDTO>();
    	}
    	return biciusuario;
    }
    
    public void setBiciusuario(List<BiciusuarioDTO> biciusuario){
    	this.biciusuario=biciusuario;
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
    public Integer getValor() {
        return this.valor;
    }
    
    /**
    * @param
    * @generated
    */
    public void setValor(Integer valor) {
        this.valor = valor;
    }
    
	
}
