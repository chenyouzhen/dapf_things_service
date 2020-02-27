package com.siemens.ct.sz.dd.thingsservice.repository;

import com.siemens.ct.sz.dd.thingsservice.domain.AssemblyLine;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the AssemblyLine entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AssemblyLineRepository extends JpaRepository<AssemblyLine, Long> {

}
