/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2025123632_diegoteran;

/**
 *
 * @author teran
 */
public class Utente {
    private int numero;
    private String nome;
    private final double DIARIA =5.0;
    private static int contadorUtente =1;

    public double getDIARIA() {
        return DIARIA;
    }

    public Utente(String nome) {
        this.nome = nome;
        contadorUtente++;
    }


    
    public Utente() {
      this.nome="Diego";
      this.numero=2025123632;
    }
    

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }
    
    @Override
    public String toString(){
        return contadorUtente+"--" + this.nome + " -- \t " + DIARIA + "€ p/dia";
    }
}
