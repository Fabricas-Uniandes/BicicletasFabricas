
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;
import Bicishare.servicio.*;

/**
 * Esta clase registra la informacion de las clases que van a ser utilizadas
 * como servicios REST
 * 
 * @author eaperador
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
		addRestResourceClasses(resources);
		return resources;
	}

	private void addRestResourceClasses(Set<Class<?>> resources) {
		resources.add(MarcaServicio.class);
		resources.add(LogroServicio.class);
		resources.add(BonificacionGanadaServicio.class);
		resources.add(MultaServicio.class);
		resources.add(BicicletaServicio.class);
		resources.add(PSEServicio.class);
		resources.add(MedioDePagoServicio.class);
		resources.add(TarjetaCreditoServicio.class);
		resources.add(MedioDePagoUsoServicio.class);
		resources.add(ProveedorServicio.class);
		resources.add(ConvenioServicio.class);
		resources.add(EfectivoServicio.class);
		resources.add(BiciusuarioServicio.class);
		resources.add(AccesorioServicio.class);
		resources.add(PagoServicio.class);
		resources.add(PrestamoServicio.class);
		resources.add(BonificacionServicio.class);
		resources.add(UsuarioServicio.class);
	}

}
