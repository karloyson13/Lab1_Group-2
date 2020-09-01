	import java.util.Map;
	import java.util.TreeMap;
	public class Date implements Comparable {
		//parent = interface, implements gagamitin
				int month;
				int day;
				int year;
				
				Date(int m, int d, int y){
					this.month = m;
					this.day = d;
					this.year = y;
				}
				
				public int compareTo(Object arg0) {
					Date other = (Date) arg0;
					if(this.year > other.year) { //present date object = this  
						return 1;
					}else if (this.year < other.year) {
						return -1;
					}else { 
						if(this.month > other.month) {
							return 1;
						}else if(this.month < other.month) {
							return -1;
						}else {
							if(this.day > other.day) {
								return 1;
							}else {
								return 0;
							}
						}
					}
				}

				@Override
				public String toString() {
					return "" + this.month + "/" + this.day + "/" + this.year;
				}		

					
						public static void main(String[] args) {
							Date d1 = new Date(9, 10, 2002);
							Date d2 = new Date(8,20,2016);
							Date d3 = new Date(4,16,2005);
							Date d4 = new Date(3,24,2010);
							
							TreeMap<Date, String> syllabus = new TreeMap();
							syllabus.put(d1, "Java");
							syllabus.put(d2, "Python");
							syllabus.put(d3, "C++");
							syllabus.put(d4, "JavaScript");
							
							for(Map.Entry<Date, String> topic: syllabus.entrySet()) {
								if(topic.getKey().month == 9 && topic.getKey().year == 2002) {
									System.out.println(topic.getValue());
								}else {
									System.out.println(topic.getValue() + " does not fall in September, 2002");

						}

					}

						}

	}
