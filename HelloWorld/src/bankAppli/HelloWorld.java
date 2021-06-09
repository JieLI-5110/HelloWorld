

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		Compte myCompte = new Compte (0);
		myCompte.depotDe(100);
		myCompte.retraitDe(20);
		System.out.println("The solde is " + myCompte.getSolde());
	}

}
