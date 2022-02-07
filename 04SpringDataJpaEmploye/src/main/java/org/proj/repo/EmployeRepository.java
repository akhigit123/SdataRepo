package org.proj.repo;

import java.io.Serializable;

import org.proj.entity.EmployeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeRepository  extends JpaRepository<EmployeEntity, Serializable>{

}
