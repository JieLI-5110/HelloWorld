
public class Compte {
 private int solde;

 public Compte (int initial) { 
	 solde = initial;
	 return; 
 }
 
 int retraitDe (int montant) {
    solde -= montant;
    return solde;
 }
 
 int depotDe (int montant) {
	    solde += montant;
	    return solde;
 }
 
 int getSolde() {
	 return solde;
 }
 
}
