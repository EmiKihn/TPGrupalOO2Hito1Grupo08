package test;
import negocio.PersonalFestivalABM;
public class TestTraerRepresentantePorUnidad {

	public static void main(String[] args) {
		long idUnidad=1;
		System.out.printf("REPRESENTANTE DE LA UNIDAD NUMERO %d: %s", idUnidad, PersonalFestivalABM
				.getInstance().traerRepresentantePorUnidad(idUnidad));
	}

}
