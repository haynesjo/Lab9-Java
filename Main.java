import java.util.ArrayList;
import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
class Main {
 
  public static void main(String[] args) {
  ArrayList<Person> people = new ArrayList<Person>();
  people.add(new Person("Joe",21, "Purple"));
  people.add(new Person("Steve",35, "Blue"));
  people.add(new Person("Steven", 24, "Green"));
  people.add(new Person("Stefon", 35, "Yellow"));
  people.add(new Person("Tom", 9, "Clear"));

try{
  FileWriter writer = new FileWriter("data.txt");
  BufferedWriter bufferW  = new BufferedWriter(writer);
for(int i = 0; i<people.size();i++){
  bufferW.write(people.get(i).getName());
  bufferW.newLine();
  bufferW.write(Integer.toString(people.get(i).getAge()));
  bufferW.newLine();
  bufferW.write(people.get(i).getColor());
  bufferW.newLine();
  bufferW.flush();
}
  bufferW.close();
}
catch(IOException e ){
  System.out.println("An error occured" + e); 
}

try{
FileReader myFile = new FileReader("data.txt");
BufferedReader reader = new BufferedReader(myFile);
while(reader.ready()){
  String name = reader.readLine();
  String color = reader.readLine();
  String age = reader.readLine();
  System.out.printf("%-10s %-10s %-10s %n", name, age,color);
}
reader.close();
}

catch(IOException exc){
  System.out.println("An error occured" + exc); 
}
  }
}