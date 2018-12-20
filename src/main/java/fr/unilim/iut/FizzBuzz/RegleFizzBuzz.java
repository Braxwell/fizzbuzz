package fr.unilim.iut.FizzBuzz;

public class RegleFizzBuzz {

	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % (3 * 5);
	}

	public String valeurAAfficherSiRegleVerifiee() {
		return "fizzbuzz";
	}

}
