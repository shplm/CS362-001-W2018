package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.*;
import java.util.EmptyStackException;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

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
			Appt appt2 = new Appt(startHour + 2,
											 startMinute + 2,
											 startDay + 4,
											 startMonth ,
											 startYear ,
											 "",
											"");
		 assertTrue(appt.getValid());
		 assertEquals(false, appt2.getValid());

			Calendar current = Calendar.getInstance();
			int thisMonth = current.get(Calendar.MONTH)+1;
			int thisYear = current.get(Calendar.YEAR);
			int thisDay = current.get(Calendar.DAY_OF_MONTH);
			GregorianCalendar today = new GregorianCalendar(thisYear,
																											thisMonth,
																											thisDay);
			GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
			tomorrow.add(Calendar.DAY_OF_MONTH,1);
			GregorianCalendar aftertomorrow = (GregorianCalendar)tomorrow.clone();
			aftertomorrow.add(Calendar.DAY_OF_MONTH,1);
			TimeTable timeTable = new TimeTable();
			assertNotNull(timeTable);
			LinkedList<Appt> listAppts = new LinkedList<Appt>();
			assertNotNull(listAppts);
			listAppts.add(appt);
			listAppts.add(appt2);
			assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
			assertNotNull(timeTable.getApptRange(listAppts, today, aftertomorrow));
	 }

	 @Test(expected = IllegalArgumentException.class)
	 public void test02() throws Exception  {
		 int startHour=21;
		int startMinute=30;
		int startDay=15;
		int startMonth=01;
		int startYear=2018;
		String title="Birthday Party";
		String description="This is my birthday party.";
		int[] recurringDays = new int[5];
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
						 startMinute ,
						 startDay ,
						 startMonth ,
						 startYear ,
						 title,
						description);
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
													startMonth,
													startYear ,
													title,
													description);
		 assertTrue(appt.getValid());
		 assertEquals(false, appt2.getValid());
		 assertTrue(appt3.getValid());
		Calendar current = Calendar.getInstance();
		int thisMonth = current.get(Calendar.MONTH)+1;
		int thisYear = current.get(Calendar.YEAR);
		int thisDay = current.get(Calendar.DAY_OF_MONTH);
		GregorianCalendar today = new GregorianCalendar(thisYear,
																										thisMonth,
																										thisDay);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(Calendar.DAY_OF_MONTH,1);
		TimeTable timeTable = new TimeTable();
		assertNotNull(timeTable);
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		assertNotNull(listAppts);
		listAppts.add(appt);
		listAppts.add(appt2);
		listAppts.add(appt3);
		int[] wrongpv = new int [100];
	// assertions
assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
		try{
		assertEquals(null, timeTable.permute(listAppts, wrongpv));
	}catch(EmptyStackException e)
	{}
	}/*End test02 function*/
//add more unit tests as you needed

@Test
 public void test03()  throws Throwable  {
	 int startHour=21;
	int startMinute=30;
	int startDay=15;
	int startMonth=01;
	int startYear=2018;
	String title="Birthday Party";
	String description="This is my birthday party.";
	int[] recurringDays = new int[5];
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
					Appt appt2 = new Appt(startHour + 2,
									 startMinute + 2,
									 startDay + 4,
									 startMonth ,
									 startYear ,
									 "",
									"");
		 assertEquals(true, appt.getValid());
		 assertEquals(false, appt2.getValid());

	Calendar current = Calendar.getInstance();
	int thisMonth = current.get(Calendar.MONTH)+1;
	int thisYear = current.get(Calendar.YEAR);
	int thisDay = current.get(Calendar.DAY_OF_MONTH);
	GregorianCalendar today = new GregorianCalendar(thisYear,
																									thisMonth,
																									thisDay);
	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
	tomorrow.add(Calendar.DAY_OF_MONTH,1);
	GregorianCalendar aftertomorrow = (GregorianCalendar)tomorrow.clone();
	aftertomorrow.add(Calendar.DAY_OF_MONTH,1);

	TimeTable timeTable = new TimeTable();
	assertNotNull(timeTable);
	LinkedList<Appt> listAppts = new LinkedList<Appt>();
	assertNotNull(listAppts);
// assertions
appt.setRecurrence(recurringDays, 4, 4, 4);
assertEquals(4, appt.getRecurNumber());
assertEquals(4, appt.getRecurBy());
assertEquals(4, appt.getRecurIncrement());
assertEquals(recurringDays, appt.getRecurDays());
listAppts.add(appt);
listAppts.add(appt2);
assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
assertNotNull(timeTable.getApptRange(listAppts, today, aftertomorrow));
}/*End test03 function*/

