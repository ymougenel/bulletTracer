package models;

import javax.persistence.Entity;

/**
 * Created by yann on 13/04/17.
 */
@Entity
public class Techno extends GenericModel {
  public String name;
  public String version;
}
