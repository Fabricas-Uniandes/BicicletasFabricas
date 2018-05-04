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
@Table(name = "MedioDePagoUso") // , schema="${schema}")
@NamedQueries({ @NamedQuery(name = "MedioDePagoUso.obtenerTodos", query = "select e from MedioDePagoUso e") })
public class MedioDePagoUso {

	/**
	 * Identificador de la tabla MedioDePagoUso.
	 */
	@Id
	// @Column(name = "MedioDePagoUso_id")
	@GeneratedValue(generator = "MedioDePagoUsoGen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "MedioDePagoUsoGen", sequenceName = "MedioDePagoUso_SEQ", allocationSize = 1)
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

	// @Column(name = "RegistroJson")
	private String RegistroJson;

	/**
	 * @generated 1-1-false
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.EAGER)
	private MedioDePago MedioDePago;

	/**
	 * @generated 1-1-false
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.EAGER)
	private Pago Pago;

	/**
	 * @generated
	 */
	public String getRegistroJson() {
		return this.RegistroJson;
	}

	/**
	 * @generated
	 */
	public void setRegistroJson(String RegistroJson) {
		this.RegistroJson = RegistroJson;
	}

	/**
	 * @generated
	 */
	public MedioDePago getMedioDePago() {
		return this.MedioDePago;
	}

	/**
	 * @generated
	 */
	public void setMedioDePago(MedioDePago MedioDePago) {
		this.MedioDePago = MedioDePago;
	}

	/**
	 * @generated
	 */
	public Pago getPago() {
		return this.Pago;
	}

	/**
	 * @generated
	 */
	public void setPago(Pago Pago) {
		this.Pago = Pago;
	}

}
