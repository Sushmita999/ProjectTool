package com.bottomline.projecttool.repo;

import com.bottomline.projecttool.model.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}
