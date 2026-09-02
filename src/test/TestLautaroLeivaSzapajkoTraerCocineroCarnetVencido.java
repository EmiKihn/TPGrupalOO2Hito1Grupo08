package test;
import negocio.PersonalFestivalABM;
import java.time.LocalDate;

public class TestLautaroLeivaSzapajkoTraerCocineroCarnetVencido {
	public static void main(String[] args) {
		LocalDate fecha= LocalDate.of(2026, 03, 01);
		System.out.printf("COCINEROS CON CARNET A VENCER: \n %s",PersonalFestivalABM.getInstance().traerCocinerosCarnetVencido(fecha));
	}

}
