package be.steformations.tunsajan.jd.datyasheet.beans;

import java.util.Date;

import be.steformations.java_data.timesheets.entities.Employee;
import be.steformations.java_data.timesheets.entities.Prestation;
import be.steformations.java_data.timesheets.entities.Project;

public class BeansPrestation implements Prestation{
	private Long _id;
	private Date _date;
	private Employee _employee;
	private Project _project;
	private int _duree;
	private String _comment;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return this._id;
	}

	@Override
	public Date getDay() {
		// TODO Auto-generated method stub
		return this._date;
	}

	@Override
	public Employee getEmployee() {
		// TODO Auto-generated method stub
		return this._employee;
	}

	@Override
	public Project getProject() {
		// TODO Auto-generated method stub
		return this._project;
	}

	@Override
	public int getDuration() {
		// TODO Auto-generated method stub
		return this._duree;
	}

	@Override
	public String getComment() {
		// TODO Auto-generated method stub
		return this._comment;
	}

}
