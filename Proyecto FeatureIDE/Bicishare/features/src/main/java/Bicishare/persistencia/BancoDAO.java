package Bicishare.persistencia;

import Bicishare.persistencia.entity.*;
import java.util.List;
import javax.persistence.*;
import javax.ejb.Stateless;


@Stateless
public class BancoDAO {

	@PersistenceContext
	private EntityManager em;
	
	public List<Banco> obtenerTodos() {
		return em.createNamedQuery("Banco.obtenerTodos").getResultList();
	}
}
