package application;
import java.io.*;
import java.util.ArrayList;

import model.Car;
import view.Question1;
 
//This class provides methods to serialize a serializable object
public class SerializeObject
{
	private Question1 lucas;
	
	lucas = new Question1(this);
   public static void main(String args[])
   {
      String serializeFileName = "CarList.ser";
      if(args.length > 0)
      {
         serializeFileName = args[0];
      }
 
      ArrayList<Car> list  = new ArrayList<Car>();
      FileOutputStream fileOutputStream = null;
      ObjectOutputStream objectOutputStream = null;
      
      try
      {
         fileOutputStream = new FileOutputStream(serializeFileName);
         objectOutputStream = new ObjectOutputStream(fileOutputStream);
         //The object is being persisted here
         objectOutputStream.writeObject(list);
         objectOutputStream.close();
         System.out.println("Serialize Car List");
         System.out.println("Object serialized in file : " + serializeFileName);
      }
      catch(IOException ioe)
      {
         //Close all I/O streams
         ioe.printStackTrace();
         //Handle the exception here
      }
   }
}