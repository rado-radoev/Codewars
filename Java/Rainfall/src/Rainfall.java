// https://www.codewars.com/kata/rainfall/train/java

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.*;

public class Rainfall {
		
	public static String data = 
		     "Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
		     "\n" +
		     "London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9" +
		     "\n" +
		     "Paris:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
		     "\n" +
		     "NY:Jan 108.7,Feb 101.8,Mar 131.9,Apr 93.5,May 98.8,Jun 93.6,Jul 102.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
		     "\n" +
		     "Vancouver:Jan 145.7,Feb 121.4,Mar 102.3,Apr 69.2,May 55.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 59.6,Oct 116.3,Nov 154.6,Dec 171.5" +
		     "\n" +
		     "Sydney:Jan 103.4,Feb 111.0,Mar 131.3,Apr 129.7,May 123.0,Jun 129.2,Jul 102.8,Aug 80.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
		     "\n" +
		     "Bangkok:Jan 10.6,Feb 28.2,Mar 30.7,Apr 71.8,May 189.4,Jun 151.7,Jul 158.2,Aug 187.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
		     "\n" +
		     "Tokyo:Jan 49.9,Feb 71.5,Mar 106.4,Apr 129.2,May 144.0,Jun 176.0,Jul 135.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
		     "\n" +
		     "Beijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 18.0,Nov 9.3,Dec 2.7" +
		     "\n" +
		     "Lima:Jan 1.2,Feb 0.9,Mar 0.7,Apr 0.4,May 0.6,Jun 1.8,Jul 4.4,Aug 3.1,Sep 3.3,Oct 1.7,Nov 0.5,Dec 0.7";

	
	public static void main(String[] args) {

		String[]s = data.split("\\n");
		String[] cityname =  new String[s.length];
		String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		String[] raindata;
		
		ArrayList<HashMap> cities;
		
		
		int z = 0;
		for (String str : s) {
			int colon = str.indexOf(":");
			cityname[z] = str.substring(0, colon);
			System.out.println(cityname[z]);
			z++;
		}
		
		for (String str : s) {
			raindata = str.split("(\\w+\\:\\w+\\s)|(\\,\\w+\\s)");
			for (int i = 0; i < raindata.length;i++) {
				//System.out.println(data[i]);
			}
		}
		
		for (int i = 0; i < cityname.length; i++) {
		}
		
		
		
		
		
		
		
		
//		Pattern city = Pattern.compile("^[a-zA-Z]+[^:]");
//		Pattern month = Pattern.compile("[a-zA-Z]+\\s");
//		Pattern rainData = Pattern.compile("[0-9]+.[^,]");		
//		Matcher matchCity = city.matcher(str);
//		matchCity.find();
//		System.out.println(matchCity.group());
//		
//
//		Matcher matchMonth = month.matcher(str);
//		matchMonth.find();
//		System.out.println(matchMonth.group());
//		
//		
//		Matcher matchRainData = rainData.matcher(str);
//		matchRainData.find();
//		System.out.println(matchRainData.group());
//		
//		System.out.println("---------------------------------");
		
		
		//Map<HashMap> citiesHashSet = new Map<HashMap>();
//		HashMap<String, Double> monthsHashMaps = new HashMap<String, Double>();
//		int endCity = 0;
//		int endMonth = 0;
//		for (String str : s) {
//			Pattern city = Pattern.compile("^[a-zA-Z]+[^:]");
//			Matcher matchCity = city.matcher(str);
//			
//			// Getting the city name and adding it to a hashSet
//			 matchCity.find();
//			 System.out.print(matchCity.start());
//			 System.out.print("||");
//			 System.out.print(matchCity.end());
//			 System.out.print("::");
//			 System.out.print(matchCity.group());
//			 System.out.println();
//			 //System.out.println(matchCity.group());
//			 //citiesHashSet.add(matchCity.group());
//
//			
//			
//			// Getting the month
//			Pattern month = Pattern.compile("[a-zA-Z]+\\s");
//			Matcher matchMonth = month.matcher(str);
//			matchMonth.find(endMonth);
//			System.out.print(matchMonth.start());
//			System.out.print("||");
//			System.out.print(matchMonth.end());
//			System.out.print("::");
//			System.out.print(matchMonth.group().trim());
//			System.out.println();
//			 if (matchMonth.find(endMonth)) {
//				 endMonth = matchMonth.end();
//			 }
//			//monthsHashMaps.put(matchMonth.group(), null);
//			
//			
//			// Getting the rain data
//			Pattern rainData = Pattern.compile("[0-9]+.[^,]");
//			Matcher matchRainData = rainData.matcher(str);
//			while (matchRainData.find()) {
//				//System.out.println(matchRainData.group());
//			}
//		}
//		
//		
////		Iterator<String> citiesHashMapKeyIterator = citiesHashSet.iterator();
////		while (citiesHashMapKeyIterator.hasNext()) {
////			String city = citiesHashMapKeyIterator.next();
////			System.out.println(city);
////		}
	}
}

//	public static double mean(String town, String strng) {
//		// your code
//	}
//	public static double variance(String town, String strng) {
//		// your code
//	}


// 1. Must breakdown data and data1 strings to:
// 	a) Records (separated by new line)
//  b) Towns (end with : )
//  c) Each month - start with month name space and rainfall as double then comma
// 2. Decide how to do it - arryas, lists, hashmaps ?
// 3. Calculate mean and variance using the website http://www.mathsisfun.com/data/standard-deviation.html

// Regex for the city: ^[a-zA-Z]+[^:]
// Regex for the month: [a-zA-Z]+[^\ ]
// Regex for the temp:  [0-9]+.[^,]   \d+\.\d+
// Regex for new line: 	(^.+)
//http://www.ocpsoft.org/opensource/guide-to-regular-expressions-in-java-part-1/


// Create hash map that has a month as a key and number as value, hash map will be named as the city name
// Create array list of city names (hashmaps)

// Go through the array and search for city name
// when you find the city loop thorugh that hashmap
// do the magic on every value for every key
