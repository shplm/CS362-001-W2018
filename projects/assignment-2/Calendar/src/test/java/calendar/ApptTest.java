package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }

	 @Test
	  public void test02()  throws Throwable  {
			int startHour=11;
			int startMinute=31;
			int startDay=17;
			int startMonth=05;
			int startYear=2018;
			String title="Meeting with study group";
			String description="Discuss group work with group members.";

			String testtostring = "\t" + 05 + "/" +17 +"/" +2018+" at " +11 + ":" +31 +"am"+" ," + "Meeting with study group" +", "+"Discuss group work with group members."+ "\n";
			int com = 1-10+2+4+0;
			String appt5_string = "\t" + 1 + "/" +1 +"/" +1+" at " +2 + ":" +1 +"pm"+" ," + "none" +", "+"none"+ "\n";
			String appt6_string = "\t" + 1 + "/" +1 +"/" +1+" at " +12 + ":" +1 +"am"+" ," + "none" +", "+"none"+ "\n";
			//another appointment
		 int startHour1=21;
 		 int startMinute1=30;
 		 int startDay1=15;
 		 int startMonth1=01;
 		 int startYear1=2018;
 		 String title1="Birthday Party";
 		 String description1="This is my birthday party.";
 		 //Construct a new Appointment object with the initial data
 		 Appt appt1 = new Appt(startHour1,
 		          startMinute1 ,
 		          startDay1 ,
 		          startMonth1 ,
 		          startYear1 ,
 		          title1,
 		         description1);

			//Construct a new appointment object with the initial date
			Appt appt = new Appt(startHour,
 		          startMinute ,
 		          startDay ,
 		          startMonth ,
 		          startYear ,
 		          title,
 		         description
			);

			//third ApptTest
			Appt appt2 = new Appt(
				24,1,1,1,1,"none","none"
			);
			Appt appt2_1 = new Appt(
				-1,1,1,1,1,"none","none"
			);
			Appt appt3 = new Appt(
				1,62,1,1,1,"none","none"
			);
			Appt appt3_1 = new Appt(
				1,0,1,1,1,"none","none"
			);
			Appt appt4 = new Appt(
				1,1,40,1,1,"none","none"
			);
			Appt appt4_1 = new Appt(
				1,1,-1,1,1,"none","none"
			);
			Appt appt5 = new Appt(
			  14,1,1,1,1,"none","none"
			);
			Appt appt6 = new Appt(
				0,1,1,1,1,"none","none"
			);
			Appt appt7 = new Appt(
				0,1,1,1,1,"none",null
			);
		// assertions
		assertTrue(appt.getValid());
		assertEquals(testtostring, appt.toString());
		assertEquals(com, appt.compareTo(appt1));
		//assertTrue(appt.isRecurring());
		appt.setStartHour(9);
		assertEquals(9,appt.getStartHour());
		appt.setStartMinute(20);
		assertEquals(20,appt.getStartMinute());
		appt.setStartDay(21);
		assertEquals(21,appt.getStartDay());
		appt.setStartMonth(2);
		assertEquals(2,appt.getStartMonth());
		appt.setStartYear(2017);
		assertEquals(2017,appt.getStartYear());

		assertEquals(0,appt.getRecurNumber());
		assertEquals(2,appt.getRecurBy());
		assertTrue(!appt.isRecurring());
		assertEquals(appt5_string,appt5.toString());
		assertEquals(appt6_string,appt6.toString());
		//appt2.setStartHour(13);
		assertEquals(false,appt2.getValid());
		assertEquals(false,appt3.getValid());
		assertEquals(false,appt4.getValid());
		assertEquals(false,appt2_1.getValid());
		assertEquals(false,appt3_1.getValid());
		assertEquals(false,appt4_1.getValid());
		assertEquals(true,appt5.getValid());
		assertEquals(true,appt6.getValid());

	 }
//add more unit tests as you needed

}
