
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;
import Bicishare.servicio.*;

/**
 * Esta clase registra la informacion de las clases que van a ser utilizadas como servicios REST
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
        resources.add(Bicishare.servicio.AccesorioServicio.class);
resources.add(Bicishare.servicio.BicicletaServicio.class);
resources.add(Bicishare.servicio.BiciusuarioServicio.class);
resources.add(Bicishare.servicio.BonificacionGanadaServicio.class);
resources.add(Bicishare.servicio.BonificacionServicio.class);
resources.add(Bicishare.servicio.ConvenioServicio.class);
resources.add(Bicishare.servicio.EfectivoServicio.class);
resources.add(Bicishare.servicio.LogroServicio.class);
resources.add(Bicishare.servicio.MarcaServicio.class);
resources.add(Bicishare.servicio.MedioDePagoServicio.class);
resources.add(Bicishare.servicio.MedioDePagoUsoServicio.class);
resources.add(Bicishare.servicio.MultaServicio.class);
resources.add(Bicishare.servicio.PSEServicio.class);
resources.add(Bicishare.servicio.PagoServicio.class);
resources.add(Bicishare.servicio.PrestamoServicio.class);
resources.add(Bicishare.servicio.ProveedorServicio.class);
resources.add(Bicishare.servicio.TarjetaCreditoServicio.class);
resources.add(Bicishare.servicio.UsuarioServicio.class);
    }
    
}

