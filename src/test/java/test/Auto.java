package test;

public class Auto {
	String modelo;
	int precio;
	Asiento [] asientos;
	String marca;
	Motor motor;
	int registro;
	public static int cantidadCreados;

public int cantidadAsientos() {
	int c = 0;
    for (Asiento asiento : asientos) {
        if (asiento != null) {
            c++;
        }
    }
    return c;
}

public String verificarIntegridad() {
	int registroAuto = this.registro;
    int registroMotor = this.motor.registro;
    boolean asientosOriginales = true;

    for (Asiento asiento : asientos) {
        if (asiento != null && asiento.registro != registroAuto) {
            asientosOriginales = false;
            break;
        }
    }

    if (registroAuto == registroMotor && asientosOriginales) {
        return "Auto original";
    } else {
        return "Las piezas no son originales";
    }
	
}
}	

