package main;

public class Usuario {

	public String username;
	
	public Usuario(String username){
		this.username = username;
		} 
	
	/*
	private String password;
	
	void saluda() {
		System.out.println("Hola, mi username es " + this.username);
	}
	
	// se puede obtener Setter y Getter del menú > source > generate setter n getter
	//Getter
	public String getPassword() {
		return this.password;
	}
	
	//Setter
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Constructor
	public Usuario(){
		this.username = "";
		this.password = "";
		}
	
	public Usuario(String username){
		this.username = username;
		this.password = "";
		}

	public Usuario(String username, String password){
		this.username = username;
		this.password = password;
		}

	Usuario usuario1 = new Usuario();
	Usuario usuario2 = new Usuario("Usuario2");
	Usuario usuario3 = new Usuario("Usuario3", "Password");
	*/
	
	
	public void establecerRol() {
		Administrador admin = new Administrador();
		admin.trabajar();
	}
	
	
	public class Administrador {
		public void trabajar() {
			System.out.println("El administrador " + username + " se encuentra trabajando");
		}
	}
	
	
	
	
	
}
