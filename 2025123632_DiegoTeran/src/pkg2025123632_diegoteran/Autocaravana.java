package pkg2025123632_diegoteran;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author teran
 */
public class Autocaravana {
    private String matricula;
    private Utente condutor;
    protected final double DIARIA = 5.0;

    public Autocaravana(String matricula, Utente condutor) {
        this.matricula = matricula;
        this.condutor = condutor;
    }

    public Autocaravana() {
        this.matricula = "AA-00-AA";
        this.condutor = new Utente();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Utente getCondutor() {
        return condutor;
    }

    public void setCondutor(Utente condutor) {
        this.condutor = condutor;
    }

    public double getDIARIA() {
        return DIARIA;
    }
}
