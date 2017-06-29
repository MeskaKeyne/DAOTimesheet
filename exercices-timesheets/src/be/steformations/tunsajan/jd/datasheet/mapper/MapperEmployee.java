package be.steformations.tunsajan.jd.datasheet.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import be.steformations.java_data.timesheets.entities.Employee;
import be.steformations.tunsajan.jd.datyasheet.beans.BeansEmployee;

public class MapperEmployee implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int row) throws SQLException {
		Employee employee = null;
		
		Long id = rs.getLong("id");
		String firstname = rs.getString("firstname");
		String name = rs.getString("name");
		String login = rs.getString("login");
		String password = rs.getString("password");
		
		employee = new BeansEmployee(id, firstname, name, password, login);
		System.out.println(employee);
		
		return employee;
	}

}
