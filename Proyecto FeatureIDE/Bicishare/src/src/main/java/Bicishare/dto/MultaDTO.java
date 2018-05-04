package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 * @generated
 * @author eaperador
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MultaDTO {

	public MultaDTO() {
		// constructor base
	}

	public MultaDTO(Long id) {
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
	private Integer valor;

	/**
	 * @generated
	 */
	private String fecha;

	/**
	 * @generated
	 */
	private PrestamoDTO prestamo;

	/**
	 * @return
	 * @generated
	 */
	public Integer getValor() {
		return this.valor;
	}

	/**
	 * @param
	 * @generated
	 */
	public void setValor(Integer valor) {
		this.valor = valor;
	}

	/**
	 * @return
	 * @generated
	 */
	public String getFecha() {
		return this.fecha;
	}

	/**
	 * @param
	 * @generated
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return
	 * @generated
	 */
	public PrestamoDTO getPrestamo() {
		return this.prestamo;
	}

	/**
	 * @param
	 * @generated
	 */
	public void setPrestamo(PrestamoDTO prestamo) {
		this.prestamo = prestamo;
	}

}
