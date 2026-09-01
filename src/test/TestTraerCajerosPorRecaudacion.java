package test;
import negocio.PersonalFestivalABM;
public class TestTraerCajerosPorRecaudacion {

	public static void main(String[] args) {
		double recaudacionTotalA= 0;
		double recaudacionTotalB= 100000;
		String turnoMañana="mañana";
		String turnoNoche="noche";
	
		System.out.printf("CAJEROS CON RECAUDACION TOTAL ENTRE %.2f Y %.2f:\n %s", recaudacionTotalA, recaudacionTotalB, PersonalFestivalABM
				.getInstance().traerCajerosPorRecaudacionTotalEntre(recaudacionTotalA,recaudacionTotalB));
		
		System.out.printf("RECAUDACION TOTAL DEL TURNO %s :%.2f\n", turnoMañana, PersonalFestivalABM
				.getInstance().traerRecaudacionTotalPorTurno(turnoMañana));
		
		System.out.printf("RECAUDACION TOTAL DEL TURNO %s :%.2f\n", turnoNoche, PersonalFestivalABM
				.getInstance().traerRecaudacionTotalPorTurno(turnoNoche));
	
	}

}
