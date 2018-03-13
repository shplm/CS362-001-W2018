// package calendar;
//
// import java.util.Calendar;
// import java.util.Random;
// import java.util.LinkedList;
// import java.util.GregorianCalendar;
// import org.junit.Test;
// import java.util.*;
//
//
// import static org.junit.Assert.*;
// import java.util.EmptyStackException;
// /**
//  * Random Test Generator  for TimeTable class.
//  */
//
// public class TimeTableRandomTest {
// 	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
// 	private static final int NUM_TESTS=100;
// 	/**
// 	 * Return a randomly selected method to be tests !.
// 	 */
//
// 		public static String RandomSelectMethod(Random random){
// 				String[] methodArray = new String[] {"deleteAppt","getApptRange"};// The list of the of methods to be tested in the Appt class
//
// 			int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
//
// 				return methodArray[n] ; // return the method name
// 				}
//     /**
//      * Generate Random Tests that tests TimeTable Class.
//      */
//
//
// @Test
// 	  public void radnomtest()  throws Throwable  {
// 			long startTime = Calendar.getInstance().getTimeInMillis();
// 			long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
//  			System.out.println("Start test TimeTable...");
//
//  try{
// 	 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
// 		 long randomseed =System.currentTimeMillis(); //10
// 		 Random random = new Random(randomseed);
// 		 Calendar current = Calendar.getInstance();
// 		 int thisMonth = current.get(Calendar.MONTH)+1;
// 			int thisYear = current.get(Calendar.YEAR);
// 			int thisDay = current.get(Calendar.DAY_OF_MONTH);
// 		GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
// 		int randbuffer = random.nextInt(3) + 2;//generate ramdom value between 2-4
// 		GregorianCalendar tomorrow = new GregorianCalendar(thisYear, thisMonth, thisDay + randbuffer);
// 		//construct a new calendar time
// 	 TimeTable timeTable = new TimeTable();
//
// 	 	LinkedList<Appt> listAppts = new LinkedList<Appt>();
// 	 	LinkedList<Appt> listAppts2 = new LinkedList<Appt>();//contain null appt
// 	 	LinkedList<Appt> listAppts3 = null;//contain null appts
// 	 	LinkedList<Appt> listAppts4 = new LinkedList<Appt>();
// 		LinkedList<Appt> listAppts5 = new LinkedList<Appt>();
// 	 for (int i = 0; i < NUM_TESTS; i++) {
// 		 String methodName = TimeTableRandomTest.RandomSelectMethod(random);
// 		 int startHour=ValuesGenerator.RandInt_is_valid(random);
// 		 int startMinute=ValuesGenerator.RandInt_is_valid(random);
// 		 int startDay=ValuesGenerator.RandInt_is_valid(random);;
// 		 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
// 		 int startYear=ValuesGenerator.getRandomIntBetween(random, 2017, 2020);
// 		 String title="Birthday Party";
// 		 String description="This is my birthday party.";
// 		 int buffer = random.nextInt(10);
// 		 int[] recurringDays = new int[buffer];
// 		 // int[] extrarecurringDays = new int[7];
// 		 //Construct a new Appointment object with the initial data
// 		 Appt appt = new Appt(startHour,
// 							startMinute ,
// 							startDay ,
// 							startMonth ,
// 							startYear ,
// 							title,
// 						 description);
// 		Appt appt3 = new Appt(startHour,
// 							startMinute ,
// 							startDay ,
// 							startMonth ,
// 							startYear ,
// 							title,
// 						description);
// 		Appt appt2 = null;
// 		appt3.setRecurrence(recurringDays, 1, 1, 1);
// 		// appt4.setRecurrence(extrarecurringDays, 1, 1, 1);
// 			if (methodName.equals("deleteAppt")){
// 				int coin = random.nextInt(5);
// 				if(coin == 0){
// 					timeTable.deleteAppt(listAppts3, appt);
// 				}
// 				else if(coin == 1){
//  					listAppts4.add(appt);
// 					timeTable.deleteAppt(listAppts4, listAppts4.get(0));
// 			 }
// 			 else if(coin == 2){
// 				 listAppts4.add(appt);
// 				 listAppts4.add(appt);
// 				 timeTable.deleteAppt(listAppts4, listAppts4.get(0));
// 			 }
//        else if(coin == 3){
//          timeTable.deleteAppt(listAppts, appt);;
//        }
// 			else{
// 				listAppts5.add(appt2);
// 				timeTable.deleteAppt(listAppts5, appt2);
// 			}
// 			 }/*End if statement*/
// 			else if(methodName.equals("getApptRange")){
// 				// int coin = random.nextInt(3);
// 				int coin = random.nextInt(3);
// 				if(coin == 0){
// 					listAppts.add(appt);
// 					timeTable.getApptRange(listAppts, today, tomorrow);
// 				}
// 				else if(coin == 1){
// 						listAppts2.add(appt);
// 						listAppts2.add(appt3);
// 						// listAppts2.add(appt4);
// 						timeTable.getApptRange(listAppts2, today, tomorrow);
// 				}
// 				else if(coin == 2){
// 					// TimeTableRandomTest.test12();
// 					 try{
// 		 		  timeTable.getApptRange(listAppts4, tomorrow, today);
// 		 		 }
// 		 		 catch(DateOutOfRangeException e){}
// 				}
// 			 }/*End else if statement*/
//
// 		 }
//
//
// 	 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
// 	 if((iteration%10000)==0 && iteration!=0 )
// 			 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
//
// 	 }
//  }catch(NullPointerException e){
//
//  }
//
//
//  System.out.println("End test TimeTable...");
//
//
// 	 }
//
//
//
// }
