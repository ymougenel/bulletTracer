package services;

import models.Techno;

/**
 * Created by yann on 13/04/17.
 */
public interface TechnoServiceI {

  Techno find(Long id);

  void update(Techno Technos);

  boolean delete(Techno Technos);
}
