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
@Table(name="Marca")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Marca.obtenerTodos", query="select e from Marca e")
})
public class Marca {

	/**
	 * Identificador de la tabla Marca. 	
	 */
	@Id
    //@Column(name = "Marca_id")
    @GeneratedValue(generator = "MarcaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "MarcaGen", sequenceName = "Marca_SEQ",allocationSize = 1)
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
    
    //@Column(name = "nombre")
    private String nombre;
    
    
    /**
    * @generated
    * 0--1-true 
    */
    @OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    private List<Bicicleta> bicicleta;
    
    
    /**
    * @generated
    */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
    * @generated
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
	
	public List<Bicicleta> getBicicleta(){
		if(bicicleta!=null){
			bicicleta=new ArrayList<Bicicleta>(); 
		}
		return this.bicicleta;
	}
	
	public void setBicicleta(List<Bicicleta> bicicleta){
		this.bicicleta=bicicleta;
	}
	
}
