package hotelguis;


import java.util.Calendar;
import java.util.ArrayList;


public class Hotel_room_manager {

	public One_Hotel_room[] Hotel_room_manager_object; 
	
	public Hotel_room_manager() 
	{
		Hotel_room_manager_object = new One_Hotel_room[100]; 
		
		configure_hotel_room(0);
	}
	
	public boolean Are_Valid_Dates (Calendar Start_Date_1, Calendar End_Date_1) {
		if (!End_Date_1.after(Start_Date_1)) {
			return false;
		}
		
		if (Start_Date_1.before(Calendar.getInstance())) {
			return false;
		}
		
		return true;
	}
		
	public ArrayList<Calendar> get_each_Hotel_room_reservation_list (int room_number) {
		return Hotel_room_manager_object[room_number].Get_Hotel_room_Reservation_list();
    }
		
	public void Occupy_Hotel_room (Calendar Start_Date_1, Calendar End_Date_1, int room_number) { 	
		for(int i = 0; i < Hotel_room_manager_object.length; i++){
			if(room_number == Hotel_room_manager_object[i].Get_Hotel_room_number()){
				Hotel_room_manager_object[i].Occupy_Hotel_room(Start_Date_1, End_Date_1);
			}
		}
	}

	public void cancel_room (Calendar Start_Date_1, Calendar End_Date_1, int room_number) {
		for(int i = 0; i < Hotel_room_manager_object.length; i++){
			if(room_number == Hotel_room_manager_object[i].Get_Hotel_room_number()){
				Hotel_room_manager_object[i].free_room_exact_date(Start_Date_1, End_Date_1);
			}
		}
	}

	public void free_expired_rooms (Calendar free_room_1) {
		for (int counter = 0; counter < Hotel_room_manager_object.length; counter++) { 
			Hotel_room_manager_object[counter].free_room(free_room_1);
		}
	}
		
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

	public ArrayList<Integer> check_availability (int type_of_the_room_requsted, Calendar Start_Date_1, Calendar End_Date_1) {
		int local_variable_integer;
		int check_result;
		ArrayList<Integer> room_numbers = new ArrayList<Integer>();
		   
		for (int counter = 0; counter < Hotel_room_manager_object.length; counter++ ) { 
			local_variable_integer = Hotel_room_manager_object[counter].Get_Hotel_room_type();
        
			System.out.printf("Printing hotel room type .... %d. %n ", local_variable_integer);
			System.out.printf("Printing type of the room requested .... %d. %n ", type_of_the_room_requsted);
			
			if (local_variable_integer == type_of_the_room_requsted) { 
				check_result = Hotel_room_manager_object[counter].check_Hotel_room(Start_Date_1 , End_Date_1);
				
				if (check_result >= 0) {
					room_numbers.add(Hotel_room_manager_object[counter].Get_Hotel_room_number());
					//break;
				}
			}
		}
		
		return room_numbers;
	}
}