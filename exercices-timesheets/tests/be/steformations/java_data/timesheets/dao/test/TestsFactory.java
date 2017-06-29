package be.steformations.java_data.timesheets.dao.test;

import be.steformations.java_data.timesheets.service.TimesheetsDataService;
import be.steformations.tunsajan.jd.datasheet.dao.DAOService;

public class TestsFactory {
	
	public static TimesheetsDataService createTimesheetsDataService() {
		// TODO
		return new DAOService();
	}
}
