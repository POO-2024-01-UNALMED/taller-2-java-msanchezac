package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
 void cambiarRegistro (int nuevoRegistro) {
	 this.registro = nuevoRegistro;
 }
 
void asignarTipo (String nuevoTipo) {
	if (nuevoTipo == "electrico") {this.tipo=nuevoTipo;}
	if (nuevoTipo == "gasolina") {this.tipo=nuevoTipo;}
}
}
