package services;

import models.Mission;

/**
 * Created by yann on 13/04/17.
 */
public interface MissionServiceI {
  Mission find(Long id);

  void update(Mission Missions);

  boolean delete(Mission Missions);
}
