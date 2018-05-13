package Bicishare.persistencia.entity;

import javax.persistence.*;

/**
 * 
 * @author eaperador
 * @generated
 */
@Entity
@Table(name = "Pago") // , schema="${schema}")
@NamedQueries({ @NamedQuery(name = "Pago.obtenerTodos", query = "select e from Pago e") })
public class Pago {

	/**
	 * Identificador de la tabla Pago.
	 */
	@Id
	// @Column(name = "Pago_id")
	@GeneratedValue(generator = "PagoGen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "PagoGen", sequenceName = "Pago_SEQ", allocationSize = 1)
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

	// @Column(name = "medioPago")
	private String medioPago;

	/**
	 * @generated 1-1-false
	 */

	// @Column(name = "Valor")
	private Long Valor;

	/**
	 * @generated 1-1-false
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.EAGER)
	private Prestamo prestamo;

	/**
	 * @generated 1-1-false
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.EAGER)
	private MedioDePagoUso MedioDePagoUso;

	/**
	 * @generated
	 */
	public String getMedioPago() {
		return this.medioPago;
	}

	/**
	 * @generated
	 */
	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}

	/**
	 * @generated
	 */
	public Long getValor() {
		return this.Valor;
	}

	/**
	 * @generated
	 */
	public void setValor(Long Valor) {
		this.Valor = Valor;
	}

	/**
	 * @generated
	 */
	public MedioDePagoUso getMedioDePagoUso() {
		return this.MedioDePagoUso;
	}

	/**
	 * @generated
	 */
	public void setMedioDePagoUso(MedioDePagoUso MedioDePagoUso) {
		this.MedioDePagoUso = MedioDePagoUso;
	}

	/**
	 * @generated
	 */
	public Prestamo getPrestamo() {
		return this.prestamo;
	}

	/**
	 * @generated
	 */
	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}

}
