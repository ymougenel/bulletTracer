package services;

import models.Project;

/**
 * Created by yann on 13/04/17.
 */
public interface ProjectServiceI {

    Project find(Long id);

    void update(Project Projects);

    boolean delete(Project Projects);

}
