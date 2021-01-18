package com.jakubzegar.pracadyplomowaserwer.domain.repository;

import com.jakubzegar.pracadyplomowaserwer.domain.entity.Role;
import com.jakubzegar.pracadyplomowaserwer.domain.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}