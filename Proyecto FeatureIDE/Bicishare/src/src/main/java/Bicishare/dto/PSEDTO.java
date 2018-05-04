package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 * @generated
 * @author eaperador
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PSEDTO extends MedioDePagoDTO {

	public PSEDTO() {
		// constructor base
	}

	public PSEDTO(Long id) {
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
	private String Banco;

	/**
	 * @generated
	 */
	private String Configuracion;

	/**
	 * @return
	 * @generated
	 */
	public String getBanco() {
		return this.Banco;
	}

	/**
	 * @param
	 * @generated
	 */
	public void setBanco(String Banco) {
		this.Banco = Banco;
	}

	/**
	 * @return
	 * @generated
	 */
	public String getConfiguracion() {
		return this.Configuracion;
	}

	/**
	 * @param
	 * @generated
	 */
	public void setConfiguracion(String Configuracion) {
		this.Configuracion = Configuracion;
	}

}
