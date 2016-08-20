package hotelguis;

import java.util.*;
import java.text.*;

public class Hotel_room_manager {

public One_Hotel_room[] Hotel_room_manager_object  ; 
	
public Hotel_room_manager() 
{
	Hotel_room_manager_object = new One_Hotel_room[5] ; 
for ( int i=0; i<5; i++) {
	Hotel_room_manager_object[i]=new One_Hotel_room();
	}

}


@SuppressWarnings("deprecation")
		
public  ArrayList<Date> get_each_Hotel_room_reservation_list ( int room_number){
    return Hotel_room_manager_object[room_number].Get_Hotel_room_Reservation_list() ;
    }
		
public  void Occupy_Hotel_room ( Date Start_Date_1 , Date End_Date_1 , int room_number ) { 	
    Hotel_room_manager_object[room_number].Occupy_Hotel_room(Start_Date_1 , End_Date_1 , room_number ) ;
}
		
public  void free_expired_rooms ( Date free_room_1 ) {
    for ( int counter = 0; counter < 5; counter++){ 
	Hotel_room_manager_object[counter].free_room(free_room_1) ;
    }
}
		
public  void configure_hotel_room ( int configuration_1   ) {
    if ( configuration_1 == 0 ){
	Hotel_room_manager_object[0].Set_Hotel_room(0 , 0) ;          // configuring Hotel room number 0 to 2 King size bed 
        Hotel_room_manager_object[1].Set_Hotel_room(2 , 1) ;          // configuring Hotel room number 1 to 2 queen size bed 
	Hotel_room_manager_object[2].Set_Hotel_room(2 , 2) ;          // configuring Hotel room number 2 to 2 queen size bed 
	Hotel_room_manager_object[3].Set_Hotel_room(3 , 3) ;          // configuring Hotel number 3 to 1 King size bed 
	Hotel_room_manager_object[4].Set_Hotel_room(4 , 4) ;          // configuring Hotel number 4 to 1 queen size bed 
    }
    else {
	Hotel_room_manager_object[0].Set_Hotel_room(0 , 0) ;   // configuring Hotel number 0 to 2 King size bed 
        Hotel_room_manager_object[1].Set_Hotel_room(0 , 1) ;   // configuring Hotel number 1 to 2 King size bed
	Hotel_room_manager_object[2].Set_Hotel_room(0 , 2) ;   // configuring Hotel number 2 to 2 King size bed
	Hotel_room_manager_object[3].Set_Hotel_room(0 , 3) ;  // configuring Hotel number 3 to 2 King size bed
	Hotel_room_manager_object[4].Set_Hotel_room(0 , 4) ;  // configuring Hotel number 4 to 2 King size bed
    }   
}

public int check_availability (int type_of_the_room_requsted , Date Start_Date_1 , Date End_Date_1   ) {
    int local_variable_integer ;
    boolean local_variable_boolean ;
    int room_number = 0 ;
		   
    for ( int counter = 0; counter < 5; counter++ ){ 
	local_variable_integer = Hotel_room_manager_object[counter].Get_Hotel_room_type() ;
        if ( local_variable_integer == type_of_the_room_requsted){ 
            local_variable_boolean = Hotel_room_manager_object[counter].check_Hotel_room(Start_Date_1 , End_Date_1) ; 
            if ( local_variable_boolean == false ){
                room_number = Hotel_room_manager_object[counter].Get_Hotel_room_number() ;//return room_number ;
                break ;
            }
            else { room_number = 999 ;} //return room_number ;
        }      
        else {room_number = 999; }
    }
    return room_number;
}
}