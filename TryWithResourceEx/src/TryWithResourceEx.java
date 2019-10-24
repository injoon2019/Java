class TryWithResourceEx {
	public static void main(String args[]) {
		try(CloseableReousrce cr = new CloseableResource()){
			cr.exceptionWork(false);
		}catch(WorkException e) {
			e.printStatckTrace();
		}catch(CloseException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try(CloseableResource cr = new CloseableResource()){
			cr.exceptionWork(true);
		}catch(WorkException e) {
			e.printStackTrace();
		}catch(CloseException e) {
			e.printStackTrace();
		}
	}
}

class CloseableResource implements AutoCloseable{
	public void exceptionWork(boolean exception) throws WorkException{
		System.out.println("exceptionWork("+exception+")가 호출됨");
		
		if(exception)
			throws new WorkException("WorkException발생!");
	}
	
	public void close() throws CloseExcepion{
		System.out.println("close()가 호출됨");
		throw new CloseException("CloseException발생!");
	}
}

class WorkException extends Exception{
	WorkException(String msg){ super(msg);}
	}
}

class CloseException extends Exception{
	CloseException(String msg){super(msg);}
}