class Employee
{

String name,address,mobile;
int age;
double salary;


void showEmpInfo()
{
System.out.println(name);
System.out.println(address);
System.out.println(mobile);
System.out.println(age);
System.out.println(salary);
}


void doWork()
{
System.out.println("do workk...");
}


void eat()
{
System.out.println("eat...");
}


public static void main(String[] args)
{

Employee e=new Employee();
System.out.println(e);
e.eat();
e.doWork();
e.showEmpInfo();
e.name="ram";
e.address="ramjava";
e.showEmpInfo();


}



}