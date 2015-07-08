package Homework;

/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;
    String[] dimension = new String[5];

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */
    try{
    	String urlname = "http://www.";
    	urlname = urlname.concat(inputLine);
    	urlname = urlname.concat(".com");
    	System.out.println("The website will be :"+urlname);
    	URL url = new URL(urlname);
    	HttpURLConnection con = (HttpURLConnection)url.openConnection();
    	con.setInstanceFollowRedirects(false);
    	con.setUseCaches(false);
    	con.setAllowUserInteraction(false);
    	con.connect();
    	String line = "";
    	BufferedReader URLinput = new BufferedReader(new InputStreamReader(con.getInputStream()));
    	int i=0;
    	while((line = URLinput.readLine()) != null && i<5){
    		dimension[i] = line;
    		if(i == 4)
    			for(int j=0;j<5; j++)
    				System.out.println(dimension[4-j]);
    		i++;
    	}
    	con.disconnect();
    }
    catch(Exception e){
    }

  }
}