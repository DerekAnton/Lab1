import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class shellMain
{
	public static void main(String[] args) throws java.io.IOException 
	{
		String[] commandLine;
		String delimiter = " ";
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		Process child;
		while (true) 
		{
			System.out.print("mysh>");
			
			commandLine = (console.readLine()).split(delimiter);
			
			if (commandLine.equals(""))
				continue;
			else if(commandLine.equals("quit"))
				break;
			else
			{
				try
				{
					child = Runtime.getRuntime().exec(commandLine);
					Scanner scan = new Scanner(child.getInputStream());
					
					while(scan.hasNext())
					{
						System.out.println(scan.nextLine());
					}
					child.waitFor();
				}
				catch(InterruptedException e)
				{
					System.out.println("An interrupt exception was caught");	
				}
			}
		}
	}
}
