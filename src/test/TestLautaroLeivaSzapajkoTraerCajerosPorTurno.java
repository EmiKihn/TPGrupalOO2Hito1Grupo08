package test;
import negocio.PersonalFestivalABM;
public class TestLautaroLeivaSzapajkoTraerCajerosPorTurno {

	public static void main(String[] args) {
String turnoMañana="mañana";
		String turnoNoche="noche";
		System.out.printf("CAJEROS POR TURNO %s: %s \n", turnoMañana, PersonalFestivalABM
		.getInstance().traerCajerosPorTurno(turnoMañana));
		System.out.printf("CAJEROS POR TURNO %s: %s \n", turnoNoche, PersonalFestivalABM
		.getInstance().traerCajerosPorTurno(turnoNoche));
	}
}
