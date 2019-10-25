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
		
		//���� ��� 0���� 11������ ���� �����Ƿ� 1�� ���־�� �Ѵ�
		//���� ���, 2004�� 11�� 1���� sDay.set(2004, 10, 1); �� ���� 
		sDay.set(year, month-1, 1);
		eDay.set(year, month , 1);
		
		//�������� ù������ �Ϸ縦 ���� ������� ������ ���� �ȴ�
		eDay.add(Calendar.DATE, -1);
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("     " +args[0]+"�� "+args[1]+"��");
		System.out.println(" SU MO TU WE TH FR SA");
		
		//�ش� ���� 1���� ��� ���������� ���� ������ ����Ѵ�
		for(int i=1; i<START_DAY_OF_WEEK; i++) {
			System.out.print("   ");
		}	
		for(int i1=1, n=START_DAY_OF_WEEK; i1<=END_DAY; i1++, n++) {
			System.out.print((i1<10)? "  "+i1 : " "+i1);
			if(n%7==0) System.out.println();
		}
		
	}
}
