package fr.unilim.iut.FizzBuzz;

public class FizzBuzz {

	public String donnerLaReponsePour(Integer nombre) {
		
		RegleFizzBuzz regleFizzBuzz = new RegleFizzBuzz();
		RegleBuzz regleBuzz = new RegleBuzz();
		
		if (regleFizzBuzz.estVerifieePar(nombre))
			return regleFizzBuzz.valeurAAfficherSiRegleVerifiee();

		if (regleBuzz.estVerifieePar(nombre))
			return regleBuzz.valeurAAfficherSiRegleVerifiee();

		if (isFizz(nombre))
			return "fizz";

		return String.valueOf(nombre);
	}


	private boolean isFizz(Integer nombre) {
		return 0 == nombre % 3;
	}

}