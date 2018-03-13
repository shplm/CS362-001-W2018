// package calendar;
// /**
//  *  This class provides a basic set of test cases for the
//  *  TimeTable class.
//  */
// import java.util.Calendar;
// import java.util.GregorianCalendar;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.*;
// import java.util.EmptyStackException;
//
//
// import org.junit.Test;
//
// import static org.junit.Assert.*;
//
// public class TimeTableTest {
//
// 	 @Test
// 	  public void test01()  throws Throwable  {
// 			int startHour=21;
// 			int startMinute=30;
// 			int startDay=8;
// 			int startMonth=02;
// 			int startYear=2018;
// 			String title="Birthday Party";
// 			String description="This is my birthday party.";
// 			//Construct a new Appointment object with the initial data
// 			Appt appt = new Appt(startHour,
// 							 startMinute ,
// 							 startDay ,
// 							 startMonth ,
// 							 startYear ,
// 							 title,
// 							description);
// 			Appt appt2 = new Appt(startHour + 10,
// 											 startMinute + 2,
// 											 startDay,
// 											 startMonth ,
// 											 startYear ,
// 											 "",
// 											"");
// 		 assertTrue(appt.getValid());
// 		 assertEquals(false, appt2.getValid());
//
// 			Calendar current = Calendar.getInstance();
// 			int thisMonth = current.get(Calendar.MONTH)+1;
// 			int thisYear = current.get(Calendar.YEAR);
// 			int thisDay = current.get(Calendar.DAY_OF_MONTH);
// 			GregorianCalendar today = new GregorianCalendar(thisYear,
// 																											thisMonth,
// 																											thisDay);
// 			GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
// 			tomorrow.add(Calendar.DAY_OF_MONTH,1);
// 			GregorianCalendar aftertomorrow = (GregorianCalendar)tomorrow.clone();
// 			aftertomorrow.add(Calendar.DAY_OF_MONTH,1);
// 			TimeTable timeTable = new TimeTable();
// 			assertNotNull(timeTable);
// 			LinkedList<Appt> listAppts = new LinkedList<Appt>();
// 			assertNotNull(listAppts);
// 			listAppts.add(appt);
// 			listAppts.add(appt2);
// 			assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
// 			assertNotNull(timeTable.getApptRange(listAppts, today, aftertomorrow));
// 	 }//test01
//
// 	 @Test(expected = IllegalArgumentException.class)
// 	 public void test02() throws Exception  {
// 		 int startHour=21;
// 		int startMinute=30;
// 		int startDay=15;
// 		int startMonth=01;
// 		int startYear=2018;
// 		String title="Birthday Party";
// 		String description="This is my birthday party.";
// 		int[] recurringDays = new int[5];
// 		//Construct a new Appointment object with the initial data
// 		Appt appt = new Appt(startHour,
// 						 startMinute ,
// 						 startDay ,
// 						 startMonth ,
// 						 startYear ,
// 						 title,
// 						description);
// 		Appt appt2 = new Appt(startHour + 2,
// 										 startMinute + 2,
// 										 startDay + 2,
// 										 startMonth + 2,
// 										 startYear + 2,
// 										 title,
// 										 description);
// 		Appt appt3 = new Appt(startHour - 2,
// 													startMinute - 2,
// 													startDay - 2,
// 													startMonth,
// 													startYear ,
// 													title,
// 													description);
// 		 assertTrue(appt.getValid());
// 		 assertEquals(true, appt2.getValid());
// 		 assertTrue(appt3.getValid());
// 		Calendar current = Calendar.getInstance();
// 		int thisMonth = current.get(Calendar.MONTH)+1;
// 		int thisYear = current.get(Calendar.YEAR);
// 		int thisDay = current.get(Calendar.DAY_OF_MONTH);
// 		GregorianCalendar today = new GregorianCalendar(thisYear,
// 																										thisMonth,
// 																										thisDay);
// 		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
// 		tomorrow.add(Calendar.DAY_OF_MONTH,1);
// 		TimeTable timeTable = new TimeTable();
// 		assertNotNull(timeTable);
// 		LinkedList<Appt> listAppts = new LinkedList<Appt>();
// 		assertNotNull(listAppts);
// 		listAppts.add(appt);
// 		listAppts.add(appt2);
// 		listAppts.add(appt3);
// 		int[] wrongpv = new int [100];
// 	// assertions
// assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
// 		try{
// 		assertEquals(null, timeTable.permute(listAppts, wrongpv));
// 	}catch(EmptyStackException e)
// 	{}
// 	}/*End test02 function*/
// //add more unit tests as you needed
//
// @Test
//  public void test03()  throws Throwable  {
// 	 int startHour=21;
// 	int startMinute=30;
// 	int startDay=15;
// 	int startMonth=01;
// 	int startYear=2018;
// 	String title="Birthday Party";
// 	String description="This is my birthday party.";
// 	int[] recurringDays = new int[5];
// 	//Construct a new Appointment object with the initial data
// 	Appt appt = new Appt(startHour,
// 					 startMinute ,
// 					 startDay ,
// 					 startMonth ,
// 					 startYear ,
// 					 title,
// 					description);
// 					Appt appt2 = new Appt(startHour + 2,
// 									 startMinute + 2,
// 									 startDay + 4,
// 									 startMonth ,
// 									 startYear ,
// 									 "",
// 									"");
// 		 assertEquals(true, appt.getValid());
// 		 assertEquals(true, appt2.getValid());
//
// 	Calendar current = Calendar.getInstance();
// 	int thisMonth = current.get(Calendar.MONTH)+1;
// 	int thisYear = current.get(Calendar.YEAR);
// 	int thisDay = current.get(Calendar.DAY_OF_MONTH);
// 	GregorianCalendar today = new GregorianCalendar(thisYear,
// 																									thisMonth,
// 																									thisDay);
// 	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
// 	tomorrow.add(Calendar.DAY_OF_MONTH,1);
// 	GregorianCalendar aftertomorrow = (GregorianCalendar)tomorrow.clone();
// 	aftertomorrow.add(Calendar.DAY_OF_MONTH,1);
//
// 	TimeTable timeTable = new TimeTable();
// 	assertNotNull(timeTable);
// 	LinkedList<Appt> listAppts = new LinkedList<Appt>();
// 	assertNotNull(listAppts);
// // assertions
// appt.setRecurrence(recurringDays, 4, 4, 4);
// assertEquals(4, appt.getRecurNumber());
// assertEquals(4, appt.getRecurBy());
// assertEquals(4, appt.getRecurIncrement());
// assertEquals(recurringDays, appt.getRecurDays());
// listAppts.add(appt);
// listAppts.add(appt2);
// assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
// assertNotNull(timeTable.getApptRange(listAppts, today, aftertomorrow));
// }/*End test03 function*/
//
// @Test
//  public void test04()  throws Throwable  {
// 	 int startHour=21;
// 	int startMinute=30;
// 	int startDay=15;
// 	int startMonth=01;
// 	int startYear=2018;
// 	String title="Birthday Party";
// 	String description="This is my birthday party.";
// 	int[] recurringDays = new int[5];
// 	//Construct a new Appointment object with the initial data
// 	Appt appt = new Appt(startHour,
// 					 startMinute ,
// 					 startDay ,
// 					 startMonth ,
// 					 startYear ,
// 					 title,
// 					description);
// 	Appt appt2 = new Appt(startHour + 2,
// 					 startMinute + 2,
// 					 startDay + 4,
// 					 startMonth ,
// 					 startYear ,
// 					 "",
// 					"");
// 	Appt appt3 = new Appt(startHour -2 ,
// 					 startMinute - 2,
// 					 startDay - 2,
// 					 startMonth ,
// 					 startYear ,
// 					 "---",
// 					"%^&*^%");
// 		 assertTrue(appt.getValid());
// 		 assertEquals(true, appt2.getValid());
// 		 assertEquals(true, appt3.getValid());
// 	Calendar current = Calendar.getInstance();
// 	int thisMonth = current.get(Calendar.MONTH)+1;
// 	int thisYear = current.get(Calendar.YEAR);
// 	int thisDay = current.get(Calendar.DAY_OF_MONTH);
// 	GregorianCalendar today = new GregorianCalendar(thisYear,
// 																									thisMonth,
// 																									thisDay);
// 	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
// 	tomorrow.add(Calendar.DAY_OF_MONTH,1);
// 	TimeTable timeTable = new TimeTable();
// 	assertNotNull(timeTable);
// 	LinkedList<Appt> listAppts = new LinkedList<Appt>();
// 	assertNotNull(listAppts);
// 	listAppts.add(appt);
// 	listAppts.add(appt2);
// 	listAppts.add(appt3);
// // assertions
// assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
// assertNotNull(timeTable.deleteAppt(listAppts, listAppts.get(0)));
// 	// LinkedList<Appt> listDeletedAppts=timeTable.deleteAppt(listAppts, listAppts.get(0));
// }/*End test04 function*/
//
// @Test
//  public void test05()  throws Throwable  {
// 	 int startHour=21;
// 	int startMinute=30;
// 	int startDay=15;
// 	int startMonth=01;
// 	int startYear=2018;
// 	String title="Birthday Party";
// 	String description="This is my birthday party.";
// 	int[] recurringDays = new int[2];
// 	//Construct a new Appointment object with the initial data
// 	Appt appt = new Appt(startHour,
// 					 startMinute ,
// 					 startDay ,
// 					 startMonth ,
// 					 startYear ,
// 					 title,
// 					description);
// 	Appt appt2 = new Appt(startHour + 2,
// 									 startMinute + 2,
// 									 startDay + 4,
// 									 startMonth ,
// 									 startYear ,
// 									 title,
// 									description);
// 		 assertTrue(appt.getValid());
// 		 assertEquals(true, appt2.getValid());
// 	Calendar current = Calendar.getInstance();
// 	int thisMonth = current.get(Calendar.MONTH)+1;
// 	int thisYear = current.get(Calendar.YEAR);
// 	int thisDay = current.get(Calendar.DAY_OF_MONTH);
// 	GregorianCalendar today = new GregorianCalendar(thisYear,
// 																									thisMonth,
// 																									thisDay);
// 	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
// 	tomorrow.add(Calendar.DAY_OF_MONTH,1);
// 	TimeTable timeTable = new TimeTable();
// 	assertNotNull(timeTable);
// 	LinkedList<Appt> listAppts = new LinkedList<Appt>();
// 	assertNotNull(listAppts);
// // assertions
// appt.setRecurrence(recurringDays, 1, 1, 1);
// assertEquals(1, appt.getRecurNumber());
// assertEquals(1, appt.getRecurBy());
// assertEquals(1, appt.getRecurIncrement());
// assertEquals(recurringDays, appt.getRecurDays());
// appt2.setRecurrence(recurringDays, 2, 2, 2);
// listAppts.add(appt);
// listAppts.add(appt2);
// assertEquals(2, appt2.getRecurNumber());
// assertEquals(2, appt2.getRecurBy());
// assertEquals(2, appt2.getRecurIncrement());
// assertEquals(recurringDays, appt2.getRecurDays());
// // appt3.setRecurrence(recurringDays, 3, 3, 3);
// assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
// //LinkedList<Appt> listDeletedAppts=timeTable.deleteAppt(listAppts, listAppts.get(1));
// }/*End test05 function*/
//
// @Test
//  public void test06()  throws Throwable  {
// 	 int startHour=21;
// 	int startMinute=30;
// 	int startDay=15;
// 	int startMonth=01;
// 	int startYear=2018;
// 	String title="Birthday Party";
// 	String description="This is my birthday party.";
// 	int[] recurringDays = new int[5];
// 	//Construct a new Appointment object with the initial data
// 	Appt appt = new Appt(startHour,
// 					 startMinute ,
// 					 startDay ,
// 					 startMonth ,
// 					 startYear ,
// 					 title,
// 					description);
// 	Appt appt2 = new Appt(startHour,
// 												startMinute ,
// 												startDay ,
// 												startMonth ,
// 												startYear ,
// 												title,
// 												description);
//
//     Appt appt3 = new Appt(startHour + 10,
//                       		startMinute ,
//                       		startDay ,
//                       		startMonth ,
//                       		startYear ,
//                       	  title,
//                       	description);
//
// 		 assertTrue(appt.getValid());
// 		 assertTrue(appt2.getValid());
//      assertEquals(false, appt3.getValid());
// 	Calendar current = Calendar.getInstance();
// 	int thisMonth = current.get(Calendar.MONTH)+1;
// 	int thisYear = current.get(Calendar.YEAR);
// 	int thisDay = current.get(Calendar.DAY_OF_MONTH);
// 	GregorianCalendar today = new GregorianCalendar(thisYear,
// 																									thisMonth,
// 																									thisDay);
// 	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
// 	tomorrow.add(Calendar.DAY_OF_MONTH,1);
//
// 	TimeTable timeTable = new TimeTable();
// 	assertNotNull(timeTable);
// 	LinkedList<Appt> listAppts = new LinkedList<Appt>();
// 	LinkedList<Appt> listAppts2 = new LinkedList<Appt>();
// 	assertNotNull(listAppts);
// 	listAppts.add(appt);
// 	listAppts.add(appt2);
//   listAppts2.add(appt3);
// // assertions
// assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
// assertEquals(null, timeTable.deleteAppt(listAppts2, listAppts2.get(0)));
// assertNotNull(timeTable.deleteAppt(listAppts, listAppts.get(0)));
//
// }/*End test06 function*/
//
// 	 @Test(expected = IllegalArgumentException.class)
//  public void test07()  throws Throwable  {
// 	int startHour=21;
// 	int startMinute=30;
// 	int startDay=15;
// 	int startMonth=01;
// 	int startYear=2018;
// 	String title="Birthday Party";
// 	String description="This is my birthday party.";
// 	int[] recurringDays = new int[5];
// 	//Construct a new Appointment object with the initial data
// 	Appt appt = new Appt(startHour,
// 					 startMinute ,
// 					 startDay ,
// 					 startMonth ,
// 					 startYear ,
// 					 title,
// 					description);
// 	Appt appt2 = new Appt(startHour + 2,
// 									 startMinute + 2,
// 									 startDay + 2,
// 									 startMonth + 2,
// 									 startYear + 2,
// 									 title,
// 									 description);
// 	Appt appt3 = new Appt(startHour - 2,
// 												startMinute - 2,
// 												startDay - 2,
// 												startMonth,
// 												startYear ,
// 												title,
// 												description);
// 		 assertTrue(appt.getValid());
// 		 assertEquals(true, appt2.getValid());
// 		 assertEquals(true, appt3.getValid());
// 	Calendar current = Calendar.getInstance();
// 	int thisMonth = current.get(Calendar.MONTH)+1;
// 	int thisYear = current.get(Calendar.YEAR);
// 	int thisDay = current.get(Calendar.DAY_OF_MONTH);
// 	GregorianCalendar today = new GregorianCalendar(thisYear,
// 																									thisMonth,
// 																									thisDay);
// 	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
// 	tomorrow.add(Calendar.DAY_OF_MONTH,1);
// 	GregorianCalendar aftertomorrow = (GregorianCalendar)tomorrow.clone();
// 	aftertomorrow.add(Calendar.DAY_OF_MONTH,1);
//
// 	TimeTable timeTable = new TimeTable();
// 	assertNotNull(timeTable);
// 	LinkedList<Appt> listAppts = new LinkedList<Appt>();
// 	LinkedList<Appt> listAppts_null = new LinkedList<Appt>();
// 	assertNotNull(listAppts);
// 	listAppts.add(appt);
// 	listAppts.add(appt2);
// 	listAppts.add(appt3);
// 	int[] pv = new int[3];
//   int[] pv1 = new int[2];
//   System.out.println("length of pv1: " + pv1.length);
//   System.out.println("length of listAppts: " + listAppts.size());
// 	int[] wrongpv = new int[0];
// 	// int[] wrongpv = new int[1];
//
// // assertions
// assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
// assertNotNull(timeTable.deleteAppt(listAppts, appt));
// assertNotNull(timeTable.permute(listAppts_null, wrongpv));
// assertNotNull(timeTable.permute(listAppts, pv1));
// try{
// assertNotNull(timeTable.permute(listAppts, pv));
// }catch(EmptyStackException e){}
//
//
//
// // assertEquals(null, timeTable.permute(listAppts, wrongpv));
// }/*End test07 function*/
//
//
// @Test
//  public void test08()  throws Throwable  {
// 	 int startHour=21;
// 	int startMinute=30;
// 	int startDay=15;
// 	int startMonth=01;
// 	int startYear=2018;
// 	String title="Birthday Party";
// 	String description="This is my birthday party.";
// 	int[] recurringDays = new int[0];
// 	int[] extrarecurringDays = new int[7];
// 	//Construct a new Appointment object with the initial data
// 	Appt appt = new Appt(startHour,
// 					 startMinute ,
// 					 startDay ,
// 					 startMonth ,
// 					 startYear ,
// 					 title,
// 					description);
// 	Appt appt2 = new Appt(startHour + 2,
// 									 startMinute + 2,
// 									 startDay + 4,
// 									 startMonth ,
// 									 startYear ,
// 									 title,
// 									description);
// 		 assertTrue(appt.getValid());
// 		 assertEquals(true, appt2.getValid());
//
// 	Calendar current = Calendar.getInstance();
// 	int thisMonth = current.get(Calendar.MONTH)+1;
// 	int thisYear = current.get(Calendar.YEAR);
// 	int thisDay = current.get(Calendar.DAY_OF_MONTH);
// 	GregorianCalendar today = new GregorianCalendar(thisYear,
// 																									thisMonth,
// 																									thisDay);
// 	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
// 	tomorrow.add(Calendar.DAY_OF_MONTH,1);
// 	TimeTable timeTable = new TimeTable();
// 	assertNotNull(timeTable);
// 	LinkedList<Appt> listAppts = new LinkedList<Appt>();
// 	assertNotNull(listAppts);
// // assertions
// appt.setRecurrence(recurringDays, 1, 1, 1);
// listAppts.add(appt);
// listAppts.add(appt2);
// assertEquals(1, appt.getRecurNumber());
// assertEquals(1, appt.getRecurBy());
// assertEquals(1, appt.getRecurIncrement());
// assertEquals(recurringDays, appt.getRecurDays());
// assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
// }/*End test08 function*/
//
//
// @Test
//  public void test09()  throws Throwable  {
// 	Calendar current = Calendar.getInstance();
// 	 int startHour=21;
// 	int startMinute=30;
// 	int startDay=current.get(Calendar.DAY_OF_MONTH);
// 	int startMonth=current.get(Calendar.MONTH)+1;
// 	int startYear=current.get(Calendar.YEAR);
// 	String title="Birthday Party";
// 	String description="This is my birthday party.";
// 	int[] recurringDays = new int[0];
// 	int[] extrarecurringDays = new int[7];
//   int[] intergalrecur = new int[3];
// 	//Construct a new Appointment object with the initial data
// 	Appt appt = new Appt(startHour,
// 					 startMinute ,
// 					 startDay ,
// 					 startMonth ,
// 					 startYear ,
// 					 title,
// 					description);
// 	Appt appt2 = new Appt(startHour + 2,
// 									 startMinute + 2,
// 									 startDay + 4,
// 									 startMonth ,
// 									 startYear ,
// 									 title,
// 									description);
//   Appt appt3 = new Appt(startHour,
//                 		startMinute,
//                 		startDay,
//                 		startMonth,
//                 		startYear ,
//                 		title,
//                 	description);
//
//   Appt appt4 = new Appt(startHour,
//                   startMinute,
//                   startDay,
//                   startMonth,
//                   startYear ,
//                   title,
//                 description);
//
//
// 		 assertTrue(appt.getValid());
// 		 assertEquals(true, appt2.getValid());
//
// 	int thisMonth = current.get(Calendar.MONTH)+1;
// 	int thisYear = current.get(Calendar.YEAR);
// 	int thisDay = current.get(Calendar.DAY_OF_MONTH);
// 	GregorianCalendar today = new GregorianCalendar(thisYear,
// 																									thisMonth,
// 																									thisDay);
// 	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
// 	tomorrow.add(Calendar.DAY_OF_MONTH,1);
// 	TimeTable timeTable = new TimeTable();
// 	assertNotNull(timeTable);
// 	LinkedList<Appt> listAppts = new LinkedList<Appt>();
//   LinkedList<Appt> listAppts2 = new LinkedList<Appt>();
//   LinkedList<Appt> listAppts3 = new LinkedList<Appt>();
// 	assertNotNull(listAppts);
//
// // assertions
// appt.setRecurrence(extrarecurringDays, 2, 2, 2);
// appt3.setRecurrence(extrarecurringDays, 3, 3, 3);
// appt4.setRecurrence(intergalrecur, 3, 3, 3);
// listAppts.add(appt);
// listAppts.add(appt2);
// listAppts2.add(appt3);
// listAppts3.add(appt4);
// assertNotNull(timeTable.getApptRange(listAppts2, today, tomorrow));
// assertNotNull(timeTable.getApptRange(listAppts3, today, tomorrow));
// assertEquals(2, appt.getRecurNumber());
// assertEquals(2, appt.getRecurBy());
// assertEquals(2, appt.getRecurIncrement());
// assertEquals(extrarecurringDays, appt.getRecurDays());
// assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
// }/*End test09 function*/
//
// @Test
//  public void test10()  throws Throwable  {
// 	 int startHour=21;
// 	int startMinute=30;
// 	int startDay=15;
// 	int startMonth=01;
// 	int startYear=2018;
// 	String title="Birthday Party";
// 	String description="This is my birthday party.";
// 	int[] recurringDays = new int[0];
// 	int[] extrarecurringDays = new int[7];
// 	//Construct a new Appointment object with the initial data
// 	Appt appt = new Appt(startHour,
// 					 startMinute ,
// 					 startDay ,
// 					 startMonth ,
// 					 startYear ,
// 					 title,
// 					description);
// 	Appt appt2 = new Appt(startHour + 2,
// 									 startMinute + 2,
// 									 startDay + 4,
// 									 startMonth ,
// 									 startYear ,
// 									 title,
// 									description);
// 	assertTrue(appt.getValid());
// 	assertEquals(true, appt2.getValid());
// 	Calendar current = Calendar.getInstance();
// 	int thisMonth = current.get(Calendar.MONTH)+1;
// 	int thisYear = current.get(Calendar.YEAR);
// 	int thisDay = current.get(Calendar.DAY_OF_MONTH);
// 	GregorianCalendar today = new GregorianCalendar(thisYear,
// 																									thisMonth,
// 																									thisDay);
// 	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
// 	tomorrow.add(Calendar.DAY_OF_MONTH,1);
// 	TimeTable timeTable = new TimeTable();
// 	assertNotNull(timeTable);
// 	LinkedList<Appt> listAppts = new LinkedList<Appt>();
// 	LinkedList<Appt> listAppts2 = new LinkedList<Appt>();
// 	assertNotNull(listAppts);
// 	assertNotNull(listAppts2);
// // assertions
// appt.setRecurrence(extrarecurringDays, 3, 3, 3);
// listAppts.add(appt);
// listAppts.add(appt2);
//
// assertEquals(3, appt.getRecurNumber());
// assertEquals(3, appt.getRecurBy());
// assertEquals(3, appt.getRecurIncrement());
// assertEquals(extrarecurringDays, appt.getRecurDays());
// assertNotNull(timeTable.deleteAppt(listAppts, appt));
// assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
// assertEquals(null, timeTable.deleteAppt(listAppts2, appt));
// }/*End test10 function*/
//
//
// @Test
//  public void test11()  throws Throwable  {
// 	 int startHour=21;
// 	int startMinute=30;
// 	int startDay=15;
// 	int startMonth=01;
// 	int startYear=2018;
// 	String title="Birthday Party";
// 	String description="This is my birthday party.";
// 	//Construct a new Appointment object with the initial data
// 	Appt appt = new Appt(startHour,
// 					 startMinute ,
// 					 startDay ,
// 					 startMonth ,
// 					 startYear ,
// 					 title,
// 					description);
// 	Appt appt2 = new Appt(startHour,
// 									 startMinute,
// 									 startDay + 4,
// 									 startMonth ,
// 									 startYear ,
// 									 title,
// 									description);
// 	assertTrue(appt.getValid());
// 	assertEquals(true, appt2.getValid());
// 	Calendar current = Calendar.getInstance();
// 	int thisMonth = current.get(Calendar.MONTH)+1;
// 	int thisYear = current.get(Calendar.YEAR);
// 	int thisDay = current.get(Calendar.DAY_OF_MONTH);
// 	GregorianCalendar today = new GregorianCalendar(thisYear,
// 																									thisMonth,
// 																									thisDay);
// 	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
// 	tomorrow.add(Calendar.DAY_OF_MONTH,1);
// 	TimeTable timeTable = new TimeTable();
// 	assertNotNull(timeTable);
// 	LinkedList<Appt> listAppts = new LinkedList<Appt>();
// 	LinkedList<Appt> listAppts2 = new LinkedList<Appt>();
// 	assertNotNull(listAppts);
// 	assertNotNull(listAppts2);
// // assertions
// listAppts.add(appt);
// listAppts.add(appt2);
// listAppts.add(appt);
//
// assertNotNull(timeTable.deleteAppt(listAppts, appt));
// assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
//
// }/*End test11 function*/
//
//
//
//
// @Test(expected = DateOutOfRangeException.class)
// public void test12()  throws Exception  {
// 	int startHour=21;
//  int startMinute=30;
//  int startDay=15;
//  int startMonth=01;
//  int startYear=2018;
//  String title="Birthday Party";
//  String description="This is my birthday party.";
//  //Construct a new Appointment object with the initial data
//  Appt appt = new Appt(startHour,
// 					startMinute ,
// 					startDay ,
// 					startMonth ,
// 					startYear ,
// 					title,
// 				 description);
// 		 assertTrue(appt.getValid());
//  Calendar current = Calendar.getInstance();
//  int thisMonth = current.get(Calendar.MONTH)+1;
//  int thisYear = current.get(Calendar.YEAR);
//  int thisDay = current.get(Calendar.DAY_OF_MONTH);
//  GregorianCalendar today = new GregorianCalendar(thisYear,
// 																								 thisMonth,
// 																								 thisDay);
//  GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
//  tomorrow.add(Calendar.DAY_OF_MONTH,1);
//  GregorianCalendar aftertomorrow = (GregorianCalendar)tomorrow.clone();
//  aftertomorrow.add(Calendar.DAY_OF_MONTH,1);
//  TimeTable timeTable = new TimeTable();
//  assertNotNull(timeTable);
//  LinkedList<Appt> listAppts = new LinkedList<Appt>();
//  assertNotNull(listAppts);
//  listAppts.add(appt);
// // assertions
//  try{
//  assertEquals(null, timeTable.getApptRange(listAppts, aftertomorrow, tomorrow));
// }
// catch(EmptyStackException e){}
//
// }/*End test12 function*/
//
// @Test
//  public void test13()  throws Throwable  {
// 	 int startHour=21;
// 	int startMinute=30;
// 	int startDay=15;
// 	int startMonth=02;
// 	int startYear=2018;
// 	String title="Birthday Party";
// 	String description="This is my birthday party.";
// 	//Construct a new Appointment object with the initial data
// 	Appt appt = new Appt(startHour,
// 					 startMinute ,
// 					 startDay ,
// 					 startMonth ,
// 					 startYear ,
// 					 title,
// 					description);
// 	assertTrue(appt.getValid());
// 	Appt appt2 = new Appt(startHour + 2,
//  						startMinute ,
//  						startDay ,
//  						startMonth ,
//  						startYear ,
//  						title,
//  					description);
// 	assertEquals(true, appt2.getValid());
// 	Appt appt3 = new Appt(startHour,
// 						startMinute ,
// 						startDay ,
// 						startMonth ,
// 						startYear ,
// 						title,
// 					description);
// 	assertTrue(appt3.getValid());
// 	Appt appt4 = new Appt(startHour,
// 						startMinute ,
// 						startDay ,
// 						startMonth ,
// 						startYear ,
// 						title,
// 						description);
// 	assertTrue(appt4.getValid());
// 	Appt appt5 = null;
// 	assertEquals(null, appt5);
// 	Calendar current = Calendar.getInstance();
// 	int thisMonth = current.get(Calendar.MONTH)+1;
// 	int thisYear = current.get(Calendar.YEAR);
// 	int thisDay = current.get(Calendar.DAY_OF_MONTH);
// 	GregorianCalendar today = new GregorianCalendar(thisYear,
// 																									thisMonth,
// 																									thisDay);
// 	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
// 	tomorrow.add(Calendar.DAY_OF_MONTH,1);
// 	TimeTable timeTable = new TimeTable();
// 	assertNotNull(timeTable);
// 	LinkedList<Appt> listAppts = new LinkedList<Appt>();
// 	assertNotNull(listAppts);
// 	listAppts.add(appt);
// 	listAppts.add(appt3);
// 	listAppts.add(appt4);
// 	LinkedList<Appt> NulllistAppts = new LinkedList<Appt>();
// 	assertNotNull(NulllistAppts);
// 	LinkedList<Appt> NulllistAppts2 = new LinkedList<Appt>();
// 	assertNotNull(NulllistAppts2);
// 	LinkedList<Appt> NulllistAppts3 = null;
// 	assertEquals(null, NulllistAppts3);
// 	LinkedList<Appt> NulllistAppts4 = null;
// 	assertEquals(null, NulllistAppts4);
// // assertions
// assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
// assertNotNull(timeTable.deleteAppt(listAppts, appt3));
// assertEquals(null, timeTable.deleteAppt(NulllistAppts2, appt2));
// assertEquals(null, timeTable.deleteAppt(NulllistAppts3, appt2));
// assertEquals(null, timeTable.deleteAppt(NulllistAppts4, appt5));
// assertEquals(null, timeTable.deleteAppt(NulllistAppts2, appt5));
// }/*End test13 function*/
//
// @Test
//  public void test14()  throws Throwable  {
// 	Calendar current = Calendar.getInstance();
// 	 int startHour=21;
// 	int startMinute=30;
// 	int startDay=current.get(Calendar.DAY_OF_MONTH);
// 	int startMonth=current.get(Calendar.MONTH)+1;
// 	int startYear=current.get(Calendar.YEAR);
// 	String title="Birthday Party";
// 	String description="This is my birthday party.";
// 	//Construct a new Appointment object with the initial data
// 	Appt appt = new Appt(startHour,
// 					 startMinute ,
// 					 startDay ,
// 					 startMonth ,
// 					 startYear ,
// 					 title,
// 					description);
//  Appt appt2 = new Appt(startHour - 50,
// 									 startMinute ,
// 									 startDay ,
// 									 startMonth ,
// 									 startYear,
// 									 title,
// 									description);
// assertTrue(appt.getValid());
// assertEquals(false, appt2.getValid());
// 	int thisMonth = current.get(Calendar.MONTH)+1;
// 	int thisYear = current.get(Calendar.YEAR);
// 	int thisDay = current.get(Calendar.DAY_OF_MONTH);
// 	GregorianCalendar today = new GregorianCalendar(thisYear,
// 																									thisMonth,
// 																									thisDay);
// 	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
// 	tomorrow.add(Calendar.DAY_OF_MONTH,1);
// 	TimeTable timeTable = new TimeTable();
// 	TimeTable timeTable2 = new TimeTable();
// 	assertNotNull(timeTable);
// 	assertNotNull(timeTable2);
// 	LinkedList<Appt> listAppts = new LinkedList<Appt>();
// 	assertNotNull(listAppts);
// 	LinkedList<Appt> listAppts2 = new LinkedList<Appt>();
// 	assertNotNull(listAppts2);
// 	listAppts.add(appt);
// 	listAppts2.add(appt2);
//
// 	LinkedList<CalDay> calDays = timeTable.getApptRange(listAppts, today, tomorrow);
//
// 	// assertEquals(true, calDays.isValid());
// // assertions
// assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
// assertNotNull(timeTable2.getApptRange(listAppts2, today, tomorrow));
// }/*End test14 function*/
//
// @Test
//  public void test16()  throws Throwable  {
// 	 int startHour=21;
// 	int startMinute=30;
// 	int startDay=15;
// 	int startMonth=01;
// 	int startYear=2018;
// 	String title="Birthday Party";
// 	String description="This is my birthday party.";
// 	int[] recurringDays = new int[0];
// 	//Construct a new Appointment object with the initial data
// 	Appt appt = new Appt(startHour,
// 					 startMinute ,
// 					 startDay ,
// 					 startMonth ,
// 					 startYear ,
// 					 title,
// 					description);
// 			 assertTrue(appt.getValid());
// 	Calendar current = Calendar.getInstance();
// 	int thisMonth = current.get(Calendar.MONTH)+1;
// 	int thisYear = current.get(Calendar.YEAR);
// 	int thisDay = current.get(Calendar.DAY_OF_MONTH);
// 	GregorianCalendar today = new GregorianCalendar(thisYear,
// 																									thisMonth,
// 																									thisDay);
// 	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
// 	tomorrow.add(Calendar.DAY_OF_MONTH,1);
// 	TimeTable timeTable = new TimeTable();
// 	assertNotNull(timeTable);
// 	LinkedList<Appt> listAppts = new LinkedList<Appt>();
// 	assertNotNull(listAppts);
//
// // assertions
// appt.setRecurrence(recurringDays, -2, -2, -2);
// assertEquals(-2, appt.getRecurNumber());
// assertEquals(-2, appt.getRecurBy());
// assertEquals(-2, appt.getRecurIncrement());
// assertEquals(recurringDays, appt.getRecurDays());
// listAppts.add(appt);
// assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
// }/*End test16 function*/
//
// @Test
//  public void test17()  throws Throwable  {
// 	 Calendar current = Calendar.getInstance();
// 	 int thisMonth = current.get(Calendar.MONTH)+1;
// 	 int thisYear = current.get(Calendar.YEAR);
// 	 int thisDay = current.get(Calendar.DAY_OF_MONTH);
// 	 GregorianCalendar today = new GregorianCalendar(thisYear,
// 																									 thisMonth,
// 																									 thisDay);
// 	 GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
// 	 tomorrow.add(Calendar.DAY_OF_MONTH,1);
// 	 GregorianCalendar aftertomorrow = (GregorianCalendar)tomorrow.clone();
// 	 aftertomorrow.add(Calendar.DAY_OF_MONTH,1);
// 	 TimeTable timeTable = new TimeTable();
// 	 assertNotNull(timeTable);
// 	 LinkedList<Appt> listAppts = new LinkedList<Appt>();
// 	 assertNotNull(listAppts);
// 	 assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
// 	 assertNotNull(timeTable.getApptRange(listAppts, today, aftertomorrow));
// }//end test17 function
//
// @Test
//  public void test18()  throws Throwable  {
// 	 int startHour=0;
// 	int startMinute=0;
// 	int startDay=15;
// 	int startMonth=02;
// 	int startYear=2018;
// 	String title="Birthday Party";
// 	String description="This is my birthday party.";
// 	//Construct a new Appointment object with the initial data
// 	Appt appt = new Appt(startHour,
// 					 startMinute ,
// 					 startDay ,
// 					 startMonth ,
// 					 startYear ,
// 					 title,
// 					description);
// 	assertEquals(false, appt.getValid());
// 	Appt appt2 = new Appt(12,
// 					 30 ,
// 					 16 ,
// 					 02 ,
// 					 2018 ,
// 					 title,
// 					description);
// 	assertEquals(true, appt2.getValid());
// 	 Calendar current = Calendar.getInstance();
// 	 int thisMonth = current.get(Calendar.MONTH)+1;
// 	 int thisYear = current.get(Calendar.YEAR);
// 	 int thisDay = current.get(Calendar.DAY_OF_MONTH);
// 	 GregorianCalendar today = new GregorianCalendar(thisYear,
// 																									 thisMonth,
// 																									 thisDay);
// 	 GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
// 	 tomorrow.add(Calendar.DAY_OF_MONTH,1);
// 	 TimeTable timeTable = new TimeTable();
// 	 assertNotNull(timeTable);
// 	 LinkedList<Appt> listAppts = new LinkedList<Appt>();
// 	 assertNotNull(listAppts);
// 	 	listAppts.add(appt);
// 		listAppts.add(appt2);
// 	 assertNotNull(timeTable.getApptRange(listAppts, today, tomorrow));
// }//end test18 function
//
// @Test
//  public void test19()  throws Throwable  {
// 	Calendar current = Calendar.getInstance();
//  	int thisMonth = current.get(Calendar.MONTH)+1;
//  	int thisYear = current.get(Calendar.YEAR);
//  	int thisDay = current.get(Calendar.DAY_OF_MONTH);
//  	GregorianCalendar today = new GregorianCalendar(thisYear,
//  																									thisMonth,
//  																									thisDay);
//  	GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
// 	GregorianCalendar aftertomorrow = (GregorianCalendar)tomorrow.clone();
// 	aftertomorrow.add(Calendar.DAY_OF_MONTH,1);
//  	tomorrow.add(Calendar.DAY_OF_MONTH,1);
//  	TimeTable timeTable = new TimeTable();
//  	TimeTable timeTable2 = new TimeTable();
//  	assertNotNull(timeTable);
//  	assertNotNull(timeTable2);
//
// 	int startHour=21;
// 	int startMinute=30;
// 	int startDay=15;
// 	int startMonth=01;
// 	int startYear=2018;
// 	String title="Birthday Party";
// 	String description="This is my birthday party.";
// 	int[] recurringDays = new int[0];
// 	int[] recurringDays2 = null;
// 	//Construct a new Appointment object with the initial data
// 	Appt appt = new Appt(startHour,
// 					 startMinute ,
// 					 thisDay ,
// 					 thisMonth ,
// 					 thisYear ,
// 					 title,
// 					description);
// 	assertTrue(appt.getValid());
// 	Appt appt2 = new Appt(startHour,
// 					 startMinute ,
// 					 thisDay ,
// 					 thisMonth ,
// 					 thisYear ,
// 					 title,
// 					description);
// 	assertTrue(appt2.getValid());
// 	Appt appt3 = new Appt(startHour,
// 					 startMinute ,
// 					 thisDay ,
// 					 thisMonth ,
// 					 thisYear ,
// 					 title,
// 					description);
// 	assertTrue(appt3.getValid());
// 	Appt appt4 = new Appt(startHour,
// 					 startMinute ,
// 					 thisDay ,
// 					 thisMonth ,
// 					 thisYear ,
// 					 title,
// 					description);
// 	assertTrue(appt4.getValid());
//
//
//
// 	LinkedList<Appt> listAppts = new LinkedList<Appt>();
// 	LinkedList<Appt> listAppts2 = new LinkedList<Appt>();
// 	assertNotNull(listAppts);
// 	assertNotNull(listAppts2);
// // assertions
// appt.setRecurrence(recurringDays, -1, -1, -1);
// assertEquals(-1, appt.getRecurNumber());
// assertEquals(-1, appt.getRecurBy());
// assertEquals(-1, appt.getRecurIncrement());
// assertEquals(recurringDays, appt.getRecurDays());
//
// appt2.setRecurrence(recurringDays, 2, 0, 0);
// assertEquals(0, appt2.getRecurNumber());
// assertEquals(2, appt2.getRecurBy());
// assertEquals(0, appt2.getRecurIncrement());
// assertEquals(recurringDays, appt2.getRecurDays());
//
// appt3.setRecurrence(recurringDays2, 1, 1, 1);
// assertEquals(1, appt3.getRecurNumber());
// assertEquals(1, appt3.getRecurBy());
// assertEquals(1, appt3.getRecurIncrement());
// assertNotNull(appt3.getRecurDays());
//
// appt4.setRecurrence(recurringDays, 2, 2, 2);
// assertEquals(2, appt4.getRecurNumber());
// assertEquals(2, appt4.getRecurBy());
// assertEquals(2, appt4.getRecurIncrement());
// assertEquals(recurringDays, appt4.getRecurDays());
//
// listAppts.add(appt);
// listAppts.add(appt2);
// listAppts.add(appt3);
// listAppts.add(appt4);
//
// listAppts2.add(appt3);
//
// assertNotNull(timeTable.getApptRange(listAppts, today, aftertomorrow));
// assertNotNull(timeTable2.getApptRange(listAppts2, today, tomorrow));
// }//end test19 function
//
//
//
//
//
// }
