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
@Table(name = "MedioDePago") // , schema="${schema}")
@NamedQueries({ @NamedQuery(name = "MedioDePago.obtenerTodos", query = "select e from MedioDePago e") })
public class MedioDePago {

	/**
	 * Identificador de la tabla MedioDePago.
	 */
	@Id
	// @Column(name = "MedioDePago_id")
	@GeneratedValue(generator = "MedioDePagoGen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "MedioDePagoGen", sequenceName = "MedioDePago_SEQ", allocationSize = 1)
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

	// @Column(name = "Nombre")
	private String Nombre;

	/**
	 * @generated 0--1-true
	 */
	@OneToMany(cascade = {}, fetch = javax.persistence.FetchType.LAZY)
	private List<MedioDePagoUso> MedioDePagoUso;

	/**
	 * @generated
	 */
	public String getNombre() {
		return this.Nombre;
	}

	/**
	 * @generated
	 */
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public List<MedioDePagoUso> getMedioDePagoUso() {
		if (MedioDePagoUso != null) {
			MedioDePagoUso = new ArrayList<MedioDePagoUso>();
		}
		return this.MedioDePagoUso;
	}

	public void setMedioDePagoUso(List<MedioDePagoUso> MedioDePagoUso) {
		this.MedioDePagoUso = MedioDePagoUso;
	}

}
