package pe.edu.unsch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.unsch.dao.CargaAcademicaDAO;
import pe.edu.unsch.entity.CargaAcademica;

@Service("cargaAcademicaeService")
@Transactional
public class CargaAcademicaServiceImpl implements CargaAcademicaService {

	@Autowired
	private CargaAcademicaDAO cargaAcademicaDao;

	@Override
	public List<CargaAcademica> listarPorDocente() {
		return cargaAcademicaDao.listarPorDocente();
	}

}
