/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
import controle.*;

/**
 *
 * @author elmoutaki
 */
public class TestReg   {
    
    public static void main(String ...args){
    // Trace Diagramme de séquence Contrôle vanne : 
    // test Fermeture 
    Simulateur simulateur = new Simulateur();
    RegulateurChauffage rc = new RegulateurChauffage(simulateur);
    rc.ControleVanne();
    
    // Test Ouvre 
    System.out.println("**** Test Ouvrir le vanne  : **** ");
    simulateur.NouvelleTemperature(0);
    rc.ControleVanne();
    
    
   // Mise A jour Consigne Regulatteur Chauffage 
   
    System.out.println("Mise A jour Consigne : ");
    
    
    }
    
}
