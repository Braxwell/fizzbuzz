package fr.unilim.iut.FizzBuzz;

public class RegleBuzz {
	
	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % 5;
	}

	public String valeurAAfficherSiRegleVerifiee() {
		return "buzz";
	}

}
