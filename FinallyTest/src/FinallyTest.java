class FinallyTest {
	public static void main(String args[]) {
		try {
			startInstall();
			copyFiles();
			deleteTempFiles();
		}catch (Exception e) {
			e.printStackTrace();
			deleteTempFiles();
		}
	}
	
	static void startInstall() {
		//���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ�
	}
	
	static void copyFiles() {
		//���ϵ��� �����ϴ� �ڵ�
	}
	
	static void deleteTempFiles() {
		//�ӽ����ϵ��� �����ϴ� �ڵ� 
	}
}
