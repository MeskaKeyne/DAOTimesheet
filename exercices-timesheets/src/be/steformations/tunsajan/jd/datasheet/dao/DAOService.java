package be.steformations.tunsajan.jd.datasheet.dao;

import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import be.steformations.java_data.timesheets.entities.Employee;
import be.steformations.java_data.timesheets.entities.Prestation;
import be.steformations.java_data.timesheets.entities.Project;
import be.steformations.java_data.timesheets.service.TimesheetsDataService;

public class DAOService implements TimesheetsDataService {
	private JdbcTemplate _jdbc;
	
	public DAOService() {
		//this.jdbc = new JdbcTemplate(new DriverManagerDataSource("jdbc:postgresql://localhost/datasheet", "postgres", "postgres"));
		this._jdbc = new JdbcTemplate(new DriverManagerDataSource("jdbc:postgresql://PRIM2014-14/datasheet", "postgres", "postgres"));
	}
	

	@Override
	public List<? extends Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findOneEmployeeById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findOneEmployeeByFirstnameAndName(String firstname, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findOneEmployeeByLoginAndPassword(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends Project> findAllProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project findOneProjectById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project findOneProjectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prestation findOnePrestationById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends Prestation> findAllPrestationsByEmployeeId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends Prestation> findAllPrestationsByProjectId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prestation addPrestation(long employeeId, long projectId, String comment, Date day, int duration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prestation deletePrestation(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
