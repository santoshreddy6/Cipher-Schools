package coreJava;

class Car{
String name;
String color;
int year;
int maxSeed;
void accelerate() {
System.out.println("Car is accelerating");
}
}

public class CarStudy{

public static void main(String[] args) {
Car polo new Car();
System.out.println(polo.name);
System.out.println(polo.color);
System.out.println(polo.year);
System.out.println(polo.maxSpeed);

polo.name = "Polo";
polo.color = "Red";
polo.year 2016;
polo.maxSpeed = 120;

System.out.println(polo.name);
System.out.println(polo.color);
System.out.println(polo.year);
System.out.println(polo.maxSpeed);
}
}

CONTROL FLOW.Java

package coreJava;
import java.util.*;
class Student{
String name;
int marks;
I
boolean checkPass()
{ 
if(marks>=40) return true; 
return false;
}
}
public class ControlFlow {
int findMax(int a, int b, int c)
{
if(a>b)//Nested If-Else
{
if(a>c)
{
return a;
}
else {
return c;
}
}
else {
if(b>c)
{
return b;
}
else {
return c;
}
}
}
