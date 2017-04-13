package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

/**
 * Created by yann on 13/04/17.
 */
@Entity
public class Project extends GenericModel {
  public LocalDate start;
  public LocalDate end;
  public String description;

  @ManyToOne
  public Client client;
}
