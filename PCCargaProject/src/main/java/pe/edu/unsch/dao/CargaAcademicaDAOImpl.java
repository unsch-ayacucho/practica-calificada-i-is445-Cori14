package pe.edu.unsch.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pe.edu.unsch.entity.CargaAcademica;

@Repository("cargaAcademicaDao")
public class CargaAcademicaDAOImpl implements CargaAcademicaDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<CargaAcademica> listarPorDocente() {
		
		return entityManager.createQuery("From CargaAcademica", CargaAcademica.class)
				.getResultList();
	}

}