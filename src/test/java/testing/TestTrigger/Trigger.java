package testing.TestTrigger;

import java.io.IOException;

import testing.TestCases.TC_01;
import testing.TestCases.TC_02;
import testing.TestCases.TC_03;
import testing.TestCases.TC_04;

public class Trigger {
	
	public static void main(String[] args) throws IOException {
		

		System.out.println("Executing TC_02 : POST() request");
		TC_02 tc2Obj = new TC_02();
		tc2Obj.testCase2();
		System.out.println("-----------End of Test case 2 the POST() request -----------------");
		
		
		System.out.println("Executing TC_01 : GET() request");
		TC_01 tc1Obj = new TC_01();
		tc1Obj.testCase1();
		System.out.println("-----------End of Test case 1 the GET() request -----------------");
		
		
		
		System.out.println("Executing TC_04 : PUT() request");
		TC_04 tc4Obj = new TC_04();
		tc4Obj.testCase4();
		System.out.println("-----------End of Test case 4 the PUT() request -----------------");
		
		System.out.println("Executing TC_03 : DELETE() request");
		TC_03 tc3Obj = new TC_03();
		tc3Obj.testCase3();
		System.out.println("-----------End of Test case 3 the DELETE() request -----------------");
		
		
	}

}
