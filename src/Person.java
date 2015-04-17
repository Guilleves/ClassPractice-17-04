public class Person {

	int dni;
	String nombre, apellido;
	
	public Person(String nombre, String apellido, int dni){
		//Explicit constructor for Person
		setNombre(nombre);
		setApellido(apellido);
		setDni(dni);
	}
	
	public String descGral(){
		//returns an array with all data
		//if uses this, can't be static
		return "Name: "+this.nombre+" Surname: "+this.apellido+" ID: "+this.dni;
		
	}
	
	
	//setters and getters	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//public static String descGral{
	//Returns String with all data
		
	//}
}
