package controle;

public class RegulateurChauffage {
	
	// consigne de temp�rature � appliquer
	protected double consigne = 0.0;
	// seuil au del� duquel il n'est pas utile de r�guler
	protected double seuil = 0.0;
	// capteur de température
	protected DriverCapteur leCapteur;
	// vanne de chauffage
	protected DriverVanne laVanne;
	
	public RegulateurChauffage(Simulateur unSimulateur) {
		laVanne = new DriverVanne(unSimulateur);
		leCapteur = new DriverCapteur(unSimulateur);
                System.out.println("Création Objet RegulateurChauffage");
	}
	
	public double valeurConsigne() {
		return consigne;
	}
	public void MiseAJourConsigne(double temperature) {
		this.consigne = temperature;
	}
	public double valeurSeuil() {
		return seuil;
	}
	public void MiseAJourSeuil(double ecartTemperature) {
		this.seuil = ecartTemperature;
	}

	public boolean ControleVanne() {
            System.out.println("Name Object: "+this+"Nom Class: Regulateur Chauffage "+" Nom Methode : ControleVanne ()");
		boolean result = true;
		if (leCapteur.LireTemperature() > (consigne+seuil) ) {
			result = laVanne.Ferme();			
		} else if (leCapteur.LireTemperature() < (consigne-seuil) ) {
			result = laVanne.Ouvre();	
		}
            System.out.println("return Controle Vanne : "+result);    
		return result;
	}
}
