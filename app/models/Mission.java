package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yann on 13/04/17.
 */
@Entity
public class Mission extends GenericModel {

  /* When the mission is supposed to start */
  public LocalDate start;
  /* When the mission is supposed to end */
  @Column(name="DEN")
  public LocalDate den;
  /* When the mission  really starts */
  public LocalDate effectiveStart;
  /* When the mission really ends */
  @Column(name="EFFECTIVE_DEN")
  public LocalDate effectiveEnd;

  @ManyToOne
  public Project project;

  // I think the initialization is required against NPE (TODO: check)
  @ManyToMany
  List<Techno> technos = new ArrayList<>();
  @ManyToOne
  public Consultant consultant;

}
