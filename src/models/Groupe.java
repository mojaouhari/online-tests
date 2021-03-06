package models;

import java.io.Serializable;
import java.util.ArrayList;

public class Groupe implements Serializable {
    private int id;
    private String nom;
    private ArrayList<Etudiant> etudiants = new ArrayList<>();

    public Groupe(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Groupe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    @Override
    public String toString() {
        return nom;
    }
}
