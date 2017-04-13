package daos;

import models.Project;

/**
 * Created by yann on 13/04/17.
 */
public class ProjectDAO extends GenericDAO<Project> {

  public Project find(Long id) {
    return super.find(id, Project.class);
  }
}
