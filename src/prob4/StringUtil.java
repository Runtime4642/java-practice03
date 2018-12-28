package prob4;

public class StringUtil {
	 static private String result="";
		public static String concatenate(String[] str) {
	      
			for(int i=0;i<str.length;i++)
				result+=str[i];
			return result;
	    }

}
