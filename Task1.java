package org.string1;

public class Task1 {
	private void sample() {
    String s = "velmurugank451@gmail.com";
    boolean b = s.contains("@");
    System.out.println("present");
    if (b) {
		System.out.println("valid email id");
	} else {
        System.out.println("not a valid email id");
	}
	    
    
        String s2 = "5-35-2a,venkatesh nivas,Aruppukottai";
		boolean b1 = s2.contains("pincode");
		System.out.println("pincode is not present");
		if (b1) {
			System.out.println("valid address");
		} else {
        System.out.println("invalid address");
		}
		
		String s3 = "Nishakerala24@gmail.com";
		boolean b2 = s3.contains("@");
		System.out.println("present");
		if (b2) {
			System.out.println("True");
		} else {
        System.out.println("False");
		}
		
		
		String s4 = "Welcome to class java";
	    String rep = s4.replace("java", "sql");
	    System.out.println(rep);
	    
	    String s5 = "Greens Adayar";
	    String rep1 = s5.replace("Adayar", "Omr");
	    System.out.println(rep1);
	    
	    String s6 = "Welcome to java class";
	    String rep2 = s6.replace(" ", "#");
	    System.out.println(rep2);
	    
	    String s7 = "Nishakerala24@gmail.com";
	    String rep3 = s7.replace("gmail", "yahoo");
	    System.out.println(rep3);
	    
	    String s8 = "5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
	    String rep4 = s8.replace(",pincode-626101", "  ");
	    System.out.println(rep4);
	    
	    String s9 = "NISHANTHI";
	    String low1 = s9.toLowerCase();
	    System.out.println(low1);
	    
	    String s10 = "nishanthi";
	    String up1 = s10.toUpperCase();
	    System.out.println(up1);
	    
	    String s11 = "Welcome to class java";
	    boolean sw = s11.startsWith("Welcome");
	    System.out.println(sw);
	    
	    String s12 = "Hai i am nisha";
	    boolean sw2 = s12.startsWith("Welcome");
	    System.out.println(sw2);
	    
	    String s13 = "Welcome to java class";
	    boolean ew1 = s13.endsWith("java");
	    System.out.println(ew1);
	    
	    String s14 = "";
	    boolean emp = s14.isEmpty();
	    System.out.println(emp);
	    
	    String s15 = "Nisha";
	    String s16 = "Nisha";
	    boolean equ = s15.equals(s16);
	    System.out.println(equ);
	    
	    String s17 = "Nia";
	    String s18 = "nisha";
	    boolean equ1 = s17.equals(s18);
	    System.out.println(equ1);
	    
	    String s19 = "Nisha";
	    String s20 = "Nisha";
	    System.out.println(System.identityHashCode(s19));
	    System.out.println(System.identityHashCode(s20));
	    
	    String s21 = new String("Nisha");
	    String s22 = new String("Nisha");
	    System.out.println(System.identityHashCode(s21));
	    System.out.println(System.identityHashCode(s22));
	    
	    String s23 = new String("Nisha");
	    String s24 = new String("Rengan");
	    String s25 = new String("NishaRengan");
	    System.out.println(System.identityHashCode(s23));
	    System.out.println(System.identityHashCode(s24));
	    System.out.println(System.identityHashCode(s25));
	    
	    String s26 = "Nisha";
	    String s27 = "Rengan";
	    String s28 = "NishaRengan";
	    System.out.println(System.identityHashCode(s26));
	    System.out.println(System.identityHashCode(s27));
	    System.out.println(System.identityHashCode(s28));
	    
	    String s29 = "Welcome to java class";
	    String ss = s29.substring(0,7);
	    System.out.println(ss);
	    
	    String s30 = "Welcome to java class";
	    String ss1 = s30.substring(0, 7);
	    String ss2 = s30.substring(8,10);
	    String ss3 = s30.substring(11, 15);
	    String ss4 = s30.substring(16,21);
	    System.out.println(ss1+"\n"+ss2+"\n"+ss3+"\n"+ss4);
	    
	    String s31 = "Welcome to java class";
	    String ss5 = s31.substring(0, 2);
	    String ss6 = s31.substring(4,17);
	    String ss7 = s31.substring(18,21);
	    System.out.println(ss5+"\n"+ss6+"\n"+ss7);
	 
	}
	    
	public static void main(String[] args) {
		Task1 t = new Task1();
		t.sample();
	}
	
	
	
}
		