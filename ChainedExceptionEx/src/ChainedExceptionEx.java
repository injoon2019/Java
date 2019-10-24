class ChainedExceptionEx {
	public static void main(String args[]) {
		try {
			install();
		} catch(InstallException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	} //end of main
	
	static void install() throws InstallException{
		try {
			startInstall();
			copyFiles();
		}catch(SpaceException se) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(se);
			throw ie;
		}catch (MemoryException me) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(me);
			throw ie;
		}finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace()) {
			throw new SpaceException("��ġ�� ������ �����մϴ�");
		}
		
		if(!enoughMemory()) {
			throw new MemoryException("Out of Memory");
		}
	}
	
	static void copyFiles() {/*File copy codes*/}
	static void deleteTempFiles() {/*delete temp Files*/}
	
	static boolean enoughSpace() {
		return false;
	}
	static boolean enoughMemory() {
		return true;
	}
}

class InstallException extends Exception{
	InstallException(String msg){
		super(msg);
	}
}

class SpaceException extends Exception{
	SpaceException(String msg){
		super(msg);
	}
}

class MemoryException extends Exception{
	MemoryException(String msg){
		super(msg);
	}
}


