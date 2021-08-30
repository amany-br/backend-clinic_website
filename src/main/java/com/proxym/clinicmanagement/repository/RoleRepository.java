package com.proxym.clinicmanagement.repository;

import com.proxym.clinicmanagement.model.Role;
import com.proxym.clinicmanagement.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}