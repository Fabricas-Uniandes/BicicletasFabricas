package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 * @generated
 * @author eaperador
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BicicletaDTO {

	public BicicletaDTO() {
		// constructor base
	}

	public BicicletaDTO(Long id) {
		this.id = id;
	}

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String referencia;
	
	public String getReferencia() {
		return this.referencia;
	}
	
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	/**
	 * @generated
	 */
	private Long serial;

	/**
	 * @generated
	 */
	private Integer precio;

	/**
	 * @generated
	 */
	private Integer precioAlquiler;

	/**
	 * @generated
	 */
	private String foto;

	/**
	 * @generated
	 */
	private ProveedorDTO proveedor;

	/**
	 * @generated
	 */
	private List<PrestamoDTO> prestamos;

	public List<PrestamoDTO> getPrestamos() {
		if (this.prestamos == null) {
			prestamos = new ArrayList<PrestamoDTO>();
		}
		return prestamos;
	}

	public void setPrestamos(List<PrestamoDTO> prestamos) {
		this.prestamos = prestamos;
	}

	/**
	 * @generated
	 */
	private MarcaDTO marca;

	/**
	 * @return
	 * @generated
	 */
	public Long getSerial() {
		return this.serial;
	}

	/**
	 * @param
	 * @generated
	 */
	public void setSerial(Long serial) {
		this.serial = serial;
	}

	/**
	 * @return
	 * @generated
	 */
	public Integer getPrecio() {
		return this.precio;
	}

	/**
	 * @param
	 * @generated
	 */
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	/**
	 * @return
	 * @generated
	 */
	public Integer getPrecioAlquiler() {
		return this.precioAlquiler;
	}

	/**
	 * @param
	 * @generated
	 */
	public void setPrecioAlquiler(Integer precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	/**
	 * @return
	 * @generated
	 */
	public String getFoto() {
		return this.foto;
	}

	/**
	 * @param
	 * @generated
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}

	/**
	 * @return
	 * @generated
	 */
	public ProveedorDTO getProveedor() {
		return this.proveedor;
	}

	/**
	 * @param
	 * @generated
	 */
	public void setProveedor(ProveedorDTO proveedor) {
		this.proveedor = proveedor;
	}

	/**
	 * @return
	 * @generated
	 */
	public MarcaDTO getMarca() {
		return this.marca;
	}

	/**
	 * @param
	 * @generated
	 */
	public void setMarca(MarcaDTO marca) {
		this.marca = marca;
	}

}
