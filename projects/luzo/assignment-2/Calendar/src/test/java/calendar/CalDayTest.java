package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
			CalDay calDays = new CalDay();

			//assertions
			assertEquals(false, calDays.isValid());
	 }
	 @Test
	  public void test02()  throws Throwable  {
			Calendar current = Calendar.getInstance();
			int thisMonth = current.get(Calendar.MONTH)+1;
			int thisYear = current.get(Calendar.YEAR);
			int thisDay = current.get(Calendar.DAY_OF_MONTH);
			GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);

			CalDay calDays = new CalDay(today);
			assertEquals(true, calDays.isValid());

			//assertions
			assertNotNull(calDays.getMonth());
			assertNotNull(calDays.getYear());
			assertNotNull(calDays.getDay());
			assertNotNull(calDays.toString());
	 }//end test02 function
//add more unit tests as you needed
	@Test
	public void test03() throws Throwable {
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

					Calendar current = Calendar.getInstance();
					int thisMonth = current.get(Calendar.MONTH)+1;
					int thisYear = current.get(Calendar.YEAR);
					int thisDay = current.get(Calendar.DAY_OF_MONTH);
					GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
	CalDay calDays = new CalDay(today);
			assertEquals(true, calDays.isValid());
			assertNotNull(calDays.getMonth());
			assertNotNull(calDays.getYear());
			assertNotNull(calDays.getDay());
	Appt appt2 = new Appt(startHour + 2,
					 startMinute + 2,
					 startDay + 2,
					 startMonth + 2,
					 startYear + 2,
					 title,
					description);
	Appt appt3 = new Appt(startHour - 2,
									 startMinute - 2,
									 startDay - 2,
									 startMonth ,
									 startYear - 2,
									 title,
									description);
	assertTrue(appt.getValid());
	assertEquals(false, appt2.getValid());
	assertTrue(appt3.getValid());

	//void function test
	calDays.addAppt(appt);
	assertNotNull(calDays.getAppts());
	calDays.addAppt(appt3);
	assertNotNull(calDays.getAppts());
	calDays.addAppt(appt2);
	assertNotNull(calDays.getAppts());
	//assertions
	assertNotNull(calDays.getSizeAppts());
	assertNotNull(calDays.toString());
	assertNotNull(calDays.iterator());
	assertNotNull(calDays.getAppts());
	}//end test03 function

	@Test
	public void test04() throws Throwable {
		int startHour=0;
		int startMinute=70;
		int startDay=0;
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
	CalDay calDays = new CalDay();
			assertEquals(false, calDays.isValid());
			assertEquals(false, appt.getValid());

	//void function test
	//assertions
				assertEquals(null, calDays.iterator());
				assertEquals("", calDays.toString());
				calDays.addAppt(appt);
				assertEquals(null, calDays.getAppts());
	}//end test04 function

//Null pointer shall turn error msg, can't run the code properly
	@Test
	public void test06() throws Throwable {
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
		Appt appt2 = new Appt(startHour + 1,
										 startMinute ,
										 startDay ,
										 startMonth ,
										 startYear ,
										 title,
										description);
	assertTrue(appt.getValid());
		assertTrue(appt2.getValid());
			Calendar current = Calendar.getInstance();
			int thisMonth = current.get(Calendar.MONTH)+1;
			int thisYear = current.get(Calendar.YEAR);
			int thisDay = current.get(Calendar.DAY_OF_MONTH);
			GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
		CalDay calDays = new CalDay(today);
		assertEquals(true, calDays.isValid());
		assertNotNull(calDays.getMonth());
		assertNotNull(calDays.getYear());
		assertNotNull(calDays.getDay());
	//void function test
	//assertions
	calDays.addAppt(appt);
	assertNotNull(calDays.getAppts());
	calDays.addAppt(appt2);
	assertNotNull(calDays.getAppts());
	}//end test06 function




}
