package Bicishare.persistencia.entity;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.*;

/**
 * 
 * @author eaperador
 * @generated
 */
@Entity
@Table(name = "Prestamo") // , schema="${schema}")
@NamedQueries({ @NamedQuery(name = "Prestamo.obtenerTodos", query = "select e from Prestamo e") })
public class Prestamo {

	/**
	 * Identificador de la tabla Prestamo.
	 */
	@Id
	// @Column(name = "Prestamo_id")
	@GeneratedValue(generator = "PrestamoGen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "PrestamoGen", sequenceName = "Prestamo_SEQ", allocationSize = 1)
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
	@Temporal(TemporalType.DATE)
	// @Column(name = "fechaInicio")
	private Date fechaInicio;

	/**
	 * @generated 1-1-false
	 */
	@Temporal(TemporalType.DATE)
	// @Column(name = "fechaFin")
	private Date fechaFin;

	/**
	 * @generated 0-1-false
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.EAGER)
	private Pago pago;

	/**
	 * @generated 0-1-false
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.EAGER)
	private Multa multa;

	/**
	 * @generated 1-1-false
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.EAGER)
	private Biciusuario biciusuario;

	/**
	 * @generated 0--1-true
	 */
	@OneToMany(cascade = {}, fetch = javax.persistence.FetchType.LAZY)
	private List<Accesorio> accesorios;

	/**
	 * @generated 1--1-true
	 */
	@OneToMany(cascade = {}, fetch = javax.persistence.FetchType.LAZY)
	private List<Bicicleta> bicicleta;

	/**
	 * @generated
	 */
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	/**
	 * @generated
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @generated
	 */
	public Date getFechaFin() {
		return this.fechaFin;
	}

	/**
	 * @generated
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
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
	public Multa getMulta() {
		return this.multa;
	}

	/**
	 * @generated
	 */
	public void setMulta(Multa multa) {
		this.multa = multa;
	}

	/**
	 * @generated
	 */
	public Pago getPago() {
		return this.pago;
	}

	/**
	 * @generated
	 */
	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public List<Accesorio> getAccesorios() {
		if (accesorios != null) {
			accesorios = new ArrayList<Accesorio>();
		}
		return this.accesorios;
	}

	public void setAccesorios(List<Accesorio> accesorios) {
		this.accesorios = accesorios;
	}

	public List<Bicicleta> getBicicleta() {
		if (bicicleta != null) {
			bicicleta = new ArrayList<Bicicleta>();
		}
		return this.bicicleta;
	}

	public void setBicicleta(List<Bicicleta> bicicleta) {
		this.bicicleta = bicicleta;
	}

}
