package com.example.tp_resto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomReservation;
    private Date dateResa;
    private boolean statut;
    private int table;
    private int nbPersonne;


    public Reservation() {
    }

    public Reservation(String nomReservation, Date date, boolean statut, int table, int personne) {
        this.nomReservation = nomReservation;
        this.dateResa = date;
        this.statut = statut;
        this.table = table;
        this.nbPersonne = personne;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomReservation() {
        return nomReservation;
    }

    public void setNomReservation(String nomReservation) {
        this.nomReservation = nomReservation;
    }

    public Date getDateResa() {
        return dateResa;
    }

    public void setDateResa(Date dateResa) {
        this.dateResa = dateResa;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    public int getNbPersonne() {
        return nbPersonne;
    }

    public void setNbPersonne(int personne) {
        this.nbPersonne = personne;
    }
}
