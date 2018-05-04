package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 * @generated
 * @author eaperador
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarcaDTO {

	public MarcaDTO() {
		// constructor base
	}

	public MarcaDTO(Long id) {
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
	 * @generated
	 */
	private List<BicicletaDTO> bicicleta;

	public List<BicicletaDTO> getBicicleta() {
		if (this.bicicleta == null) {
			bicicleta = new ArrayList<BicicletaDTO>();
		}
		return bicicleta;
	}

	public void setBicicleta(List<BicicletaDTO> bicicleta) {
		this.bicicleta = bicicleta;
	}

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

}
