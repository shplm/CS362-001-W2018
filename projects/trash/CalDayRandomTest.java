package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;


		public static int RandomGenerateMonth(Random random){
				Calendar current = Calendar.getInstance();
				int coin = random.nextInt(3);
				int n = random.nextInt(30);
				if(coin == 0)
					return current.get(Calendar.MONTH)+1;
				else if(coin == 1){
						return(int) n;
				}/*End else if statement*/
				else
					return(int) -n;
			}

			public static int RandomGenerateYear(Random random){
					Calendar current = Calendar.getInstance();
					int coin = random.nextInt(3);
					int n = random.nextInt(30);
					if(coin == 0)
						return current.get(Calendar.YEAR);
					else if(coin == 1){
							return(int) n;
					}/*End else if statement*/
					else
						return(int) -n;
				}

				public static int RandomGenerateDay(Random random){
						Calendar current = Calendar.getInstance();
						int coin = random.nextInt(3);
						int n = random.nextInt(30);
						if(coin == 0)
							return current.get(Calendar.DAY_OF_MONTH);
						else if(coin == 1){
								return(int) n;
						}/*End else if statement*/
						else
							return(int) -n;
					}

					public static String RandomSelectMethod(Random random){
			        String[] methodArray = new String[] {"addAppt"};// The list of the of methods to be tested in the Appt class

			    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

			        return methodArray[n] ; // return the method name
			        }
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
					 long startTime = Calendar.getInstance().getTimeInMillis();
					 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
			System.out.println("Start test CalDay...");

			try{
				for (int iteration = 0; elapsed < TestTimeout; iteration++) {
					long randomseed =System.currentTimeMillis(); //10
					Random random = new Random(randomseed);

				 //construct a new calendar time

	 			int thisMonth = CalDayRandomTest.RandomGenerateMonth(random);
	 			int thisYear = CalDayRandomTest.RandomGenerateYear(random);
	 			int thisDay = CalDayRandomTest.RandomGenerateDay(random);
	 			GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);

	 			CalDay calDays = new CalDay(today);
				if(!calDays.isValid())continue;
				for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = CalDayRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("addAppt")){
							 int startHour=ValuesGenerator.RandInt_is_valid(random);
							 int startMinute=ValuesGenerator.RandInt_is_valid(random);
							 int startDay=ValuesGenerator.RandInt_is_valid(random);;
							 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
							 int startYear=ValuesGenerator.RandInt_is_valid(random);
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
						   calDays.addAppt(appt);
						}
					}
				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				if((iteration%10000)==0 && iteration!=0 )
						System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

				}
			}catch(NullPointerException e){

			}


			System.out.println("End test CalDay...");
	 }



}
