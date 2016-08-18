package hotelguis;

public class MyDate {
    
	private int _year;
	private int _month;
	private int _day;
	
	//Default constructor, don't use
	public MyDate(){
		_year = 0;
		_month = 0;
		_day = 0;
	}
	
	//Good constructor
	public MyDate(int year, int month, int day){
		_year = year;
		_month = month;
		_day = day;
	}
	
	public int getYear(){
		return _year;
	}
	
	public int getMonth(){
		return _month;
	}
	
	public int getDay(){
		return _day;
	}
	
	//If date is strictly before this then true, otherwise false
	public boolean before(MyDate date){
		
		if(date.getYear() < _year){
			return true;
		}
		else{
			if(date.getYear() == _year){
				if(date.getMonth() < _month){
					return true;
				}
				else{
					if(date.getMonth() == _month){
						if(date.getDay() < _day){
							return true;
						}
						else{
							return false;
						}
					}
					else{
						return false;
					}
				}
			}
			else{
				return false;
			}
		}
	}
	
	//If date is strictly after this then true, otherwise false
	public boolean after(MyDate date){
		
		if(before(date)){
			//System.out.println("Here 11");
			return false;
		}
		else{
			return date != this;
		}
	}
	
	public boolean equal(MyDate date){
		
		return !(before(date) || after(date)); 
	}
}
