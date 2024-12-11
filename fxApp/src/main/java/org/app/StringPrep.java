package org.app;

public class StringPrep {
	
	public String prep(String str, String beg, String ends) {
	
//		String str = new String("cjdshcbsdh \'text=mail@mail.com\' skmsdkcnjds");
		
		int s = str.indexOf(beg) + beg.length();
		str = str.substring(s, str.length());
		s = str.indexOf(ends);
		str = str.substring(0, s);
				
//		System.out.println(str);
		
		return str;
	}

}
