import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome e cognome: ");
        String nomeCognome = scn.nextLine();

        System.out.print("Inserisci anche la tua età: ");
        int eta = scn.nextInt();

        System.out.print("Quanti bagagli vuoi portare con te? ");
        int numBagagli = scn.nextInt();

        System.out.print("Prego scrivi se è un viaggio di sola andata quindi inserisci (A) o se è un viaggio di andata e ritorno quindi inerisci (AR)");
        String tipoViaggio = scn.next();


        double prezzoIniziale = 100.0;
        double sconto= 0.0;
        
        if (eta < 18) {
            sconto = prezzoIniziale * 0.5; 
        } else if (eta >= 70) {
            sconto = prezzoIniziale * 0.25; 
        }
        
     
        double costoBagagli = numBagagli * 20.0;

        
        double prezzoTotale = prezzoIniziale + costoBagagli - sconto;
        
        if(tipoViaggio.equalsIgnoreCase("AR")) {
        	prezzoTotale = prezzoIniziale + costoBagagli - sconto;
            prezzoTotale *= 2;
            
            if(numBagagli >= 3) {
            	costoBagagli-= numBagagli * 15;
            	
            	
            } else {
            	prezzoTotale = prezzoIniziale + costoBagagli - sconto;
            }
        	
        	
        }
        
        
        System.out.println("Nome e Cognome utente: " + nomeCognome);
        System.out.println("Età utente: " + eta);
        System.out.println("Numero di bagagli: " + numBagagli);
        System.out.println("Tipo di viaggio: " );
        System.out.println("Costo totale del biglietto: " + prezzoTotale + " euro");
        
        
        
        

    }
}