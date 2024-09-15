package password;

public class Principal {

	// Ejemplo de uso: genera 5 contraseñas de longitud 9
	public static void main(String[] args) {
		
		int cantidadPaswords = 5, longitudPassword = 9;
		
		new PasswordGenerator(cantidadPaswords, longitudPassword);
		
	}
	
}
