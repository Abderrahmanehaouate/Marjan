package com.youcode.marjan.Repositories;

import com.youcode.marjan.Models.GeneralAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralAdminRepository extends JpaRepository<GeneralAdmin, Long> {

}
