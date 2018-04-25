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
@Table(name="Accesorio")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Accesorio.obtenerTodos", query="select e from Accesorio e")
})
public class Accesorio {

	/**
	 * Identificador de la tabla Accesorio. 	
	 */
	@Id
    //@Column(name = "Accesorio_id")
    @GeneratedValue(generator = "AccesorioGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "AccesorioGen", sequenceName = "Accesorio_SEQ",allocationSize = 1)
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
    * 1-1-false
    */
    
    //@Column(name = "tipo")
    private String tipo;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "foto")
    private String foto;
    
    
    /**
    * @generated
    * 0--1-true 
    */
    @OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    private List<Prestamo> prestamo;
    
    
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
    
    /**
    * @generated
    */
    public String getTipo() {
        return this.tipo;
    }
    
    /**
    * @generated
    */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
    * @generated
    */
    public String getFoto() {
        return this.foto;
    }
    
    /**
    * @generated
    */
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
	
	public List<Prestamo> getPrestamo(){
		if(prestamo!=null){
			prestamo=new ArrayList<Prestamo>(); 
		}
		return this.prestamo;
	}
	
	public void setPrestamo(List<Prestamo> prestamo){
		this.prestamo=prestamo;
	}
	
}
