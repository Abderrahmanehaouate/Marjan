package com.youcode.marjan.Repositories;

import com.youcode.marjan.Models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    boolean findByUsername(String username);
}
