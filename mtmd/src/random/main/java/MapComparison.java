package random.main.java;

import java.util.List;
import java.util.Map;

public class MapComparison {

	/**
	 * Task: Write a method which compares both Lists with "expectedData" to all "actualData" Lists.
	 * Should return true: if all Keys in expected Data, exist in actualData and have the same Value
	 */
	List<Map<String, String>> expectedData1 = TestData.getExpectedData(true);
	List<Map<String, String>> expectedData2 = TestData.getExpectedData(false);
	List<Map<String, Object>> actualData1 = TestData.getActualData(false);
	List<Map<String, Object>> actualData2 = TestData.getActualData(true);
	List<Map<String, Object>> actualData3 = TestData.getMoreActualData();
}
