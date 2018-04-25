package Bicishare.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author eaperador
  *  @generated	  
*/
@Entity
@Table(name="Convenio")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Convenio.obtenerTodos", query="select e from Convenio e")
})
public class Convenio extends MedioDePago {

	/**
	 * Identificador de la tabla Convenio. 	
	 */
	@Id
    //@Column(name = "Convenio_id")
    @GeneratedValue(generator = "ConvenioGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ConvenioGen", sequenceName = "Convenio_SEQ",allocationSize = 1)
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
    
    //@Column(name = "Configuracion")
    private String Configuracion;
    
    
    
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
    
	
}
