package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int contador = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				contador++;
			}
		}
		return contador;
	}
	public String verificarIntegridad() {
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				if (motor.registro != registro || asientos[i].registro != registro) {
					return "Las piezas no son originales";
				}
			}
		}
		return "Auto original";
	}

}
