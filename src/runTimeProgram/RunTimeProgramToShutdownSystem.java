package runTimeProgram;

import java.io.IOException;

public class RunTimeProgramToShutdownSystem
{
	public static void main(String[] args) throws IOException
	{
		Runtime rv=Runtime.getRuntime();
		rv.exec("shutdown -s");
	}
}
