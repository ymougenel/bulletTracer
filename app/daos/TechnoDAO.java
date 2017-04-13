package daos;

import models.Techno;

/**
 * Created by yann on 13/04/17.
 */
public class TechnoDAO extends GenericDAO<Techno> {

  public Techno find(Long id) {
    return super.find(id, Techno.class);
  }
}
