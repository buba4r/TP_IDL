package controle;

public class Simulateur {
	
	// la temperature au niveau de la sonde
	protected double temperature = 10.0;
	// l'�tat de la vanne de chauffage
	protected boolean etatVanne = false;
	
	public Simulateur() {
	}
	
	public double LireTemperature() {
                System.out.println("nomObjet "+this+ " Class : Simulateur"+" Methode: LireTemperature ()");
                System.out.println("LireTemperature SImulateur result = "+temperature);

		return temperature;
	}
	
	public void NouvelleTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public boolean Ouvre() {
                System.out.println(""+this+"Class :Simulateur "+"NomMethode: Ouvre()");
		if (!etatVanne) {
			System.out.println("ouverture");
		}
		this.etatVanne = true;
                System.out.println(" Simulateur Ouvre result "+this.etatVanne);

		return (this.etatVanne);
	}
	
	public boolean Ferme() {
    	System.out.println(""+this+"Class :Simulateur "+"NomMethode: Ferme()");
		if (etatVanne) {
			System.out.println("fermeture");
		}
		this.etatVanne = false;
                System.out.println("Simulateur Ferme result "+this.etatVanne);
		return (this.etatVanne);
	}
	
	public void changeTemperature() {
		if (etatVanne) {
			temperature++;
		} else {
			temperature--;
		}
	}

}
