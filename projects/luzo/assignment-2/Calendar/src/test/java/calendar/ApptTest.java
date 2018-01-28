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

}
