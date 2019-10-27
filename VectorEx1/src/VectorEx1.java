import java.util.*;

class VectorEx1 {
	public static void main(String[] args) {
		Vector v= new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize();//�� ������ ���ش� �뷮�� ũ�Ⱑ ��������
		System.out.println("===After trimToSize() ===");
		print(v);
		
		v.ensureCapacity(6);
		System.out.println("===After ensureCapacity(6) ===");
		print(v);
		
		v.setSize(7);
		System.out.println("===After v.setSize(7); ===");
		print(v);
		
		v.clear();
		System.out.println("===After v.clear(); ===");
		print(v);
	}
	
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size: "+v.size());
		System.out.println("capacity :"+v.capacity());
	}
}