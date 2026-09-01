package test;
import negocio.PersonalFestivalABM;
public class TestTraerCajerosPorRecaudacion {

	public static void main(String[] args) {
		double recaudacionTotalA= 0;
		double recaudacionTotalB= 15000;
		System.out.printf("CAJEROS CON RECAUDACION TOTAL ENTRE %.2f Y %.2f:\n %s", recaudacionTotalA, recaudacionTotalB, PersonalFestivalABM
				.getInstance().traerCajerosPorRecaudacionTotalEntre(recaudacionTotalA,recaudacionTotalB));
	}
}
