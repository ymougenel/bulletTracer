package services.impl;

import daos.MissionDAO;
import models.Mission;
import services.MissionServiceI;

import javax.inject.Inject;

/**
 * Created by yann on 13/04/17.
 */
public class MissionService implements MissionServiceI {

  @Inject
  private MissionDAO MissionDAO;

  @Override
  public Mission find(Long id) {
    return MissionDAO.find(id);
  }

  @Override
  public void update(Mission Mission) {
    MissionDAO.update(Mission);
  }

  @Override
  public boolean delete(Mission Mission) {
    return MissionDAO.delete(Mission);
  }
}
