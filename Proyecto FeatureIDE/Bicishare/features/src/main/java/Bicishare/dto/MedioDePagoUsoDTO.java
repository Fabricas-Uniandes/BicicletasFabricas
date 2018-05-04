package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 * @generated
 * @author eaperador
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MedioDePagoUsoDTO {

	public MedioDePagoUsoDTO() {
		// constructor base
	}

	public MedioDePagoUsoDTO(Long id) {
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
	private String RegistroJson;

	/**
	 * @generated
	 */
	private PagoDTO Pago;

	/**
	 * @generated
	 */
	private MedioDePagoDTO MedioDePago;

	/**
	 * @return
	 * @generated
	 */
	public String getRegistroJson() {
		return this.RegistroJson;
	}

	/**
	 * @param
	 * @generated
	 */
	public void setRegistroJson(String RegistroJson) {
		this.RegistroJson = RegistroJson;
	}

	/**
	 * @return
	 * @generated
	 */
	public PagoDTO getPago() {
		return this.Pago;
	}

	/**
	 * @param
	 * @generated
	 */
	public void setPago(PagoDTO Pago) {
		this.Pago = Pago;
	}

	/**
	 * @return
	 * @generated
	 */
	public MedioDePagoDTO getMedioDePago() {
		return this.MedioDePago;
	}

	/**
	 * @param
	 * @generated
	 */
	public void setMedioDePago(MedioDePagoDTO MedioDePago) {
		this.MedioDePago = MedioDePago;
	}

}
