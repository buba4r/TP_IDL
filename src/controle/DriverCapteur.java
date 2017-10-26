package controle;

public class DriverCapteur {
	
	protected Simulateur leSimulateur;

	public DriverCapteur(Simulateur leSimulateur) {
		this.leSimulateur = leSimulateur;
                System.out.println("");
	}
	
    public double LireTemperature() {
        System.out.println("nomObjet "+this+ " Class : DriverCapteur"+" Methode: LireTemperature ()");
    	double result = leSimulateur.LireTemperature();
        System.out.println("LireTemperature DriverCapteur result = "+result);
        return  result;
    }
}
