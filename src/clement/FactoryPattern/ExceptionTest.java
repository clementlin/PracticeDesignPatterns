package clement.FactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ExceptionTest extends Thread
{

	@Override
	public void run() {
		
		int read_len;
		char[] buf = new char[100];
		BufferedReader in	;
		ServerSocket ss = null;
		Socket s = null;
		while (!Thread.currentThread().interrupted())
		{
			
			// Larry. 2015.11.20
			try
			{
				
				if (null == ss)
				{
					ss = new ServerSocket(9000);
					ss.setReuseAddress(true);
				}
				System.out.println("create");
				s = ss.accept();
			}
			catch (IOException e1)
			{
				System.out.println("EX");
				e1.printStackTrace();
			}

			try {
				in = new BufferedReader(new InputStreamReader(
						s.getInputStream()));
				System.out.println("Main Thread");
			} catch (IOException e) {
				System.out.println("EX");
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] argv) {
        Thread t = new ExceptionTest(); // 產生Thread物件
        t.start(); // 開始執行t.run()
    }
	
}
