package be.steformations.tunsajan.jd.datyasheet.beans;

import java.util.List;

import be.steformations.java_data.timesheets.entities.Employee;
import be.steformations.java_data.timesheets.entities.Prestation;
import be.steformations.java_data.timesheets.entities.Project;

public class BeansEmployee implements Employee {
	
	private Long _id;
	private String _firstname;
	private String  _name;
	private String _login;
	private String _password;
	private List<Project> _projects;
	private List<Prestation> _prestations;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return this._id;
	}

	@Override
	public String getFirstname() {
		// TODO Auto-generated method stub
		return this._firstname;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this._name;
	}

	@Override
	public String getLogin() {
		// TODO Auto-generated method stub
		return this._login;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this._password;
	}

	@Override
	public List<? extends Project> getManagedProjects() {
		// TODO Auto-generated method stub
		return this._projects;
	}

	@Override
	public List<? extends Prestation> getPrestations() {
		// TODO Auto-generated method stub
		return this._prestations;
	}

}
