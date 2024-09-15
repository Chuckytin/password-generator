package password;

/**
 * Clase que genera un conjunto de contraseñas aleatorias
 * Las contraseñas pueden tener dígitos, letras mayúsculas y minúsculas
 */
public class PasswordGenerator {

	private String [] passArray;

	/**
     * Constructor que genera un conjunto de contraseñas.
     * 
     * @param numDePass El número de contraseñas a generar.
     * @param longitudPass La longitud de cada contraseña.
     */
	public PasswordGenerator (int numDePass, int longitudPass) {

		passArray = new String[numDePass];

		generarPass(longitudPass);

		mostrarPass();

	}

	/**
     * Genera las contraseñas aleatorias y las almacena en el array arrayPass.
     * 
     * @param longitudPass La longitud de cada contraseña generada.
     */
	private void generarPass(int longitudPass) {

		for (int i = 0; i < passArray.length; i++) {

			String passActual = "";

			for (int j = 0; j < longitudPass; j++) {

				passActual += generarChar();

			}
			
			passArray[i] = passActual;

		}

	}

	/**
     * Genera un carácter aleatorio que puede ser un dígito, una letra mayúscula o una letra minúscula.
     * 
     * @return Un carácter aleatorio.
     */
	private char generarChar() {
		
        int numRandom = (int) (Math.random() * 3); // de 0 a 2

        switch (numRandom) {
        
            case 0:
            	
                return (char) (Math.random() * 10 + '0');  //carácteres '0'-'9'
                
            case 1:
            	
                return (char) (Math.random() * 26 + 'A');  //carácteres 'A'-'Z'
                
            case 2:
            	
                return (char) (Math.random() * 26 + 'a');  //carácteres 'a'-'z'
                
            default:
            	
                throw new IllegalArgumentException("Unexpected value: " + numRandom);
                
        }
        
    }
	
	/**
     * Muestra las contraseñas generadas en la consola.
     */
	private void mostrarPass() {
		
		for (int i = 0; i < passArray.length; i++) {
			
			System.out.println("Contraseña " + (i+1) + ": " + passArray[i]);
			
		}
		
	}

}
