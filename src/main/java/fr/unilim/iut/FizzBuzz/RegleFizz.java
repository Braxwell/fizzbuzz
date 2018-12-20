package fr.unilim.iut.FizzBuzz;

public class RegleFizz {
	
	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % 3;
	}

	public String valeurAAfficherSiRegleVerifiee() {
		return "fizz";
	}

}