package hotelguis;

import java.util.*;
import java.text.*;
import java.util.Date;
import java.util.Calendar;

public class One_Hotel_room {
	
private int Type_of_the_room;            // 0 :  2 king size bed , most expensive 
	                                 // 1 :  1 king size bed , 1 queen size bed second most expensive
	                                 // 2 :  2 queen size bed , third most expensive
	                                 // 3 :  1 king size bed 
                                         // 4 :  1 queen size bed 	
private int room_number;    	
private ArrayList<Date> Reservation_Date;
private int Number_of_Reservations ;
 
@SuppressWarnings("deprecation")
public One_Hotel_room () {
    Date local_date = new Date() ; 
    Date local_date_1 = new Date() ;
    local_date.setYear(1900);
    local_date.setMonth(0);
    local_date.setDate(12);
    local_date_1.setYear(2200);
    local_date_1.setMonth(0);
    local_date_1.setDate(12);

    this.Type_of_the_room = 99 ;
    this.room_number = 5555 ;
    this.Number_of_Reservations = 0 ;
    this.Reservation_Date = new ArrayList<Date>();
         
    for ( int counter = 0; counter < 100; counter= counter + 1 ){
        Reservation_Date.add(local_date) ;  
        Reservation_Date.add(local_date_1) ;  
    }       	  
 }

public void Set_Hotel_room ( int Type_of_the_room ,  int room_number  ){
    this.Type_of_the_room = Type_of_the_room ;
    this.room_number = room_number ;
}

@SuppressWarnings("deprecation")
public boolean check_Hotel_room ( Date Start_date , Date End_date ){ 
    boolean local_variable_1 ;
    int temp_55 = 0 ;
    Date start_when = new Date();
    Date end_when = new Date();
		   
    for ( int counter = 0; counter < 99; counter= counter + 2 ){ 
        start_when = Reservation_Date.get(counter) ;
	end_when   = Reservation_Date.get(counter+1) ;
			     
    if   (  ( End_date.before(start_when) ) || ( Start_date.after(end_when)  )  ) { 
        temp_55 = temp_55 + 1 ;
        }
    }
    if ( temp_55 == Number_of_Reservations  ){ 
        local_variable_1 = false ;
	}
    else {
	local_variable_1 = true  ;	
    }
    return local_variable_1 ;
}

@SuppressWarnings("deprecation")
public void Occupy_Hotel_room ( Date Start_date , Date End_date, int room_number  ){
			
    Date start_when = new Date();
    Date end_when = new Date();
		
    for ( int counter = 0; counter < 99; counter= counter + 2 ){ 
        start_when = Reservation_Date.get(counter) ;
        end_when   = Reservation_Date.get(counter+1) ;
        if ( start_when.getYear() == 1900 ){ 
            Reservation_Date.set(counter,Start_date) ; 
            Reservation_Date.set(counter+1,End_date) ; 
            Number_of_Reservations++ ;
            this.room_number = room_number ;
            break ;
        }
    }
}
	
public int Get_Hotel_room_type () { 
    return Type_of_the_room ;
}
	
public int Get_Hotel_room_number() { 
    return room_number ;
}
   
public ArrayList<Date> Get_Hotel_room_Reservation_list() { 
    return Reservation_Date ;
}
   
@SuppressWarnings("deprecation")
public void free_room ( Date free_room_1 ){ 
    Date end_when = new Date();
    Date local_date = new Date() ; 
    Date local_date_1 = new Date() ; 
    local_date.setYear(1900);
    local_date.setMonth(0);
    local_date.setDate(12);
    local_date_1.setYear(2200);
    local_date_1.setMonth(0);
    local_date_1.setDate(12);
		
for ( int counter = 0; counter < 99; counter= counter + 2 ){ 
    end_when   = Reservation_Date.get(counter+1) ;
    if  ( ( free_room_1.after(end_when)  ) ){    
	Reservation_Date.set(counter,local_date) ; 
	Reservation_Date.set(counter+1,local_date_1) ; 
	Number_of_Reservations-- ;
	} 
    }
}
}