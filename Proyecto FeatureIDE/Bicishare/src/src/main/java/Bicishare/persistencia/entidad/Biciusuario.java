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
@Table(name = "Biciusuario") // , schema="${schema}")
@NamedQueries({ @NamedQuery(name = "Biciusuario.obtenerTodos", query = "select e from Biciusuario e") })
public class Biciusuario extends Usuario {

	/**
	 * Identificador de la tabla Biciusuario.
	 */
	@Id
	// @Column(name = "Biciusuario_id")
	@GeneratedValue(generator = "BiciusuarioGen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "BiciusuarioGen", sequenceName = "Biciusuario_SEQ", allocationSize = 1)
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

	// @Column(name = "numeroDocumento")
	private Long numeroDocumento;

	/**
	 * @generated 1-1-false
	 */

	// @Column(name = "foto")
	private String foto;

	/**
	 * @generated 0--1-true
	 */
	@OneToMany(cascade = {}, fetch = javax.persistence.FetchType.LAZY)
	private List<BonificacionGanada> bonificacion;

	/**
	 * @generated 0--1-true
	 */
	@OneToMany(cascade = {}, fetch = javax.persistence.FetchType.LAZY)
	private List<TarjetaCredito> tarjetaCredito;

	/**
	 * @generated 0--1-true
	 */
	@OneToMany(cascade = {}, fetch = javax.persistence.FetchType.LAZY)
	private List<Prestamo> prestamos;

	/**
	 * @generated 0--1-true
	 */
	@OneToMany(cascade = {}, fetch = javax.persistence.FetchType.LAZY)
	private List<Logro> logro;

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
	public Long getNumeroDocumento() {
		return this.numeroDocumento;
	}

	/**
	 * @generated
	 */
	public void setNumeroDocumento(Long numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
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

	public List<Logro> getLogro() {
		if (logro != null) {
			logro = new ArrayList<Logro>();
		}
		return this.logro;
	}

	public void setLogro(List<Logro> logro) {
		this.logro = logro;
	}

	public List<TarjetaCredito> getTarjetaCredito() {
		if (tarjetaCredito != null) {
			tarjetaCredito = new ArrayList<TarjetaCredito>();
		}
		return this.tarjetaCredito;
	}

	public void setTarjetaCredito(List<TarjetaCredito> tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public List<Prestamo> getPrestamos() {
		if (prestamos != null) {
			prestamos = new ArrayList<Prestamo>();
		}
		return this.prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public List<BonificacionGanada> getBonificacion() {
		if (bonificacion != null) {
			bonificacion = new ArrayList<BonificacionGanada>();
		}
		return this.bonificacion;
	}

	public void setBonificacion(List<BonificacionGanada> bonificacion) {
		this.bonificacion = bonificacion;
	}

}
