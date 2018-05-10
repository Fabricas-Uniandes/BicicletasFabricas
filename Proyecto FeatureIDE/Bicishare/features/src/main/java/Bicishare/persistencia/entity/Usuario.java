package Bicishare.persistencia.entity;

import javax.persistence.*;

/**
  *  
  *  @author eaperador
  *  @generated	  
*/
@Entity
@Table(name = "Usuario") // , schema="${schema}")
@NamedQueries({ @NamedQuery(name = "Usuario.obtenerTodos", query = "select e from Usuario e") })
public class Usuario {

	/**
	 * Identificador de la tabla Usuario.
	 */
	@Id
	// @Column(name = "Usuario_id")
	@GeneratedValue(generator = "UsuarioGen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "UsuarioGen", sequenceName = "Usuario_SEQ", allocationSize = 1)
	private Long id;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @generated 1-1-false
	 */

	// @Column(name = "NombreDeUsuario")
	private String NombreDeUsuario;

	/**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "Contraseña")
    private String Contraseña;

	/**
	 * @generated 1-1-false
	 */

	// @Column(name = "Rol")
	private Integer Rol;

	/**
	 * @generated
	 */
	public String getNombreDeUsuario() {
		return this.NombreDeUsuario;
	}

	/**
	 * @generated
	 */
	public void setNombreDeUsuario(String NombreDeUsuario) {
		this.NombreDeUsuario = NombreDeUsuario;
	}

	/**
    * @generated
    */
    public String getContraseña() {
        return this.Contraseña;
    }

	/**
    * @generated
    */
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

	/**
	 * @generated
	 */
	public Integer getRol() {
		return this.Rol;
	}

	/**
	 * @generated
	 */
	public void setRol(Integer Rol) {
		this.Rol = Rol;
	}

}
