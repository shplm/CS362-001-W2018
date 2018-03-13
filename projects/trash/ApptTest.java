package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;
// import mockit.Tested;
// import mockit.Deencapsolution;
import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
						 Appt appt2 = new Appt(startHour,
						          startMinute ,
						          startDay ,
						          startMonth ,
						          startYear ,
						          title,
						         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertTrue(appt2.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
		 assertEquals("	1/15/2018 at 9:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());
		 assertEquals(false, appt.isRecurring());
		 assertEquals(0, appt.getRecurIncrement());
		 assertEquals(0, appt.getRecurNumber());
		 assertEquals(2, appt.getRecurBy());
		 assertNotNull(appt.getRecurDays());
		 assertNotNull(appt.compareTo(appt2));
	 }/*End test01 function*/

	 @Test
	  public void test02()  throws Throwable  {
		 int startHour=21;
 		 int startMinute=30;
 		 int startDay=15;
 		 int startMonth=01;
 		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
 		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
 	// assertions
	assertEquals(true, appt.getValid());
	assertEquals(false, appt.isRecurring());
	assertEquals(0, appt.getRecurIncrement());
	assertEquals(0, appt.getRecurNumber());
	assertEquals(2, appt.getRecurBy());
	assertNotNull(appt.getRecurDays());
		appt.setStartHour(21);
assertEquals("	1/15/2018 at 9:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());
		appt.setStartMinute(30);
assertEquals("	1/15/2018 at 9:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());
		appt.setStartDay(15);
assertEquals("	1/15/2018 at 9:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());
		appt.setStartMonth(01);
assertEquals("	1/15/2018 at 9:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());
		appt.setStartYear(2018);
assertEquals("	1/15/2018 at 9:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());
		appt.setTitle("");
assertEquals("	1/15/2018 at 9:30pm ,, This is my birthday party.\n", appt.toString());
		appt.setDescription("");
assertEquals("	1/15/2018 at 9:30pm ,, \n", appt.toString());
	 }/*End test02 function*/
//add more unit tests as you needed

@Test
 public void test04()  throws Throwable  {
	 int startHour=21;
	 int startMinute=30;
	 int startDay=100;
	 int startMonth=01;
	 int startYear=2018;
	 String title="Birthday Party";
	 String description="This is my birthday party.";
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
// assertions
assertEquals(false, appt.getValid());
assertEquals(null, appt.toString());
}/*End test04 function*/

@Test
 public void test05()  throws Throwable  {
	 int startHour=0;
	 int startMinute=30;
	 int startDay=15;
	 int startMonth=01;
	 int startYear=2018;
	 String title=null;
	 String description=null;
	 int[] recurringDays = null;
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
// assertions
assertEquals(false, appt.getValid());
appt.setRecurrence(recurringDays, 2, 0, 0);
assertEquals(2, appt.getRecurBy());
assertEquals(0, appt.getRecurIncrement());
assertEquals(0, appt.getRecurNumber());
assertNotNull(appt.getRecurDays());
}/*End test05 function*/

@Test
 public void test06()  throws Throwable  {
	 int startHour=21;
	int startMinute=-5;
	int startDay=15;
	int startMonth=01;
	int startYear=2018;
	String title="";
	String description="";

	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
// assertions
	assertEquals(false, appt.getValid());
}/*End test06 function*/

@Test
 public void test07()  throws Throwable  {
	 int startHour=0;
	int startMinute=30;
	int startDay=15;
	int startMonth=01;
	int startYear=2018;
	String title="Birthday Party";
	String description="This is my birthday party.";

	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
// assertions
	assertEquals(false, appt.getValid());
	assertEquals(null, appt.toString());
}/*End test07 function*/

@Test
 public void test08()  throws Throwable  {
	 int startHour=21;
	 int startMinute=60;
	 int startDay=15;
	 int startMonth=01;
	 int startYear=2018;
	 String title="Birthday Party";
	 String description="This is my birthday party.";
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
// assertions
	assertEquals(false, appt.getValid());
}/*End test08 function*/

@Test
 public void test09()  throws Throwable  {
	 int startHour=21;
	 int startMinute=30;
	 int startDay=0;
	 int startMonth=01;
	 int startYear=2018;
	 String title="Birthday Party";
	 String description="This is my birthday party.";
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
// assertions
	assertEquals(false, appt.getValid());
}/*End test09 function*/

@Test
 public void test11()  throws Throwable  {
	 int startHour=3;
	 int startMinute=30;
	 int startDay=15;
	 int startMonth=01;
	 int startYear=2018;
	 String title="Birthday Party";
	 String description="This is my birthday party.";
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
// assertions
	assertTrue(appt.getValid());
assertEquals("	1/15/2018 at 3:30am ,Birthday Party, This is my birthday party.\n", appt.toString());
}/*End test11 function*/

@Test
 public void test12()  throws Throwable  {
	 int startHour=3;
	 int startMinute=0; //change invalid minute lower bound
	 int startDay=15;
	 int startMonth=01;
	 int startYear=2018;
	 String title="Birthday Party";
	 String description="This is my birthday party.";
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);

    //change invalid minute upper bound
		int startMinute2=59;
		Appt appt2 = new Appt(startHour,
			 				startMinute2 ,
			 				startDay ,
			 				startMonth ,
			 			  startYear ,
			 				title,
			 				description);


    //change invalid day lower bound
    int startMinute3=15;
		int startDay2=1;
		//Construct a new Appointment object with the initial data
		Appt appt3 = new Appt(startHour,
					 					 startMinute3 ,
					 					 startDay2 ,
					 					 startMonth ,
					 					 startYear ,
					 					 title,
					 					description);

    //change invalid day upper bound
		int startDay3=CalendarUtil.NumDaysInMonth(startYear,startMonth-1);
		//Construct a new Appointment object with the initial data
		Appt appt4 = new Appt(startHour,
							 startMinute3 ,
							 startDay3 ,
							 startMonth ,
							 startYear ,
							 title,
							description);

  //change invalid month upper bound
 	int startMonth2=12;
	//Construct a new Appointment object with the initial data
	Appt appt5 = new Appt(startHour,
					 	startMinute3 ,
					  startDay ,
					  startMonth2 ,
					 	startYear ,
					 	title,
					 description);
// assertions
	assertEquals(true, appt.getValid());
	assertEquals(true, appt2.getValid());
	assertEquals(true, appt3.getValid());
	assertEquals(true, appt4.getValid());
	assertEquals(true, appt5.getValid());

 appt.setStartMinute(startMinute);
 appt2.setStartMinute(startMinute2);
 appt3.setStartDay(startDay2);
 appt4.setStartDay(startDay3);
 appt5.setStartMonth(startMonth2);

}/*End test12 function*/

@Test
 public void test13()  throws Throwable  {
	 int startHour=11;
	 int startMinute=30; //change invalid minute lower bound
	 int startDay=15;
	 int startMonth=01;
	 int startYear=2018;
	 String title="Birthday Party";
	 String description="This is my birthday party.";
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
	Appt appt2 = new Appt(2,
									 2 ,
									 2 ,
									 01 ,
									 2018 ,
									 title,
									description);

	Appt appt3 = new Appt(2,
									 2 ,
									 2 ,
									 02 ,
									 2020 ,
									 title,
									description);
//assertions
	assertEquals(true, appt.getValid());
	assertTrue(appt2.getValid());
  assertEquals("	1/15/2018 at 11:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());
	assertEquals(0, appt.compareTo(appt));
	assertEquals(50, appt.compareTo(appt2));
	assertEquals(47, appt.compareTo(appt3));
}/*End test13 function*/


@Test
 public void test14()  throws Throwable  {
	 int startHour=11;
	 int startMinute=30; //change invalid minute lower bound
	 int startDay=15;
	 int startMonth=01;
	 int startYear=2018;
	 String title="Birthday Party";
	 String description="This is my birthday party.";
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);

	appt.setStartHour(-1);
  assertEquals(false, appt.getValid());
}//end test14 function


@Test
 public void test15()  throws Throwable  {
	 int startHour=11;
	 int startMinute=30; //change invalid minute lower bound
	 int startDay=15;
	 int startMonth=01;
	 int startYear=2018;
	 String title="Birthday Party";
	 String description="This is my birthday party.";
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
appt.setStartMinute(-1);
assertEquals(false, appt.getValid());
}//end test15 function

@Test
 public void test16()  throws Throwable  {
	 int startHour=11;
	 int startMinute=30; //change invalid minute lower bound
	 int startDay=15;
	 int startMonth=01;
	 int startYear=2018;
	 String title="Birthday Party";
	 String description="This is my birthday party.";
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
appt.setStartDay(-1);
assertEquals(false, appt.getValid());
}//end test16 function


}
