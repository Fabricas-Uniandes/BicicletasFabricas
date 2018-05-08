package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 * @author camilofg
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BancoDTO {

	public BancoDTO() {
		// constructor base
	}

	public BancoDTO(Long id) {
		this.id = id;
	}

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @generated
	 */
	private String nombre;

	/**
	 * @return
	 * @generated
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * @param
	 * @generated
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private List<PagoDTO> pago;

	public List<PagoDTO> getPago() {
		if (this.pago == null) {
			pago = new ArrayList<PagoDTO>();
		}
		return pago;
	}

	public void setPago(List<PagoDTO> pago) {
		this.pago = pago;
	}

}
