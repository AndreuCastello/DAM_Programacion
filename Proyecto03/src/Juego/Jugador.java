package Juego;

public class Jugador {
	private String nombre;
	private String apellidos;
	private String PrimerApellido;
	private String SegundoApellido;
	private int Edad;
	private int puntos;
	private int id;
	
	//private del Jugador
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public int getEdad() {
		return Edad;
	}
	
	public void setEdad(int Edad) {
		this.Edad = Edad;
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public String getPrimerApellido() {
		return PrimerApellido;
	}
	
	public void setPrimerApellido(String PrimerApellido) {
		this.PrimerApellido = PrimerApellido;
	}
	
	public String getSegundoApellido() {
		return SegundoApellido;
	}
	
	public void setSegundoApellido(String SegundoApellido) {
		this.SegundoApellido = SegundoApellido;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Jugador() {
		
	}
	
	//Metodo para comprobar si una cadena es un numero
	//Devuelve True si es un numero
	public boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
		
	}
	
	//Metodo para comprobar si una cadena es un conjunto de espacio.
	public boolean sonEspacios(String cad)
	{
	for(int i =0; i<cad.length(); i++)
	if(cad.charAt(i) != ' ')
	return false;
	
	return true;
	}
	
	public String toString() {
		return this.nombre+" "+this.PrimerApellido+" "+this.SegundoApellido+" de "+this.Edad+" años";
	}

	
}
