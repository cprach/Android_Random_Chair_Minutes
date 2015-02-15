package rach.cp.app;

import junit.framework.TestCase;

public class RachTest extends TestCase {
	
	public void t1() {
		Logic2 l2 = new Logic2();
		l2.makeNames();
		String ch = l2.getChair();
		String m = l2.getMinuteTaker();
		
		assertTrue(!ch.equals("Mahen"));
		
	}

}
