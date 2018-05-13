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
@Table(name = "Bicicleta") // , schema="${schema}")
@NamedQueries({ @NamedQuery(name = "Bicicleta.obtenerTodos", query = "select e from Bicicleta e") })
public class Bicicleta {

	/**
	 * Identificador de la tabla Bicicleta.
	 */
	@Id
	// @Column(name = "Bicicleta_id")
	@GeneratedValue(generator = "BicicletaGen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "BicicletaGen", sequenceName = "Bicicleta_SEQ", allocationSize = 1)
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

	// @Column(name = "serial")
	private Long serial;

	/**
	 * @generated 1-1-false
	 */

	// @Column(name = "precio")
	private Integer precio;

	/**
	 * @generated 1-1-false
	 */

	// @Column(name = "precioAlquiler")
	private Integer precioAlquiler;

	/**
	 * @generated 1-1-false
	 */

	// @Column(name = "foto")
	private String foto;

	/**
	 * @generated 1-1-false
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.EAGER)
	private Proveedor proveedor;

	/**
	 * @generated 0--1-true
	 */
	@OneToMany(cascade = {}, fetch = javax.persistence.FetchType.LAZY)
	private List<Prestamo> prestamos;

	/**
	 * @generated 1-1-false
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.EAGER)
	private Marca marca;

	/**
	 * @generated
	 */
	public Long getSerial() {
		return this.serial;
	}

	/**
	 * @generated
	 */
	public void setSerial(Long serial) {
		this.serial = serial;
	}

	/**
	 * @generated
	 */
	public Integer getPrecio() {
		return this.precio;
	}

	/**
	 * @generated
	 */
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	/**
	 * @generated
	 */
	public Integer getPrecioAlquiler() {
		return this.precioAlquiler;
	}

	/**
	 * @generated
	 */
	public void setPrecioAlquiler(Integer precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
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

	/**
	 * @generated
	 */
	public Marca getMarca() {
		return this.marca;
	}

	/**
	 * @generated
	 */
	public void setMarca(Marca marca) {
		this.marca = marca;
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

	/**
	 * @generated
	 */
	public Proveedor getProveedor() {
		return this.proveedor;
	}

	/**
	 * @generated
	 */
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

}