@Test
 public void test04()  throws Throwable  {
	 int startHour=21;
	int startMinute=30;
	int startDay=15;
	int startMonth=01;
	int startYear=2018;
	String title="Birthday Party";
	String description="This is my birthday party.";
	int[] recurringDays = new int[5];
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
	Appt appt2 = new Appt(startHour + 2,
					 startMinute + 2,
					 startDay + 4,
					 startMonth ,
					 startYear ,
					 "",
					"");
	Appt appt3 = new Appt(startHour -2 ,
					 startMinute - 2,
					 startDay - 2,
					 startMonth ,
					 startYear ,
					 "---",
					"%^&*^%");
		 assertTrue(appt.getValid());
		 assertEquals(false, appt2.getValid());
		 assertEquals(true, appt3.getValid());
	Calendar current = Calendar.getInstance();
	int thisMonth = current.get(Calendar.MONTH)+1;
	int thisYear = current.get(Calendar.YEAR);
	int thisDay = current.get(Calendar.DAY_OF_MONTH);
	GregorianCalendar today = new GregorianCalendar(thisYear,
																									thisMonth,
																									thisDay);
	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
	tomorrow.add(Calendar.DAY_OF_MONTH,1);
	TimeTable timeTable = new TimeTable();
	assertNotNull(timeTable);
	LinkedList<Appt> listAppts = new LinkedList<Appt>();
	assertNotNull(listAppts);
	listAppts.add(appt);
	listAppts.add(appt2);
	listAppts.add(appt3);
// assertions
assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
assertEquals(null, timeTable.deleteAppt(listAppts, listAppts.get(0)));
	// LinkedList<Appt> listDeletedAppts=timeTable.deleteAppt(listAppts, listAppts.get(0));
}/*End test04 function*/

@Test
 public void test05()  throws Throwable  {
	 int startHour=21;
	int startMinute=30;
	int startDay=15;
	int startMonth=01;
	int startYear=2018;
	String title="Birthday Party";
	String description="This is my birthday party.";
	int[] recurringDays = new int[2];
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
	Appt appt2 = new Appt(startHour + 2,
									 startMinute + 2,
									 startDay + 4,
									 startMonth ,
									 startYear ,
									 title,
									description);
		 assertTrue(appt.getValid());
		 assertEquals(false, appt2.getValid());
	Calendar current = Calendar.getInstance();
	int thisMonth = current.get(Calendar.MONTH)+1;
	int thisYear = current.get(Calendar.YEAR);
	int thisDay = current.get(Calendar.DAY_OF_MONTH);
	GregorianCalendar today = new GregorianCalendar(thisYear,
																									thisMonth,
																									thisDay);
	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
	tomorrow.add(Calendar.DAY_OF_MONTH,1);
	TimeTable timeTable = new TimeTable();
	assertNotNull(timeTable);
	LinkedList<Appt> listAppts = new LinkedList<Appt>();
	assertNotNull(listAppts);
// assertions
appt.setRecurrence(recurringDays, 1, 1, 1);
assertEquals(1, appt.getRecurNumber());
assertEquals(1, appt.getRecurBy());
assertEquals(1, appt.getRecurIncrement());
assertEquals(recurringDays, appt.getRecurDays());
appt2.setRecurrence(recurringDays, 2, 2, 2);
listAppts.add(appt);
listAppts.add(appt2);
assertEquals(2, appt2.getRecurNumber());
assertEquals(2, appt2.getRecurBy());
assertEquals(2, appt2.getRecurIncrement());
assertEquals(recurringDays, appt2.getRecurDays());
// appt3.setRecurrence(recurringDays, 3, 3, 3);
assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
//LinkedList<Appt> listDeletedAppts=timeTable.deleteAppt(listAppts, listAppts.get(1));
}/*End test05 function*/

