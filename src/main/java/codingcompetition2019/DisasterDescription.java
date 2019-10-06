package codingcompetition2019;

public class DisasterDescription {
	
	private String year;
	private String category;
	private int incidentsNum;
	
	public DisasterDescription(String y, String c, int i) {
		year = y;
		category = c;
		incidentsNum =  i;
	}
	
	public String getYear() {
		return this.year;
	}

	public String getCategory() {
		return this.category;
	}

	public int getReportedIncidentsNum() {
		return incidentsNum;
	}
}
