import java.util.Map;
import java.util.TreeMap;

public class TestDate2 {
public static void main(String[] args) {
	Date d1 = new Date(9,12,2002);
	Date d2 = new Date(1,12,2006);		
	Date d3 = new Date(2,13,2009);
	Date d4 = new Date(4,23,2012);
	
	TreeMap<Date,String> syllabus = new TreeMap();
	syllabus.put(d1, "Java");
	syllabus.put(d2, "Python ");
	syllabus.put(d3, "C++ ");
	syllabus.put(d4, "JavaScript ");
	
	for(Map.Entry<Date, String> topic:syllabus.entrySet()) {
		if(topic.getKey().month == 9 && topic.getKey().year == 2002) {
			System.out.println(topic.getValue());
		}else {
			System.out.println(topic.getValue()+ "does not fall in September, 2002");
		}
	}
   }
}