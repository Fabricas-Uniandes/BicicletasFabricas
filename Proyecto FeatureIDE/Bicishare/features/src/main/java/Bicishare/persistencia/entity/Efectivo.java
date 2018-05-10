package Bicishare.persistencia.entity;

import javax.persistence.*;

/**
 * 
 * @author eaperador
 * @generated
 */
@Entity
@Table(name = "Efectivo") // , schema="${schema}")
@NamedQueries({ @NamedQuery(name = "Efectivo.obtenerTodos", query = "select e from Efectivo e") })
public class Efectivo extends MedioDePago {

	/**
	 * Identificador de la tabla Efectivo.
	 */
	@Id
	// @Column(name = "Efectivo_id")
	@GeneratedValue(generator = "EfectivoGen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "EfectivoGen", sequenceName = "Efectivo_SEQ", allocationSize = 1)
	private Long id;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
