package be.steformations.tunsajan.jd.datyasheet.beans;

import java.util.Date;

import be.steformations.java_data.timesheets.entities.Employee;
import be.steformations.java_data.timesheets.entities.Project;

public class BeansProject implements Project {
	private Long _id;
	private String _nom;
	private String _description;
	private Date _start;
	private Date _end;
	private Employee _manager;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this._nom;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this._description;
	}

	@Override
	public Date getStartDate() {
		// TODO Auto-generated method stub
		return this._start;
	}

	@Override
	public Date getEndDate() {
		// TODO Auto-generated method stub
		return this._end;
	}

	@Override
	public Employee getManager() {
		// TODO Auto-generated method stub
		return this._manager;
	}

}
