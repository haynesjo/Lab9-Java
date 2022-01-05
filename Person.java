import java.util.ArrayList;
import java.io.*;
class Person{
public String name;
public int age;
public String color; 
//Person p = new Person("Joe","blue");
/*Person(){
  name="Joe";
  age=0;
  color="blue";
}
*/
Person(String aName,int aAge,String aColor){
  name=aName;
  age=aAge;
  color=aColor;
}
String getName(){
  return name;
}
int getAge(){
  return age;
}
String getColor(){
  return color; 
}
/*
void setName(String aName){
  name = aName;
}
void setAge(String aAge){
  age = aAge;
}
void setColor(String aColor){
  color = aColor;
}
*/
}