package asynchronous;

import java.util.Date;

public class Display implements Runnable {

	@Override
	public void run() {
		Date date = new Date();
		while(true) {
			System.out.println(date);
		}
	}

}
