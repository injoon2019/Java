import java.util.*;
class CalendarEx7 {
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("Usage: java CalendarEx7 2019 11");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		//���� ��� 0���� 11������ ���� �����Ƿ� 1�� ������Ѵ�
		sDay.set(year, month-1, 1);	//�Է¿��� 1�Ϸ� ����
		eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE));	//�Է¿��� ���Ϸ� ����	
		sDay.add(Calendar.DATE,  -sDay.get(Calendar.DAY_OF_WEEK)+1);	//1���� ���� ���� �Ͽ���
		eDay.add(Calendar.DATE, 7-eDay.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("\n"+year+"�� "+month+"��");
		System.out.println(" SU MO TU WE TH FR SA");
		
		for(int n=1; sDay.before(eDay) || sDay.equals(eDay); sDay.add(Calendar.DATE, 1)) {
			int day= sDay.get(Calendar.DATE);
			System.out.print((day<10)? "  "+day : " "+day);
			if(n++ %7==0) System.out.println();
		}
	}
}