@Test
 public void test06()  throws Throwable  {
	 int startHour=21;
	int startMinute=30;
	int startDay=15;
	int startMonth=01;
	int startYear=2018;
	String title="Birthday Party";
	String description="This is my birthday party.";
	int[] recurringDays = new int[5];
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
		 assertTrue(appt.getValid());
		 assertTrue(appt2.getValid());

	Calendar current = Calendar.getInstance();
	int thisMonth = current.get(Calendar.MONTH)+1;
	int thisYear = current.get(Calendar.YEAR);
	int thisDay = current.get(Calendar.DAY_OF_MONTH);
	GregorianCalendar today = new GregorianCalendar(thisYear,
																									thisMonth,
																									thisDay);
	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
	tomorrow.add(Calendar.DAY_OF_MONTH,1);

	TimeTable timeTable = new TimeTable();
	assertNotNull(timeTable);
	LinkedList<Appt> listAppts = new LinkedList<Appt>();
	assertNotNull(listAppts);
	listAppts.add(appt);
	listAppts.add(appt2);

// assertions
assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
assertEquals(null, timeTable.deleteAppt(listAppts, listAppts.get(0)));
}/*End test06 function*/

 @Test
 public void test07()  throws Throwable  {
	 int startHour=21;
	int startMinute=30;
	int startDay=15;
	int startMonth=01;
	int startYear=2018;
	String title="Birthday Party";
	String description="This is my birthday party.";
	int[] recurringDays = new int[5];
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
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
												startMonth,
												startYear ,
												title,
												description);
		 assertTrue(appt.getValid());
		 assertEquals(false, appt2.getValid());
		 assertEquals(true, appt3.getValid());
	Calendar current = Calendar.getInstance();
	int thisMonth = current.get(Calendar.MONTH)+1;
	int thisYear = current.get(Calendar.YEAR);
	int thisDay = current.get(Calendar.DAY_OF_MONTH);
	GregorianCalendar today = new GregorianCalendar(thisYear,
																									thisMonth,
																									thisDay);
	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
	tomorrow.add(Calendar.DAY_OF_MONTH,1);
	GregorianCalendar aftertomorrow = (GregorianCalendar)tomorrow.clone();
	aftertomorrow.add(Calendar.DAY_OF_MONTH,1);

	TimeTable timeTable = new TimeTable();
	assertNotNull(timeTable);
	LinkedList<Appt> listAppts = new LinkedList<Appt>();
	assertNotNull(listAppts);
	listAppts.add(appt);
	listAppts.add(appt2);
	listAppts.add(appt3);
	int[] pv = new int[3];

// assertions
assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
assertEquals(null, timeTable.deleteAppt(listAppts, appt));
assertNotNull(timeTable.permute(listAppts, pv));
}/*End test07 function*/


@Test
 public void test08()  throws Throwable  {
	 int startHour=21;
	int startMinute=30;
	int startDay=15;
	int startMonth=01;
	int startYear=2018;
	String title="Birthday Party";
	String description="This is my birthday party.";
	int[] recurringDays = new int[0];
	int[] extrarecurringDays = new int[7];
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
	Appt appt2 = new Appt(startHour + 2,
									 startMinute + 2,
									 startDay + 4,
									 startMonth ,
									 startYear ,
									 title,
									description);
		 assertTrue(appt.getValid());
		 assertEquals(false, appt2.getValid());

	Calendar current = Calendar.getInstance();
	int thisMonth = current.get(Calendar.MONTH)+1;
	int thisYear = current.get(Calendar.YEAR);
	int thisDay = current.get(Calendar.DAY_OF_MONTH);
	GregorianCalendar today = new GregorianCalendar(thisYear,
																									thisMonth,
																									thisDay);
	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
	tomorrow.add(Calendar.DAY_OF_MONTH,1);
	TimeTable timeTable = new TimeTable();
	assertNotNull(timeTable);
	LinkedList<Appt> listAppts = new LinkedList<Appt>();
	assertNotNull(listAppts);
// assertions
appt.setRecurrence(recurringDays, 1, 1, 1);
listAppts.add(appt);
listAppts.add(appt2);
assertEquals(1, appt.getRecurNumber());
assertEquals(1, appt.getRecurBy());
assertEquals(1, appt.getRecurIncrement());
assertEquals(recurringDays, appt.getRecurDays());
assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
}/*End test08 function*/


