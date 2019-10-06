package codingcompetition2019;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CodingCompCSVUtil {
	public List<List<String>> readCSVFileByCountry(String fileName, String countryName) throws IOException {
		List<List<String>> returnList = new ArrayList<List<String>>();
		
        String csvFile = fileName;
        BufferedReader br = null;
        String line = "";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] data = line.split(",");
                if(data[0].equals(countryName)) {
                    System.out.println("Country: " + data[0]);
                	List<String> arrayList = new ArrayList<String>();
                	for(String str : data)
                		arrayList.add(str);
                	
                	returnList.add(arrayList);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		
		return returnList;
	}
	
	public List<List<String>> readCSVFileWithHeaders(String fileName) throws IOException {
		List<List<String>> returnList = new ArrayList<List<String>>();
		
        String csvFile = fileName;
        BufferedReader br = null;
        String line = "";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] data = line.split(",");
    
            	List<String> arrayList = new ArrayList<String>();
            	for(String str : data)
            		arrayList.add(str);
                	
                returnList.add(arrayList);
                }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		
		return returnList;
	}
	
	public List<List<String>> readCSVFileWithoutHeaders(String fileName) throws IOException {
		List<List<String>> returnList = new ArrayList<List<String>>();
		
        String csvFile = fileName;
        BufferedReader br = null;
        String line = "";
        boolean firstLine = true;

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] data = line.split(",");
                if(!firstLine) {
            	List<String> arrayList = new ArrayList<String>();
            	for(String str : data)
            		arrayList.add(str);
                	
                returnList.add(arrayList);
                } else {
                	firstLine = false;
                }
                }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		
		return returnList;
	}
	
	public DisasterDescription getMostImpactfulYear(List<List<String>> records) {
		int max = 0;
		DisasterDescription returnDD = null;
		for(List<String> list : records) {
			if(Integer.parseInt(list.get(3)) > max) {
				max = Integer.parseInt(list.get(3));
				returnDD = new DisasterDescription(list.get(2),list.get(0),list.get(3));
			}
		}
		
		return returnDD;
	}

	public DisasterDescription getMostImpactfulYearByCategory(String category, List<List<String>> records) {
		// TODO implement this method
		return null;
	}

	public DisasterDescription getMostImpactfulDisasterByYear(String year, List<List<String>> records) {
		// TODO implement this method
		return null;
	}

	public DisasterDescription getTotalReportedIncidentsByCategory(String category, List<List<String>> records) {
		// TODO implement this method
		return null;
	}
	
	/**
	 * This method will return the count if the number of incident falls within the provided range.
	 * To simplify the problem, we assume:
	 * 	+ A value of -1 is provided if the max range is NOT applicable.
	 *  + A min value can be provided, without providing a max value (which then has to be -1 like indicated above).
	 *  + If a max value is provided, then a max value is also needed.
	 */
	public int countImpactfulYearsWithReportedIncidentsWithinRange(List<List<String>> records, int min, int max) {
		// TODO implement this method
		return -1;
	}
	
	public boolean firstRecordsHaveMoreReportedIndicents(List<List<String>> records1, List<List<String>> records2) {
		// TODO implement this method
		return false;
	}
}
