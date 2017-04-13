package services.impl;

import daos.ProjectDAO;
import models.Project;
import services.ProjectServiceI;

import javax.inject.Inject;

/**
 * Created by yann on 13/04/17.
 */
public class ProjectService implements ProjectServiceI {
  @Inject
  private ProjectDAO projectDAO;

  @Override
  public Project find(Long id) {
    return projectDAO.find(id);
  }

  @Override
  public void update(Project Project) {
    projectDAO.update(Project);
  }

  @Override
  public boolean delete(Project Project) {
    return projectDAO.delete(Project);
  }

}