@Test
 public void test09()  throws Throwable  {
	 int startHour=21;
	int startMinute=30;
	int startDay=15;
	int startMonth=01;
	int startYear=2018;
	String title="Birthday Party";
	String description="This is my birthday party.";
	int[] recurringDays = new int[0];
	int[] extrarecurringDays = new int[7];
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
	Appt appt2 = new Appt(startHour + 2,
									 startMinute + 2,
									 startDay + 4,
									 startMonth ,
									 startYear ,
									 title,
									description);
		 assertTrue(appt.getValid());
		 assertEquals(false, appt2.getValid());
	Calendar current = Calendar.getInstance();
	int thisMonth = current.get(Calendar.MONTH)+1;
	int thisYear = current.get(Calendar.YEAR);
	int thisDay = current.get(Calendar.DAY_OF_MONTH);
	GregorianCalendar today = new GregorianCalendar(thisYear,
																									thisMonth,
																									thisDay);
	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
	tomorrow.add(Calendar.DAY_OF_MONTH,1);
	TimeTable timeTable = new TimeTable();
	assertNotNull(timeTable);
	LinkedList<Appt> listAppts = new LinkedList<Appt>();
	assertNotNull(listAppts);

// assertions
appt.setRecurrence(extrarecurringDays, 2, 2, 2);
listAppts.add(appt);
listAppts.add(appt2);
assertEquals(2, appt.getRecurNumber());
assertEquals(2, appt.getRecurBy());
assertEquals(2, appt.getRecurIncrement());
assertEquals(extrarecurringDays, appt.getRecurDays());
assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
}/*End test09 function*/

@Test
 public void test10()  throws Throwable  {
	 int startHour=21;
	int startMinute=30;
	int startDay=15;
	int startMonth=01;
	int startYear=2018;
	String title="Birthday Party";
	String description="This is my birthday party.";
	int[] recurringDays = new int[0];
	int[] extrarecurringDays = new int[7];
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
	Appt appt2 = new Appt(startHour + 2,
									 startMinute + 2,
									 startDay + 4,
									 startMonth ,
									 startYear ,
									 title,
									description);
	assertTrue(appt.getValid());
	assertEquals(false, appt2.getValid());
	Calendar current = Calendar.getInstance();
	int thisMonth = current.get(Calendar.MONTH)+1;
	int thisYear = current.get(Calendar.YEAR);
	int thisDay = current.get(Calendar.DAY_OF_MONTH);
	GregorianCalendar today = new GregorianCalendar(thisYear,
																									thisMonth,
																									thisDay);
	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
	tomorrow.add(Calendar.DAY_OF_MONTH,1);
	TimeTable timeTable = new TimeTable();
	assertNotNull(timeTable);
	LinkedList<Appt> listAppts = new LinkedList<Appt>();
	assertNotNull(listAppts);
// assertions
appt.setRecurrence(extrarecurringDays, 3, 3, 3);
listAppts.add(appt);
listAppts.add(appt2);
assertEquals(3, appt.getRecurNumber());
assertEquals(3, appt.getRecurBy());
assertEquals(3, appt.getRecurIncrement());
assertEquals(extrarecurringDays, appt.getRecurDays());
assertEquals(null, timeTable.deleteAppt(listAppts, appt));
assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
assertEquals(null, timeTable.deleteAppt(listAppts, appt));
}/*End test10 function*/


@Test(expected = DateOutOfRangeException.class)
public void test12()  throws Exception  {
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
		 assertTrue(appt.getValid());
 Calendar current = Calendar.getInstance();
 int thisMonth = current.get(Calendar.MONTH)+1;
 int thisYear = current.get(Calendar.YEAR);
 int thisDay = current.get(Calendar.DAY_OF_MONTH);
 GregorianCalendar today = new GregorianCalendar(thisYear,
																								 thisMonth,
																								 thisDay);
 GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
 tomorrow.add(Calendar.DAY_OF_MONTH,1);
 GregorianCalendar aftertomorrow = (GregorianCalendar)tomorrow.clone();
 aftertomorrow.add(Calendar.DAY_OF_MONTH,1);
 TimeTable timeTable = new TimeTable();
 assertNotNull(timeTable);
 LinkedList<Appt> listAppts = new LinkedList<Appt>();
 assertNotNull(listAppts);
 listAppts.add(appt);
// assertions
 try{
 assertEquals(null, timeTable.getApptRange(listAppts, aftertomorrow, tomorrow));
}
catch(EmptyStackException e){}

}/*End test12 function*/

