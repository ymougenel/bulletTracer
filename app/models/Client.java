package models;

import javax.persistence.Entity;

/**
 * Created by yann on 13/04/17.
 */
@Entity
public class Client extends GenericModel{
  public String nom;
  public String adresses;
  public String email;
  public int tel;
}
