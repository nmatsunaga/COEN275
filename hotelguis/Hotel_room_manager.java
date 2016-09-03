package hotelguis;


import java.util.Calendar;
import java.util.ArrayList;


public class Hotel_room_manager {

	//DATA
	public One_Hotel_room[] Hotel_room_manager_object; 
	
	//CONSTRUCTOR
	public Hotel_room_manager() 
	{
		Hotel_room_manager_object = new One_Hotel_room[100]; 
		
		configure_hotel_room(0);
	}
	
	//Returns if the user inputted dates meet certain logical requirements
	public boolean Are_Valid_Dates (Calendar Start_Date_1, Calendar End_Date_1) {
		if (!End_Date_1.after(Start_Date_1)) {
			return false;
		}
		
		if (Start_Date_1.before(Calendar.getInstance())) {
			return false;
		}
		
		return true;
	}
	
	//Returns occupied dates for a given room
	public ArrayList<Calendar> get_each_Hotel_room_reservation_list (int room_number) {
		return Hotel_room_manager_object[room_number].Get_Hotel_room_Reservation_list();
    }

	//Sets a new occupied set of dates for the given hotel room
	public void Occupy_Hotel_room (Calendar Start_Date_1, Calendar End_Date_1, int room_number) { 	
		for(int i = 0; i < Hotel_room_manager_object.length; i++){
			if(room_number == Hotel_room_manager_object[i].Get_Hotel_room_number()){
				Hotel_room_manager_object[i].Occupy_Hotel_room(Start_Date_1, End_Date_1);
			}
		}
	}

	//Removes the occupied dates from a given room
	public void cancel_room (Calendar Start_Date_1, Calendar End_Date_1, int room_number) {
		for(int i = 0; i < Hotel_room_manager_object.length; i++){
			if(room_number == Hotel_room_manager_object[i].Get_Hotel_room_number()){
				Hotel_room_manager_object[i].free_room_exact_date(Start_Date_1, End_Date_1);
			}
		}
	}

	//Removes out-date occupied dates based on the current day
	public void free_expired_rooms (Calendar free_room_1) {
		for (int counter = 0; counter < Hotel_room_manager_object.length; counter++) { 
			Hotel_room_manager_object[counter].free_room(free_room_1);
		}
	}
	
	//Function to set the description of the hotel for the system
	public void configure_hotel_room (int configuration_1) {
		if (configuration_1 == 0) {
			for (int counter = 0; counter < Hotel_room_manager_object.length; counter++) {
				Hotel_room_manager_object[counter] = new One_Hotel_room(((100 * ((counter / 25) + 1)) + counter % 25), (counter % 5));
				System.out.println("Room Number: " + ((100 * ((counter / 25) + 1)) + counter % 25) + "\t\tRoom Type: " + (counter % 5));
			}
		}
		else {
			for (int counter = 0; counter < Hotel_room_manager_object.length; counter++) {
				Hotel_room_manager_object[counter] = new One_Hotel_room(((100 * ((counter % 25) + 1)) + counter), (counter % 5));
			}
		}
	}

	//Returns an list of integers that correspond to available room numbers based on the given query
	public ArrayList<Integer> check_availability (int type_of_the_room_requsted, Calendar Start_Date_1, Calendar End_Date_1) {
		int local_variable_integer;
		int check_result;
		ArrayList<Integer> room_numbers = new ArrayList<Integer>();
		   
		for (int counter = 0; counter < Hotel_room_manager_object.length; counter++) { 
			local_variable_integer = Hotel_room_manager_object[counter].Get_Hotel_room_type();
        
			System.out.printf("Printing hotel room type .... %d. %n ", local_variable_integer);
			System.out.printf("Printing type of the room requested .... %d. %n ", type_of_the_room_requsted);
			
			if (local_variable_integer == type_of_the_room_requsted) { 
				check_result = Hotel_room_manager_object[counter].check_Hotel_room(Start_Date_1 , End_Date_1);
				
				if (check_result >= 0) {
					room_numbers.add(Hotel_room_manager_object[counter].Get_Hotel_room_number());
				}
			}
		}
		
		return room_numbers;
	}
}