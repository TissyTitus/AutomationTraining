package java_training;

import java.io.IOException;

public class SampleMaven {
public static void main(String args[])throws IOException
{
	SampleMaven1 ob=new SampleMaven1();
	String a=ob.readData(0,0);
	System.out.println("values of a is"+a);
	String b=ob.readData(0,1);
	System.out.println("values of b is"+b);
}
}
