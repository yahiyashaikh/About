package com.example.PortFolio_Form.demo.Entity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PortFolio_Form.demo.Entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
	
}
