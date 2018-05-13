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
@Table(name = "TarjetaCredito") // , schema="${schema}")
@NamedQueries({ @NamedQuery(name = "TarjetaCredito.obtenerTodos", query = "select e from TarjetaCredito e") })
public class TarjetaCredito extends MedioDePago {

	/**
	 * Identificador de la tabla TarjetaCredito.
	 */
	@Id
	// @Column(name = "TarjetaCredito_id")
	@GeneratedValue(generator = "TarjetaCreditoGen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "TarjetaCreditoGen", sequenceName = "TarjetaCredito_SEQ", allocationSize = 1)
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

	// @Column(name = "fechaVencimiento")
	private String fechaVencimiento;

	/**
	 * @generated 1-1-false
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.EAGER)
	private Biciusuario biciusuario;

	/**
	 * @generated
	 */
	public String getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	/**
	 * @generated
	 */
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
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

}
