package daos;

import models.Mission;

/**
 * Created by yann on 13/04/17.
 */
public class MissionDAO extends GenericDAO<Mission> {

  public Mission find(Long id) {
    return super.find(id, Mission.class);
  }
}
