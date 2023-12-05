package com.optigove.project.repository;

import com.optigove.project.model.Immeuble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImmeubleRepository extends JpaRepository<Immeuble,Long> {
}
