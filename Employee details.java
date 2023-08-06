       class Employee {
	    String name;
	    int year;
	    String address;
	    
	    Employee(String name,int year,String address){
	        this.name = name;
	        this.year = year;
	        this.address = address;
	    }
	      
    public class Mainclass{
         public static void main(String[] args){
             
            System.out.println(" EMPLOYEE DETAILS \n");
            Employee e = new Employee("Robert",1994,"64C-WallsStreet");
            System.out.print("Name : "+e.name+ "\n");
            System.out.print("Year of joining : "+e.year+ "\n");
            System.out.print("Address : "+e.address+ "\n");
            
            Employee f = new Employee("Sam",2000,"68D-WallsStreet");
            System.out.print("Name : "+f.name+ "\n");
            System.out.print("Year of joining : "+f.year+ "\n");
            System.out.print("Address : "+f.address+ "\n");
            
            Employee g = new Employee("John",1999,"26B-WallsStreet");
            System.out.print("Name : "+g.name+ "\n");
            System.out.print("Year of joining : "+g.year+ "\n");
            System.out.print("Address : "+g.address+ "\n");
        }
    }   
}
