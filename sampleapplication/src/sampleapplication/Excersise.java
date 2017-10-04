package sampleapplication;

public class Excersise {
	public static void main(String args[]) {
	int b = 1;
	int c = 2, d;
	long sum = 0L;
	while(c < 4000000) {
	    sum += c;
	    d = b+(c<<0x01);
	    c = d+b+c;
	    b = d;
	}
	System.out.println(sum);
}
}
