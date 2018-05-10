package Bicishare.persistencia.entity;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

@Entity
@Table(name = "Banco") // , schema="${schema}")
@NamedQueries({ @NamedQuery(name = "Banco.obtenerTodos", query = "select e from Banco e") })
public class Banco {

	@Id
	// @Column(name = "Banco_id")
	@GeneratedValue(generator = "BancoGen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "BancoGen", sequenceName = "Banco_SEQ", allocationSize = 1)
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

	@OneToMany(cascade = {}, fetch = javax.persistence.FetchType.LAZY)
	private List<Pago> pago;
	
	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Pago> getPago() {
		if (pago != null) {
			pago = new ArrayList<Pago>();
		}
		return this.pago;
	}

	public void setPago(List<Pago> pago) {
		this.pago = pago;
	}
}
