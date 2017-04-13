package services.impl;

import daos.TechnoDAO;
import models.Techno;
import services.TechnoServiceI;

import javax.inject.Inject;

/**
 * Created by yann on 13/04/17.
 */
public class TechnosService implements TechnoServiceI {

  @Inject
  private TechnoDAO TechnosDAO;

  @Override
  public Techno find(Long id) {
    return TechnosDAO.find(id);
  }

  @Override
  public void update(Techno Technos) {
    TechnosDAO.update(Technos);
  }

  @Override
  public boolean delete(Techno Technos) {
    return TechnosDAO.delete(Technos);
  }
}
