
public class Client extends Person {
	
	int cuit;
	String direccion;
	
	public Client(String nombre, String apellido, int dni, int cuit, String direccion){
		//Explicit constructor for Client; uses super to call Person's constructor
		super(nombre,apellido,dni);
		setCuit(cuit);
		setDireccion(direccion);
	}
	
	public String descGral(){
		return super.descGral()+" CUIT: "+this.cuit +" Address: "+this.direccion;
	}
	
	//setters and getters
	public int getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	
}
