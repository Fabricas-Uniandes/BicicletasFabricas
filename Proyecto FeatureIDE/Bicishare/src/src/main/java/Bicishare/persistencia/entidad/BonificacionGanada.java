package Bicishare.persistencia.entity;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/**
 * 
 * @author eaperador
 * @generated
 */
@Entity
@Table(name = "BonificacionGanada") // , schema="${schema}")
@NamedQueries({ @NamedQuery(name = "BonificacionGanada.obtenerTodos", query = "select e from BonificacionGanada e") })
public class BonificacionGanada {

	/**
	 * Identificador de la tabla BonificacionGanada.
	 */
	@Id
	// @Column(name = "BonificacionGanada_id")
	@GeneratedValue(generator = "BonificacionGanadaGen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "BonificacionGanadaGen", sequenceName = "BonificacionGanada_SEQ", allocationSize = 1)
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

	// @Column(name = "nombre")
	private String nombre;

	/**
	 * @generated 1-1-false
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.EAGER)
	private Bonificacion Bonificacion;

	/**
	 * @generated 1-1-false
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.EAGER)
	private Biciusuario biciusuario;

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
	public Biciusuario getBiciusuario() {
		return this.biciusuario;
	}

	/**
	 * @generated
	 */
	public void setBiciusuario(Biciusuario biciusuario) {
		this.biciusuario = biciusuario;
	}

	/**
	 * @generated
	 */
	public Bonificacion getBonificacion() {
		return this.Bonificacion;
	}

	/**
	 * @generated
	 */
	public void setBonificacion(Bonificacion Bonificacion) {
		this.Bonificacion = Bonificacion;
	}

}
