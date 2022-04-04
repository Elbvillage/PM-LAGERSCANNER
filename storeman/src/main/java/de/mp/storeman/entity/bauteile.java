package de.mp.storeman.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity


public class bauteile   {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    private int code;
    private String name;
    private String nummer;

   
    private String bemerkungen;
    private int laenge;
    private int breite;
    private int hoehe;
    private String lagerplatz;
    private String packstueck;
    private String aussteller;
    private String lagernotiz;
    private int bauteil_l;
    private int bauteil_b;
    private int bauteil_h;
    private String lagerstatus;
    private int mass_l;
    private int mass_b;
    private String konfektionierung;
    


}
