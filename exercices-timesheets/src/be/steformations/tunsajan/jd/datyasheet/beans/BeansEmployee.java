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

	
	public BeansEmployee(Long id, String firstname, String name, String password, String login ) {
		this._id = id;
		this._firstname = firstname;
		this._name = name;
		this._login = login;
		this._password = password;
		this._projects = null;
		this._prestations = null;
	}
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
	public void setProject(List<Project> projets){
		this._projects = projets;
	}
	public void setPrestations(List<Prestation> prestations){
		this._prestations = prestations;
	}
	@Override
	public String toString() {
		return "BeansEmployee [_id=" + _id + ", _firstname=" + _firstname + ", _name=" + _name + ", _login=" + _login
				+ ", _password=" + _password + "]";
	}
	

}
