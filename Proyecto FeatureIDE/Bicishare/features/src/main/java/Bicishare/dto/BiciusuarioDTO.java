package Bicishare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 * @generated
 * @author eaperador
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BiciusuarioDTO extends UsuarioDTO {

	public BiciusuarioDTO() {
		// constructor base
	}

	public BiciusuarioDTO(Long id) {
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
	private Long numeroDocumento;

	/**
	 * @generated
	 */
	private String foto;

	/**
	 * @generated
	 */
	private List<TarjetaCreditoDTO> tarjetaCredito;

	public List<TarjetaCreditoDTO> getTarjetaCredito() {
		if (this.tarjetaCredito == null) {
			tarjetaCredito = new ArrayList<TarjetaCreditoDTO>();
		}
		return tarjetaCredito;
	}

	public void setTarjetaCredito(List<TarjetaCreditoDTO> tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	/**
	 * @generated
	 */
	private List<BonificacionGanadaDTO> bonificacion;

	public List<BonificacionGanadaDTO> getBonificacion() {
		if (this.bonificacion == null) {
			bonificacion = new ArrayList<BonificacionGanadaDTO>();
		}
		return bonificacion;
	}

	public void setBonificacion(List<BonificacionGanadaDTO> bonificacion) {
		this.bonificacion = bonificacion;
	}

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
	private List<LogroClienteDTO> logro;

	public List<LogroClienteDTO> getLogro() {
		if (this.logro == null) {
			logro = new ArrayList<LogroClienteDTO>();
		}
		return logro;
	}

	public void setLogro(List<LogroClienteDTO> logro) {
		this.logro = logro;
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

	/**
	 * @return
	 * @generated
	 */
	public Long getNumeroDocumento() {
		return this.numeroDocumento;
	}

	/**
	 * @param
	 * @generated
	 */
	public void setNumeroDocumento(Long numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
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

}
