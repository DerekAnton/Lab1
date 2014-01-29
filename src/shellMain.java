import java.io.*;

public class shellMain
{
	public static void main(String[] args) throws java.io.IOException 
	{
		String commandLine;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		while (true) 
		{
			System.out.print("mysh>");
			commandLine = console.readLine();
			if (commandLine.equals(""))
				continue;
			else if(commandLine.equals("quit"))
				break;
		}
	}
}
