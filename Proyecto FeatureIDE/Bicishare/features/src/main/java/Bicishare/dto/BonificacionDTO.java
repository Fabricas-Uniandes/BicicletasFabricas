package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author eaperador
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BonificacionDTO {

    public BonificacionDTO(){
        //constructor base
    }
    
    public BonificacionDTO(Long id){
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
    private String Configuracion;
    
    
    
    
    /**
    * @generated
    */
    private List<BonificacionGanadaDTO> BonificacionGanada;
    
    public List<BonificacionGanadaDTO> getBonificacionGanada(){
    	if(this.BonificacionGanada==null){
    		BonificacionGanada=new ArrayList<BonificacionGanadaDTO>();
    	}
    	return BonificacionGanada;
    }
    
    public void setBonificacionGanada(List<BonificacionGanadaDTO> BonificacionGanada){
    	this.BonificacionGanada=BonificacionGanada;
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
    /**
    * @return
    * @generated
    */
    public String getConfiguracion() {
        return this.Configuracion;
    }
    
    /**
    * @param
    * @generated
    */
    public void setConfiguracion(String Configuracion) {
        this.Configuracion = Configuracion;
    }
    
	
}
