import java.util.Scanner;
import java.util.Date;
import java.io.*;
public class Main {

	public static void main(String[] args) {

               int id,length,i=0; 
String fullName; 
Date birthDate; 
double avgMark;
    Scanner s= new Scanner(System.in);
System.out.println("Enter the Number of Students:");
length=s.nextInt();

            for(i=1;i<=length;i++)
{
System.out.println("Enter the Name of Student"+i+":");
fullName=s.nextLine();
System.out.println("Enter the ID of Student"+i+":");
id=s.nextInt();
System.out.println("Enter the DOB of Student"+i+":");
birthDate=s.nextDate();
System.out.println("Enter the AVG of Student"+i+":");
avgMark=s.nextDouble();
Student st= new Student(id,fullNmae,birthDate,avgMarks);
}
StudentGroup sg= new StudentGroup();
sg.getStudents();
sg.setStudents(Student[] students);
sg.getStudent(4);
sg.setStudent(Student student, int index)
sg.addFirst(Student student); 
sg.addLast(Student student);
sg.add(Student student, int index);
sg.remove(int index);
sg.remove(Student student);
sg.removeFromIndex(int index);
sg. removeFromElement(Student student);
sg.removeToIndex(int index);
sg.removeToElement(Student student);
sg.void bubbleSort();
sg.getStudentsWithMaxAvgMark();
sg.getNextStudent(Student student);

		
		
        }         

