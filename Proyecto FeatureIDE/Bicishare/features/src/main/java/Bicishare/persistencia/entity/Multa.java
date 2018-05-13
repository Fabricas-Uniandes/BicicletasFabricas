package Bicishare.persistencia.entity;

import java.util.Date;
import javax.persistence.*;

/**
 * 
 * @author eaperador
 * @generated
 */
@Entity
@Table(name = "Multa") // , schema="${schema}")
@NamedQueries({ @NamedQuery(name = "Multa.obtenerTodos", query = "select e from Multa e") })
public class Multa {

	/**
	 * Identificador de la tabla Multa.
	 */
	@Id
	// @Column(name = "Multa_id")
	@GeneratedValue(generator = "MultaGen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "MultaGen", sequenceName = "Multa_SEQ", allocationSize = 1)
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

	// @Column(name = "valor")
	private Integer valor;

	/**
	 * @generated 1-1-false
	 */
	@Temporal(TemporalType.DATE)
	// @Column(name = "fecha")
	private Date fecha;

	/**
	 * @generated 1-1-false
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.EAGER)
	private Prestamo prestamo;

	/**
	 * @generated
	 */
	public Integer getValor() {
		return this.valor;
	}

	/**
	 * @generated
	 */
	public void setValor(Integer valor) {
		this.valor = valor;
	}

	/**
	 * @generated
	 */
	public Date getFecha() {
		return this.fecha;
	}

	/**
	 * @generated
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
