package hotelguis;


import java.util.Calendar;
import java.util.ArrayList;

public class One_Hotel_room {
	
	private int Type_of_the_room;       // 0 :  2 king size bed , most expensive 
	                                 	// 1 :  1 king size bed , 1 queen size bed second most expensive
	                                 	// 2 :  2 queen size bed , third most expensive
	                                 	// 3 :  1 king size bed 
                                     	// 4 :  1 queen size bed 	
	private int room_number;
	//private ArrayList<Date> Reservation_Date;
	private ArrayList<Calendar> Reservation_Date;
	private int Number_of_Reservations;
	
	public One_Hotel_room () {
		this.Type_of_the_room = -1;
		this.room_number = -1;
		this.Number_of_Reservations = 0;
		//this.Reservation_Date = new ArrayList<Date>();   
		this.Reservation_Date = new ArrayList<Calendar>();
	}
	
	public One_Hotel_room (int number, int type) {
		this.Type_of_the_room = type;
		this.room_number = number;
		this.Number_of_Reservations = 0;
		//this.Reservation_Date = new ArrayList<Date>();
		this.Reservation_Date = new ArrayList<Calendar>();
	}
	
	public int Get_Hotel_room_type () { 
		return Type_of_the_room;
	}
	
	public int Get_Hotel_room_number() { 
		return room_number;
	}
   
	//public ArrayList<Date> Get_Hotel_room_Reservation_list() {
	public ArrayList<Calendar> Get_Hotel_room_Reservation_list() {
		return Reservation_Date;
	}

	public void Set_Hotel_room (int Type_of_the_room , int room_number){
		this.Type_of_the_room = Type_of_the_room;
		this.room_number = room_number;
	}

	//public int check_Hotel_room (Date Start_date, Date End_date) {
	public int check_Hotel_room (Calendar Start_date, Calendar End_date) {
		int datesRemaining = 0;
		
		if (Reservation_Date.size() == 0) {
			return 0;
		}
		
		if (Start_date.before(Reservation_Date.get(0))) {	
			if (!End_date.after(Reservation_Date.get(0))) {
				return 0;
			}
			else {
				return -1;
			}
		}
		
		if (End_date.after(Reservation_Date.get(Reservation_Date.size() - 1))) {
			if (!Start_date.before(Reservation_Date.get(Reservation_Date.size() - 1))) {
				return Reservation_Date.size();
			}
			else {
				return -1;
			}
		}
		
		//Hmmmmm...
		while (datesRemaining < Reservation_Date.size()) {
			//Date d = Reservation_Date.get(datesRemaining);
			Calendar d = Reservation_Date.get(datesRemaining);
			
			if(!End_date.after(d)) {
				break;
			}
			
			datesRemaining = datesRemaining + 2;
		}
	
		if (!Start_date.before(Reservation_Date.get(datesRemaining - 1))) {
			return datesRemaining;
		}
		
		return -1;
	}

	//public void Occupy_Hotel_room (Date Start_date, Date End_date) {
	public void Occupy_Hotel_room (Calendar Start_date, Calendar End_date) {
		int index = check_Hotel_room (Start_date, End_date);
		
		if (index >= 0) {
			Reservation_Date.add(index, End_date);
			Reservation_Date.add(index, Start_date);
			
			Number_of_Reservations++;
			
			System.out.println("Did occupy room");
			
			return;
		}
		
		System.out.println("Did not occupy room");
	}

	//public void free_room (Date free_room_1) {
	public void free_room (Calendar free_room_1) {
		int numReservationsToDelete = 0;
		
	    for (int counter = 0; counter < Reservation_Date.size(); counter = counter + 2) { 
	    	if ((free_room_1.after(Reservation_Date.get(counter + 1)))) {    
	    		numReservationsToDelete++;
	    	}
	    }
	    
	    for (int counter = 0; counter < numReservationsToDelete; counter++) {
	    	Reservation_Date.remove(0);
	    	Reservation_Date.remove(0);
	    }
	    
	    Number_of_Reservations = Number_of_Reservations - numReservationsToDelete;
	    
	    System.out.printf("Removed %d dates\n", numReservationsToDelete);
	}

	//public void free_room_exact_date (Date Start_date_1, Date End_date_1) {
	public void free_room_exact_date (Calendar Start_date_1, Calendar End_date_1) {
		//Date start_when;
		//Date end_when;
		Calendar start_when;
		Calendar end_when;
			    
	    for (int counter = 0; counter < Reservation_Date.size(); counter = counter + 2) { 
	    	start_when = Reservation_Date.get(counter);
	    	end_when = Reservation_Date.get(counter + 1);
	    	
	    	if ((Start_date_1.equals(start_when)) && (End_date_1.equals(end_when))) {
	    		System.out.println("Found date to remove");
	    		Reservation_Date.remove(counter);
	    		Reservation_Date.remove(counter); 
	    		Number_of_Reservations--;
	    		return;
			} 
	    }
	    
	    System.out.println("Did not find date to remove");
	}
	
	@Override
	public String toString() {
		String result = "";
		
		result += "Room number: " + room_number + "\n";
		result += "Room type: " + Type_of_the_room + "\n";
		result += "Dates occupied:\n";
		
		for(int i = 0; i < Reservation_Date.size(); i = i + 2){
			//Date d1 = Reservation_Date.get(i);
			//Date d2 = Reservation_Date.get(i + 1);
			Calendar d1 = Reservation_Date.get(i);
			Calendar d2 = Reservation_Date.get(i + 1);
			//result += "\t" + d1.getMonth() + "/" + d1.getDay() + "/" + d1.getYear() + " - " + d2.getMonth() + "/" + d2.getDay() + "/" + d2.getYear() + "\n"; 
			result += "\t" + d1.get(Calendar.MONTH) + "/" + d1.get(Calendar.DAY_OF_MONTH) + "/" + d1.get(Calendar.YEAR) + " - " + d2.get(Calendar.MONTH) + "/" + d2.get(Calendar.DAY_OF_MONTH) + "/" + d2.get(Calendar.YEAR) + "\n"; 
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		One_Hotel_room room1 = new One_Hotel_room(0, 1);
		Calendar start, end;
		
		System.out.println(room1);
		
		start = Calendar.getInstance();
		end = Calendar.getInstance();
		start.set(2016, 10, 3);
		end.set(2016, 11, 2);
		
		room1.Occupy_Hotel_room(start, end);
		
		System.out.println(room1);
		
		start = Calendar.getInstance();
		end = Calendar.getInstance();
		start.set(2016, 11, 2);
		end.set(2016, 11, 4);
		
		room1.Occupy_Hotel_room(start, end);
		
		System.out.println(room1);
		
		start = Calendar.getInstance();
		end = Calendar.getInstance();
		start.set(2016, 8, 4);
		end.set(2016, 8, 7);
		
		room1.Occupy_Hotel_room(start, end);
		
		System.out.println(room1);
		
		start = Calendar.getInstance();
		end = Calendar.getInstance();
		start.set(2016, 8, 4);
		end.set(2016, 10, 17);
		
		room1.Occupy_Hotel_room(start, end);
		
		System.out.println(room1);
		
		start = Calendar.getInstance();
		end = Calendar.getInstance();
		start.set(2016, 10, 4);
		end.set(2016, 10, 17);
		
		room1.Occupy_Hotel_room(start, end);
		
		System.out.println(room1);
		
		start = Calendar.getInstance();
		end = Calendar.getInstance();
		start.set(2016, 9, 4);
		end.set(2016, 9, 17);
		
		room1.Occupy_Hotel_room(start, end);
		
		System.out.println(room1);
	}
}