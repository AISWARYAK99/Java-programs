import java.util.Scanner;
abstract class Employee
{
	String name;
	int age;
	int[] ph;
	String address;
	double salary;
	abstract void printSalary();

}
class Officer extends Employee
{
	
	void printName()
	{
		System.out.println("Name :"+name +"-Officer");
	}
	void printAge()
	{
		System.out.println("Age :"+age);
	}
	void printPhone()
	{
		System.out.print("Phone :");
		for(int i=0;i<10;i++)
		{	
			System.out.print(ph[i]);
		}
		System.out.println("");	
	}
	void printAddress()
	{
		System.out.println("Address :"+address);
	}
	void printSalary()
	{
		System.out.println("Salary :"+salary);
	}
}
class Manager extends Employee
{
	
	void printName()
	{
		System.out.println("Name :"+name+"-Manager ");
	}
	void printAge()
	{
		System.out.println("Age :"+age);
	}
	void printPhone()
	{
		System.out.print("Phone :");
		for(int i=0;i<10;i++)
		{	
			System.out.print(ph[i]);
		}
		System.out.println("");	
	}
	void printAddress()
	{
		System.out.println("Address :"+address);
	}
	void printSalary()
	{
		System.out.println("Salary :"+salary);
	}
}
class abstractass3
{
	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		Officer obj1=new Officer();
		obj1.name="Aiswarya";
		obj1.age=19;
	        obj1.ph=new int[10];
		System.out.println("Enter phone number of Officer");
		for(int i=0;i<10;i++)
		{	
			obj1.ph[i]=S.nextInt();
		}
		obj1.address="Palakkad";
		obj1.salary=90000;
		obj1.printName();
		obj1.printAge();
		obj1.printPhone();
		obj1.printAddress();
		obj1.printSalary();
		Manager obj2=new Manager();
		obj2.name="Aaradhya";
		obj2.age=29;
		obj2.ph=new int[10];
		System.out.println("Enter phone number of Manager");
		for(int i=0;i<10;i++)
		{	
			obj2.ph[i]=S.nextInt();
		}
		obj2.address="Kochi";
		obj2.salary=80000;
		obj2.printName();
		obj2.printAge();
		obj2.printPhone();
		obj2.printAddress();
		obj2.printSalary();
	}
}