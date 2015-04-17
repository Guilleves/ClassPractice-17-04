import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, surname;
		int id;
		Person[] people = new Person[5];		
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<5; i++)
			//runs 5 times the program
		{	
			System.out.println("Enter the person's name, surname and ID");
			name = s.nextLine();
			surname = s.nextLine();
			id =  Integer.parseInt(s.nextLine());
						
			System.out.println("Select person type: \n<C> for Client \n<E> for Employee");
			String choice = s.nextLine();
			
		
			if (choice.equalsIgnoreCase("c")){
				people[i] = addClient(name, surname, id);
			}
			
			else if (choice.equalsIgnoreCase("e")){
				people[i] = addEmployee(name, surname, id);
			}
		}
		
		for(int i=0; i<4; i++){
			//orders by DNI
			//NO PERDER
			for(int j=1; j<5; j++){
				if (people[i].dni > people[j].dni){
					int aux;
					
					aux = people[i].dni;
					people[i].dni = people[j].dni;
					people[j].dni = aux;
				}
					
			}
		}
		
		for(int i = 0; i<5; i++){
			System.out.println(people[i].descGral());
		}
		
	}
	
	public static Client addClient(String name, String surname, int id){
		//Instances a Client, given its name, surname and ID, and adding Cuit and Address as local variables
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the client's CUIT and address");
		int cuit =  Integer.parseInt(s.nextLine());
		String address = s.nextLine();
		Client c = new Client(name, surname, id, cuit, address);
		
		return c;
	}
	
	public static Employee addEmployee(String name, String surname, int id){
		//Instances an Employee, given its name, surname and ID, and adding legajo and position as local variables
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the employee's legajo and position");
		int legajo =  Integer.parseInt(s.nextLine());
		String position = s.nextLine();
		Employee e = new Employee(name, surname, id, legajo, position);
		
		return e;
	}

}
