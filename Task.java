package org.string1;

public class Task {
private void sample() {
	String s1 = "Java";
	String s2 = "Java";
	String s3 = "Green Technology";
	String s4 = "GreenTechnology.";
	String s5 = "Java";
	String s6 = "java";
	String s7 = "Nisha";
	String s8 = "nisha";
	
    boolean equals = s1.equals(s2);
    boolean equals2 = s3.equals(s4);
    boolean equals3 = s5.equalsIgnoreCase(s6);
    boolean equals4 = s7.equalsIgnoreCase(s8);
	
	System.out.println(equals);
	System.out.println(equals2);
	System.out.println(equals3);
	System.out.println(equals4);

	
}
	public static void main(String[] args) {
		Task t = new Task();
		t.sample();
	}
	
	
	
	
}
