package random.main.java;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TestData {
	public static List<Map<String, String>> getExpectedData (boolean allEntries) {
		Map<String, String> row1 = new HashMap<>();
		row1.put("City", "Munich");
		row1.put("PostalCode", "81549");
		Map<String, String> row2 = new HashMap<>();
		row2.put("City", "Nuremberg");
		row2.put("PostalCode", "90443");
		if (allEntries) {
			row1.put("Number", "116");
			row1.put("Street", "Chiemgaustr");
			row2.put("Number", "52a");
			row2.put("Street", "Ulmenstraße");
		}
		List<Map<String, String>> list = new LinkedList<>();
		list.add(row1);
		list.add(row2);
		return list;
	}
	
	public static List<Map<String, Object>> getActualData (boolean theOtherOne) {
		Map<String, Object> row1 = new HashMap<>();
		row1.put("City", "Munich");
		row1.put("PostalCode", 81549);
		row1.put("Street", "Chiemgaustr");
		row1.put("Number", "116");
		Map<String, Object> row2 = new HashMap<>();
		row2.put("City", "Nuremberg");
		row2.put("PostalCode", 90443);
		if (theOtherOne) {
			row2.put("Street", "Ulmenstr");
			row2.put("Number", "52");	
		}
		else {
			row2.put("Street", "Ulmenstraße");
			row2.put("Number", "52a");				
		}
		List<Map<String, Object>> list = new LinkedList<>();
		list.add(row2);
		list.add(row1);
		return list;
	}
	
	public static List<Map<String, Object>> getMoreActualData () {
		Map<String, Object> row1 = new HashMap<>();
		row1.put("City", "Munich");
		row1.put("PostalCode", 81549);
		row1.put("Street", "Chiemgaustr");
		row1.put("Number", "116");
		List<Map<String, Object>> list = new LinkedList<>();
		list.add(row1);
		return list;
	}
}
