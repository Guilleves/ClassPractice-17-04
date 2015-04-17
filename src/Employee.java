
public class Employee extends Person {

	String puesto;
	int legajo;
	
	public Employee(String nombre, String apellido, int dni, int legajo, String puesto){
		//Explicit constructor for Employee; uses super to call Person's constructor
		super(nombre,apellido,dni);
		setLegajo(legajo);
		setPuesto(puesto);
	}
	
	public String descGral(){
		return super.descGral()+" Legajo: "+this.legajo +" Position: "+this.puesto;
	}
	
	//setters and getters
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	
}
