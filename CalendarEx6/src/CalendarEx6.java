import java.util.*;

class CalendarEx6 {
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("Usage: java CalendarEx6 2015 9");
			return;
		}
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		int START_DAY_OF_WEEK=0;
		int END_DAY=0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		//월의 경우 0부터 11까지의 값을 가지므로 1을 빼주어야 한다
		//예를 들어, 2004년 11월 1일은 sDay.set(2004, 10, 1); 과 같이 
		sDay.set(year, month-1, 1);
		eDay.set(year, month , 1);
		
		//다음달의 첫날에서 하루를 빼면 현재달의 마지막 날이 된다
		eDay.add(Calendar.DATE, -1);
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("     " +args[0]+"년 "+args[1]+"월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		//해당 월의 1일이 어느 요일인지에 따라서 공백을 출력한다
		for(int i=1; i<START_DAY_OF_WEEK; i++) {
			System.out.print("   ");
		}	
		for(int i1=1, n=START_DAY_OF_WEEK; i1<=END_DAY; i1++, n++) {
			System.out.print((i1<10)? "  "+i1 : " "+i1);
			if(n%7==0) System.out.println();
		}
		
	}
}
