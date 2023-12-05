package com.optigove.project.repository;

import com.optigove.project.model.ReferanceBien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReferanceBienRepository extends JpaRepository<ReferanceBien ,Long> {

    Optional<ReferanceBien> getReferanceByArticleAndSecteur(String article, String secteur);
}
