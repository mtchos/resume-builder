package com.matheus.resumebuilder.repository;

import com.matheus.resumebuilder.model.Text;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TextRepository extends JpaRepository<Text, UUID> {

}