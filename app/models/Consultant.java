package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.avaje.ebean.Model;

@Entity
public class Consultant extends Model {
  @Id
  @GeneratedValue
  public Long id;

  public String nom = "Bobby";
  public String prenom = "Fischer";
  public int promo;

}
