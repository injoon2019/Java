class FinallyTest2 {
	public static void main(String args[]) {
		try {
			startInstall();
			copyFiles();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
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