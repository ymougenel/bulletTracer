package models;

import javax.persistence.Entity;

@Entity
public class Consultant extends GenericModel {


  public String nom = "Bobby";
  public String prenom = "Fischer";
  public int promo;

}
