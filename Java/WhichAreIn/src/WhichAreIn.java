	import java.util.Arrays;
	
	///https://www.codewars.com/kata/which-are-in/train/java
	public class WhichAreIn {
	
		public static String[] inArray(String[] array1, String[] array2) {
			
			if (validate(array1, array2)) {
				String[] arrayR = new String[array1.length];
				
				boolean exists;
				
				for (int i = 0; i < array1.length; i++) {
					exists = false;
					for (int k = 0; k < array2.length; k++) {
						if (array2[k].contains(array1[i])) {
							exists = true;
							break;
						}
					}
					
					if (exists)
						arrayR[i] = array1[i];
				}
				
				Arrays.sort(arrayR);
				return arrayR;
			}
			
	
			return new String[] {};
			
		}
		
		private static boolean validate(String[] array1, String[] array2) {
			
			if (array1 == null || array2 == null)
				return false;
			else if (array1.length == 0 || array2.length == 0)
				return false;
			
			return true;
		}
	}
