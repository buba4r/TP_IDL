package controle;

public class DriverVanne {

	protected Simulateur leSimulateur;

	public DriverVanne(Simulateur leSimulateur) {
		this.leSimulateur = leSimulateur;
	}

    public boolean Ouvre() {
        System.out.println(""+this+"Class :DriverVanne "+"NomMethode: Ouvre()");
    	Boolean result  =(leSimulateur.Ouvre()); 
        System.out.println("Driver Ouvre result "+result);
        return  result;
    }
    public boolean Ferme() {
    	System.out.println(""+this+"Class :DriverVanne "+"NomMethode: Ferme()");
    	Boolean result  =(leSimulateur.Ferme()); 
        System.out.println("DriverVane Ferme result "+result);
        return  result;
    }
}
