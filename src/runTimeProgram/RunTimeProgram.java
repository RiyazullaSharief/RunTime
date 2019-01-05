package runTimeProgram;

import java.io.IOException;

public class RunTimeProgram
{
	public static void main(String[] args) throws IOException
	{
		Runtime rv=Runtime.getRuntime();
		rv.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		rv.exec("C:\\Program Files\\Microsoft Office\\Office15\\WINWORD.exe");
		//rv.exec("C:\\Program Files (x86)\\EditPlus 3\\editplus.exe");
	}
}
