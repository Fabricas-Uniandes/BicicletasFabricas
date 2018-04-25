package Bicishare.persistencia.entity;


import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/**
  *  
  *  @author eaperador
  *  @generated	  
*/
@Entity
@Table(name="Bonificacion")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Bonificacion.obtenerTodos", query="select e from Bonificacion e")
})
public class Bonificacion {

	/**
	 * Identificador de la tabla Bonificacion. 	
	 */
	@Id
    //@Column(name = "Bonificacion_id")
    @GeneratedValue(generator = "BonificacionGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "BonificacionGen", sequenceName = "Bonificacion_SEQ",allocationSize = 1)
	private Long id;

	public Long getId(){
		return this.id;
	}

	public void setId(Long id){
		this.id=id;
	}
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "Nombre")
    private String Nombre;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "Configuracion")
    private String Configuracion;
    
    
    /**
    * @generated
    * 0--1-true 
    */
    @OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    private List<BonificacionGanada> BonificacionGanada;
    
    
    /**
    * @generated
    */
    public String getNombre() {
        return this.Nombre;
    }
    
    /**
    * @generated
    */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    /**
    * @generated
    */
    public String getConfiguracion() {
        return this.Configuracion;
    }
    
    /**
    * @generated
    */
    public void setConfiguracion(String Configuracion) {
        this.Configuracion = Configuracion;
    }
    
	
	public List<BonificacionGanada> getBonificacionGanada(){
		if(BonificacionGanada!=null){
			BonificacionGanada=new ArrayList<BonificacionGanada>(); 
		}
		return this.BonificacionGanada;
	}
	
	public void setBonificacionGanada(List<BonificacionGanada> BonificacionGanada){
		this.BonificacionGanada=BonificacionGanada;
	}
	
}
