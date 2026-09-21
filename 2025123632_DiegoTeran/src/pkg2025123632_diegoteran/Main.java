/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2025123632_diegoteran;

/**
 *
 * @author teran
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("\n2025123632 nivel 1 - Classes e Objetos.");

        Utente utente1 = new Utente();
        Utente utente2 = new Utente("Maria");
        
        System.out.println("Utente " + utente1);
        System.out.println("Utente " + utente2);
        
        System.out.println("Nome do utente1 : "+utente1.getNome() );
        System.out.println("Numero do utente1 : "+utente1.getNumero() );
        System.out.println("Diaria do utente1 : "+utente1.getDIARIA() +"\n\n");

        System.out.println("Nome do utente2 : "+utente2.getNome() );
        System.out.println("Numero do utente2 : "+utente2.getNumero() );
        System.out.println("Diaria do utente2 : "+utente2.getDIARIA() );

    }
    
    
    
}
