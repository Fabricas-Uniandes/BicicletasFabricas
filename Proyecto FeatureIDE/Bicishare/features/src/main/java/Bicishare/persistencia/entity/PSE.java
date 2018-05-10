package Bicishare.persistencia.entity;

import javax.persistence.*;

/**
 * 
 * @author eaperador
 * @generated
 */
@Entity
@Table(name = "PSE") // , schema="${schema}")
@NamedQueries({ @NamedQuery(name = "PSE.obtenerTodos", query = "select e from PSE e") })
public class PSE extends MedioDePago {

	/**
	 * Identificador de la tabla PSE.
	 */
	@Id
	// @Column(name = "PSE_id")
	@GeneratedValue(generator = "PSEGen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "PSEGen", sequenceName = "PSE_SEQ", allocationSize = 1)
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

	// @Column(name = "Banco")
	private String Banco;

	/**
	 * @generated 1-1-false
	 */

	// @Column(name = "Configuracion")
	private String Configuracion;

	/**
	 * @generated
	 */
	public String getBanco() {
		return this.Banco;
	}

	/**
	 * @generated
	 */
	public void setBanco(String Banco) {
		this.Banco = Banco;
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

}
