package basicjava;

import java.util.ArrayList;

public class RecursionExercises{
	
	public static int countDigits(int i) {
		int iout = 1;
		if(i/10>0) {
			iout+= countDigits(i/10);
		}
		return iout;
	}
	public static int addDigits(int i) {
		int iout = 0;
		if(i<10) {
			iout+= i;
		}
		else {
			iout+= i%10;
			iout+= addDigits(i/10);
		}
		return iout;
	}
	public static int sum(int sumFrom,int sumTo) {
		int iout = 0;
		if(sumFrom<sumTo&& sumFrom>=0) {
			iout += sumFrom;
			iout += sum(sumFrom+1,sumTo);
		}
		if(sumFrom==sumTo && sumTo > 0) {
			iout += sumFrom;
		}
		return iout;
	}
	public static int sumEvenNumbers(int i) {
		int iout = 0;
		if(i%2 !=0) {
			i=i-1;
		}
		if(i>=2) {
			iout+= i;
			iout += sumEvenNumbers(i-2);
		}
		return iout;
	}
	public static int sumOfMultiple(ArrayList<Integer> arrInt) {
		int iout = 0;
		if(arrInt!= null && arrInt.size()>=1) {
			if(arrInt.get(0)%5 ==0) {
				iout += arrInt.get(0);
			}
			arrInt.remove(0);
			iout+= sumOfMultiple(arrInt);
		}
		return iout;
	}
	public static int countVowels(String s) {
		int iout = 0;
		String c = "";
		if(s!=null && s.length() != 0) {
			c += s.charAt(0);
			if(c.equalsIgnoreCase("A")||c.equalsIgnoreCase("E")||c.equalsIgnoreCase("I")||c.equalsIgnoreCase("O")||c.equalsIgnoreCase("U")) {
				iout++;
			}
			if(s.length()>1) {
				iout+= countVowels(s.substring(1));
			}
		}
		
		return iout;
	}
	public static String removeVowels(String s) {
		//String sout = s+"";
		//java.lang.AssertionError: Testing removeVowels for null string. expected:<null> but was:<nll>
		String sout = s;

		if(sout!=null && sout.length() != 0) {
//			sout = sout.replaceAll("a", "");
//			sout = sout.replaceAll("e", "");
//			sout = sout.replaceAll("i", "");
//			sout = sout.replaceAll("o", "");
//			sout = sout.replaceAll("u", "");
//			sout = sout.replaceAll("A", "");
//			sout = sout.replaceAll("E", "");
//			sout = sout.replaceAll("I", "");
//			sout = sout.replaceAll("O", "");
//			sout = sout.replaceAll("U", "");
//		}
			//yeah this is a great solution and all, but what if it was RECURSIVE!?!?!?!?!?!
			
			if(sout.toLowerCase().contains("a")) {
				sout = sout.replaceFirst("a", "");
				sout = sout.replaceFirst("A", "");
				sout = removeVowels(sout);
			}
			if(sout.toLowerCase().contains("e")) {
				sout = sout.replaceFirst("e", "");
				sout = sout.replaceFirst("E", "");
				sout = removeVowels(sout);
			}
			if(sout.toLowerCase().contains("i")) {
				sout = sout.replaceFirst("i", "");
				sout = sout.replaceFirst("I", "");
				sout = removeVowels(sout);
			}
			if(sout.toLowerCase().contains("o")) {
				sout = sout.replaceFirst("o", "");
				sout = sout.replaceFirst("O", "");
				sout = removeVowels(sout);
			}
			if(sout.toLowerCase().contains("u")) {
				sout = sout.replaceFirst("u", "");
				sout = sout.replaceFirst("U", "");
				sout = removeVowels(sout);
			}
			//Oh yeah, much better
			sout = sout.strip();
		}
		return sout;
	}
	
}