@Test
 public void test13()  throws Throwable  {
	 int startHour=21;
	int startMinute=30;
	int startDay=15;
	int startMonth=02;
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
	assertTrue(appt.getValid());
	Appt appt2 = new Appt(startHour + 2,
 						startMinute ,
 						startDay ,
 						startMonth ,
 						startYear ,
 						title,
 					description);
	assertEquals(false, appt2.getValid());
	Appt appt3 = new Appt(startHour,
						startMinute ,
						startDay ,
						startMonth ,
						startYear ,
						title,
					description);
	assertTrue(appt3.getValid());
	Appt appt4 = new Appt(startHour,
						startMinute ,
						startDay ,
						startMonth ,
						startYear ,
						title,
						description);
	assertTrue(appt4.getValid());
	Appt appt5 = null;
	assertEquals(null, appt5);
	Calendar current = Calendar.getInstance();
	int thisMonth = current.get(Calendar.MONTH)+1;
	int thisYear = current.get(Calendar.YEAR);
	int thisDay = current.get(Calendar.DAY_OF_MONTH);
	GregorianCalendar today = new GregorianCalendar(thisYear,
																									thisMonth,
																									thisDay);
	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
	tomorrow.add(Calendar.DAY_OF_MONTH,1);
	TimeTable timeTable = new TimeTable();
	assertNotNull(timeTable);
	LinkedList<Appt> listAppts = new LinkedList<Appt>();
	assertNotNull(listAppts);
	listAppts.add(appt);
	listAppts.add(appt3);
	listAppts.add(appt4);
	LinkedList<Appt> NulllistAppts = new LinkedList<Appt>();
	assertNotNull(NulllistAppts);
	LinkedList<Appt> NulllistAppts2 = new LinkedList<Appt>();
	assertNotNull(NulllistAppts2);
	LinkedList<Appt> NulllistAppts3 = null;
	assertEquals(null, NulllistAppts3);
	LinkedList<Appt> NulllistAppts4 = null;
	assertEquals(null, NulllistAppts4);
// assertions
assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
assertNotNull(timeTable.deleteAppt(listAppts, appt3));
assertEquals(null, timeTable.deleteAppt(NulllistAppts2, appt2));
assertEquals(null, timeTable.deleteAppt(NulllistAppts3, appt2));
assertEquals(null, timeTable.deleteAppt(NulllistAppts4, appt5));
assertEquals(null, timeTable.deleteAppt(NulllistAppts2, appt5));
}/*End test13 function*/

@Test
 public void test14()  throws Throwable  {
	Calendar current = Calendar.getInstance();
	 int startHour=21;
	int startMinute=30;
	int startDay=current.get(Calendar.DAY_OF_MONTH);
	int startMonth=current.get(Calendar.MONTH)+1;
	int startYear=current.get(Calendar.YEAR);
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
									 startYear + 2,
									 title,
									description);
assertTrue(appt.getValid());
assertTrue(appt2.getValid());
	int thisMonth = current.get(Calendar.MONTH)+1;
	int thisYear = current.get(Calendar.YEAR);
	int thisDay = current.get(Calendar.DAY_OF_MONTH);
	GregorianCalendar today = new GregorianCalendar(thisYear,
																									thisMonth,
																									thisDay);
	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
	tomorrow.add(Calendar.DAY_OF_MONTH,1);
	TimeTable timeTable = new TimeTable();
	assertNotNull(timeTable);
	LinkedList<Appt> listAppts = new LinkedList<Appt>();
	assertNotNull(listAppts);
	listAppts.add(appt);
// assertions
assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
}/*End test14 function*/

@Test
 public void test16()  throws Throwable  {
	 int startHour=21;
	int startMinute=30;
	int startDay=15;
	int startMonth=01;
	int startYear=2018;
	String title="Birthday Party";
	String description="This is my birthday party.";
	int[] recurringDays = new int[0];
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
			 assertTrue(appt.getValid());
	Calendar current = Calendar.getInstance();
	int thisMonth = current.get(Calendar.MONTH)+1;
	int thisYear = current.get(Calendar.YEAR);
	int thisDay = current.get(Calendar.DAY_OF_MONTH);
	GregorianCalendar today = new GregorianCalendar(thisYear,
																									thisMonth,
																									thisDay);
	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
	tomorrow.add(Calendar.DAY_OF_MONTH,1);
	TimeTable timeTable = new TimeTable();
	assertNotNull(timeTable);
	LinkedList<Appt> listAppts = new LinkedList<Appt>();
	assertNotNull(listAppts);
// assertions
appt.setRecurrence(recurringDays, -2, -2, -2);
assertEquals(-2, appt.getRecurNumber());
assertEquals(-2, appt.getRecurBy());
assertEquals(-2, appt.getRecurIncrement());
assertEquals(recurringDays, appt.getRecurDays());
listAppts.add(appt);
assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
}/*End test16 function*/

}
