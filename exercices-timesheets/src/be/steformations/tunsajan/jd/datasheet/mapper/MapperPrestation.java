package be.steformations.tunsajan.jd.datasheet.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import be.steformations.java_data.timesheets.entities.Prestation;

public class MapperPrestation implements RowMapper<Prestation>{

	@Override
	public Prestation mapRow(ResultSet rs, int row) throws SQLException {
		
		
		return null;
	}

}
