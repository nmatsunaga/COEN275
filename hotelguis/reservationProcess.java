package hotelguis;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class reservationProcess {
    
	public class Entry{
		private int rId;
		private int roomNum;
		private Date startDate;
		private Date endDate;
		private int userId;
		public Entry(int roomN, Date startD, Date endD, int user) {
			this.rId = nextRid;
		    this.roomNum = roomN;
		    this.startDate = startD;
		    this.endDate = endD;
		    this.userId = user;
		    nextRid++;
		}
		
		public int getReservId(){
			return this.rId;
		}
		
		public int getUserId(){
			return this.userId;
		}
		
		public int getRoomId(){
			return this.roomNum;
		}
		
		public Date getStartDate(){
			return this.startDate;
		}
		
		public Date getEndDate(){
			return this.endDate;
		}
		
		public void setRoomId(int roomId){
			this.roomNum = roomId;
		}
		
		public void setStartDate(Date startDate){
			this.startDate = startDate;
		}
		
		public void setEndDate(Date endDate){
			this.endDate = endDate;
		}
		
		public void adminSetUserId(int userId)
		{
			this.userId = userId;
		}
	}
	
	static ArrayList<Entry> entries = new ArrayList<Entry>();
         
	private static int nextRid = 0;
	
	public reservationProcess(){}
	
	/* 
	 * Return values of pushEntry
	 * >=0 -> reservationId returned
	 * -1 -> wrong userId, no change made
	 * -2 -> invalid date, no change made
	 * -3 -> invalid roomNum
	 */
	private int pushEntry(int roomNum, Date startDate, Date endDate, int userId)
	{
		Date current = new Date();
		if(userId < 0)
			return -1;
		if ((startDate.before(current))||(endDate.before(startDate)))
		{
			return -2;
		}
		if (roomNum < 0)
			return -3;
		Entry createRentry = new Entry(roomNum, startDate, endDate, userId);
		entries.add(createRentry);
		int reservId = createRentry.getReservId();
		return reservId;
	}
	
	private boolean checkEntry(int reservId, int roomNum, Date startDate, Date endDate, int userId)
	{
		int searchLength = entries.size();
		for (int i = 0; i < searchLength; i++) {
			if ((entries.get(i).getReservId() == reservId)&&
				(entries.get(i).getRoomId() == roomNum)&&
				(entries.get(i).getStartDate() == startDate)&&
				(entries.get(i).getEndDate() == endDate)&&
				(entries.get(i).getUserId() == userId)) {
				return true;
			}
		}
		return false;
	}
	
	boolean checkReservationByRid(int reservationId)
	{
		int searchLength = entries.size();
		for (int i = 0; i < searchLength; i++) {
			if ((entries.get(i).getReservId() == reservationId))
			{
				return true;
			}
		}
		return false; // reservation not found!
	}
	
	int getReservationUserId(int reservationId)
	{
		int searchLength = entries.size();
		for (int i = 0; i < searchLength; i++) {
			if ((entries.get(i).getReservId() == reservationId))
			{
				return entries.get(i).getUserId();
			}
		}
		return -1; // reservation not found!
	}

	Date getReservationStartDate(int reservationId)
	{
		int searchLength = entries.size();
		for (int i = 0; i < searchLength; i++) {
			if ((entries.get(i).getReservId() == reservationId))
			{
				return entries.get(i).getStartDate();
			}
		}
		return (new Date((0), Calendar.JANUARY, 1)); //reservation not found!
	}
	
	Date getReservationEndDate(int reservationId)
	{
		int searchLength = entries.size();
		for (int i = 0; i < searchLength; i++) {
			if ((entries.get(i).getReservId() == reservationId))
			{
				return entries.get(i).getEndDate();
			}
		}
		return (new Date((0), Calendar.JANUARY, 1)); //reservation not found!
	}

	/************************************************ 
	 * Functions for user reservation Related changes
	 ***********************************************/
	
	int createReservation(int roomNum, Date startDate, Date endDate, int userId)
	{
		boolean bookSuccessful = false;
		//entries.add(new Entry(roomNum, startDate, endDate, userId));
		
		//add entry
		int reservId = pushEntry(roomNum, startDate, endDate, userId);
		if (reservId < 0)
		{
			return reservId;
		}
		bookSuccessful = checkEntry(reservId, roomNum, startDate, endDate, userId);
		
		if (bookSuccessful)
			return reservId;
		else
			return -1;
	}
	
	/*
	 * changeReservation assumes the roomNum is already checked to be valid 
	 * Return values of changeReservation
	 * 1 -> change made successfully
	 * 0 -> no change was made, cannot find reservationId
	 * -1 -> wrong userId, no change made
	 * -2 -> invalid date, no change made
	 * -3 -> invalid roomNum
	 */
	int changeReservation(int reservationId, int roomNum, Date startDate, Date endDate, int userId)
	{
		int searchLength = entries.size();
		for (int i = 0; i < searchLength; i++) {
			if ((entries.get(i).getReservId() == reservationId))
			{
				if (entries.get(i).getUserId() == userId) 
				{
					Date current = new Date();
					Date start = entries.get(i).getStartDate();
					if ((start.before(current))||(entries.get(i).getEndDate().before(start)))
					{
						return -2;
					}
					else
					{
						if (roomNum < 0)
							return -3;
						else
						{
							entries.get(i).setRoomId(roomNum);
							entries.get(i).setStartDate(startDate);
							entries.get(i).setEndDate(endDate);
							return 1;
						}
					}
					
				}
				else
				{
					return -1;
				}
			}
		}
		return 0;
	}
	
	/* 
	 * Return values of cancelReservation
	 * 1 -> change made successfully
	 * -1 -> reservationId not found, no change made
	 * 
	 */
	int cancelReservation(int reservationId)
	{
		int searchLength = entries.size();
		for (int i = 0; i < searchLength; i++) {
			if ((entries.get(i).getReservId() == reservationId))
			{
				entries.remove(i);
				return 1;
			}
		}
		return -1;
	}
	
	
	/**************************************************************
	 * Admin Functions
	 *
	 **************************************************************/
	
	int adminReservationCount()
	{
		return entries.size();
	}
	
	int adminReturnFirstReservation()
	{
		if (!entries.isEmpty())
			return entries.get(0).getReservId();
		else
			return -1;
	}
	
	/*
	 * admin search functions
	 */
	int adminSearchByUserId(int userId, ArrayList<reservationEntryPublic> searchResult)
	{
		// ArrayList<reservationEntryPublic> searchResult = new ArrayList<reservationEntryPublic>();
		int searchLength = entries.size();
		int count = 0;
		//reservationEntryPublic foundEntry = new reservationEntryPublic();
		for (int i = 0; i < searchLength; i++) {
			if ((entries.get(i).getUserId() == userId))
			{
				reservationEntryPublic foundEntry = new reservationEntryPublic();
				foundEntry.rId = entries.get(i).getReservId();
				foundEntry.roomNum = entries.get(i).getRoomId();
				foundEntry.startDate = entries.get(i).getStartDate();
				foundEntry.endDate = entries.get(i).getEndDate();
				foundEntry.userId = entries.get(i).getUserId();
				searchResult.add(foundEntry);
				count++;
			}
		}
		return count;
	}
        
        //attempt to list all reservations
        
       /* Entry adminListReservations()
	{
		//ArrayList<reservationEntryPublic> searchResult = new ArrayList<reservationEntryPublic>();
			while (!entries.isEmpty()){
				reservationEntryPublic foundEntry = new reservationEntryPublic();
				foundEntry.rId = entries.get(i).getReservId();
				foundEntry.roomNum = entries.get(i).getRoomId();
				foundEntry.startDate = entries.get(i).getStartDate();
				foundEntry.endDate = entries.get(i).getEndDate();
				foundEntry.userId = entries.get(i).getUserId();
                                return entries.get(i);//NOT TESTED
			}
	}*/    
              
        
	int adminSearchByRoomId(int roomId, ArrayList<reservationEntryPublic> searchResult)
	{
		//ArrayList<reservationEntryPublic> searchResult = new ArrayList<reservationEntryPublic>();
		int searchLength = entries.size();
		int count = 0;
		
		for (int i = 0; i < searchLength; i++) {
			if ((entries.get(i).getRoomId() == roomId))
			{
				reservationEntryPublic foundEntry = new reservationEntryPublic();
				foundEntry.rId = entries.get(i).getReservId();
				foundEntry.roomNum = entries.get(i).getRoomId();
				foundEntry.startDate = entries.get(i).getStartDate();
				foundEntry.endDate = entries.get(i).getEndDate();
				foundEntry.userId = entries.get(i).getUserId();
				searchResult.add(foundEntry);
				count++;
			}
		}
		return count;
	}
	
	int adminSearchByBeforeEndDate(Date endDate, ArrayList<reservationEntryPublic> searchResult)
	{
		//ArrayList<reservationEntryPublic> searchResult = new ArrayList<reservationEntryPublic>();
		int searchLength = entries.size();
		int count = 0;
		
		for (int i = 0; i < searchLength; i++) {
			if ((entries.get(i).getEndDate().before(endDate) ))
			{
				reservationEntryPublic foundEntry = new reservationEntryPublic();
				foundEntry.rId = entries.get(i).getReservId();
				foundEntry.roomNum = entries.get(i).getRoomId();
				foundEntry.startDate = entries.get(i).getStartDate();
				foundEntry.endDate = entries.get(i).getEndDate();
				foundEntry.userId = entries.get(i).getUserId();
				searchResult.add(foundEntry);
				count++;
			}
		}

		return count;
	}
	
	/* 
	 * adminChangeReservation can change userId of the corresponding reservation, 
	 * the general changeReservation function cannot change userId.  
	 */
        //int roomNum taken out as a parameter temporarily for testing of adminEditReservations
	int adminChangeReservation (int reservationId, Date startDate, Date endDate, int userId)
	{
		int searchLength = entries.size();
		for (int i = 0; i < searchLength; i++) {
			if ((entries.get(i).getReservId() == reservationId))
			{
				//entries.get(i).setRoomId(roomNum);
				entries.get(i).setStartDate(startDate);
				entries.get(i).setEndDate(endDate);
				entries.get(i).adminSetUserId(userId);
				return 1;
			}
		}
		return 0; //reservation not found!
	}
	
	int adminCancelReservationByRid (int reservationId)
	{
		int searchLength = entries.size();
		for (int i = 0; i < searchLength; i++) {
			if ((entries.get(i).getReservId() == reservationId))
			{
						entries.remove(i);
						return 1;
			}
		}
		return 0; //reservation not found!
	}
	
	int adminCancelReservationByUserId (int userId)
	{
		int searchLength = entries.size();
		int count = 0;
		for (int i = 0; i < searchLength; i++) {
			if ((entries.get(i).getUserId() == userId))
			{
						entries.remove(i);
						count++;
			}
		}
		return count; 
	}
	
	int adminCancelReservationByRoomId (int roomId)
	{
		int searchLength = entries.size();
		int count = 0;
		for (int i = 0; i < searchLength; i++) {
			if ((entries.get(i).getRoomId() == roomId))
			{
						entries.remove(i);
						count++;
			}
		}
		return count; //return how many reservations cancelled
	}
	
	int adminCleanUpByDate(Date cutoffDate)
	{
		int count = 0;
		int searchLength = entries.size();
		for (int i = 0; i < searchLength; i++) {
			if ((entries.get(i).getEndDate().before(cutoffDate)))
			{
						entries.remove(i);
						count++;
			}
		}
		return count; //return how many reservations removed
	}
	/* The following main function is for the purpose of testing reservation process*/
	/*
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		 int[] roomArray = new int[10];
		 int[] userArray = new int[10];
		 Date[] startDateArray = new Date[10];
		 Date[] endDateArray = new Date[10];
		 int reservationId;
		 reservationProcess newReservations = new reservationProcess(); 
		 for (int i = 0; i < 10; i++)
		 {
			 roomArray[i] = i;
			 userArray[i] = i;
			 startDateArray[i] = new Date((2017-1900), Calendar.AUGUST, 3+i);
			 endDateArray[i] = new Date((2017-1900), Calendar.AUGUST, 10+i);
			 reservationId = newReservations.createReservation(roomArray[i], startDateArray[i], endDateArray[i], userArray[i]);
			 if (reservationId == -1)
			 {
				 System.out.println("Failed to create reservation entry!!! ");
				 break;
			 }
		 }
		 for (int i = 0; i < entries.size(); i++)
		 {
			 System.out.println(" Entry " + i + ": reservation ID = " + entries.get(i).getReservId()
					 + " room number = " + entries.get(i).getRoomId()
					 + ", start Date = " + entries.get(i).getStartDate()
					 +", end Date = " + entries.get(i).getEndDate()
					 + ", user ID = " + entries.get(i).getUserId());
		 }
		 
		 int result = newReservations.changeReservation(2, 11, new Date((2018-1900),Calendar.AUGUST, 15 ), new Date((2018-1900),Calendar.AUGUST, 18 ), 2);
		 System.out.println("");
		 System.out.println("");
		 for (int i = 0; i < entries.size(); i++)
		 {
			 System.out.println(" Entry " + i + ": reservation ID = " + entries.get(i).getReservId()
					 + " room number = " + entries.get(i).getRoomId()
					 + ", start Date = " + entries.get(i).getStartDate()
					 +", end Date = " + entries.get(i).getEndDate()
					 + ", user ID = " + entries.get(i).getUserId());
		 }
		 result = newReservations.cancelReservation(2);
		 System.out.println("");
		 System.out.println("");
		 for (int i = 0; i < entries.size(); i++)
		 {
			 System.out.println(" Entry " + i + ": reservation ID = " + entries.get(i).getReservId()
					 + " room number = " + entries.get(i).getRoomId()
					 + ", start Date = " + entries.get(i).getStartDate()
					 +", end Date = " + entries.get(i).getEndDate()
					 + ", user ID = " + entries.get(i).getUserId());
		 }
		 ArrayList<reservationEntryPublic> searchResult = new ArrayList<reservationEntryPublic>();
		 int count	= newReservations.adminSearchByRoomId(4, searchResult);
		 int searchResultSize = searchResult.size();
		 System.out.println("search by roomId, found count = " + count );
		 for (int j = 0; j< searchResultSize; j++)
		 {
			 System.out.println(" Entry: reservationId = " + searchResult.get(j).rId
					 + ", userId = " + searchResult.get(j).userId
					 + ", roomId = " + searchResult.get(j).roomNum
					 + ", startDate = " + searchResult.get(j).startDate
					 + ", endDate = " + searchResult.get(j).endDate);
		 }
		 
		 searchResult.clear();
		 count	= newReservations.adminSearchByUserId(6, searchResult);
		 searchResultSize = searchResult.size();
		 System.out.println("search by userId, found count = " + count );
		 for (int j = 0; j< searchResultSize; j++)
		 {
			 System.out.println(" Entry: reservationId = " + searchResult.get(j).rId
					 + ", userId = " + searchResult.get(j).userId
					 + ", roomId = " + searchResult.get(j).roomNum
					 + ", startDate = " + searchResult.get(j).startDate
					 + ", endDate = " + searchResult.get(j).endDate);
		 }
		 
		 searchResult.clear();
		 count	= newReservations.adminSearchByBeforeEndDate(new Date((2017-1900),Calendar.SEPTEMBER, 15 ), searchResult);
		 searchResultSize = searchResult.size();
		 System.out.println("search by end date, found count = " + count );
		 for (int j = 0; j< searchResultSize; j++)
		 {
			 System.out.println(" Entry: reservationId = " + searchResult.get(j).rId
					 + ", userId = " + searchResult.get(j).userId
					 + ", roomId = " + searchResult.get(j).roomNum
					 + ", startDate = " + searchResult.get(j).startDate
					 + ", endDate = " + searchResult.get(j).endDate);
		 }
	}*/
}