package com.example.PortFolio_Form.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PortFolio_Form.demo.Entity.Feedback;
import com.example.PortFolio_Form.demo.Entity.Repository.FeedbackRepository;

@RestController
@RequestMapping("/api/feedback")

@CrossOrigin(origins ="*")
public class FeedbackController {
	
	@Autowired
	private FeedbackRepository feedbackRepository;

	
	@PostMapping("/submit")
	public Feedback submitFeedback(@RequestBody Feedback feedback) { return feedbackRepository.save(feedback);
	
}
}
