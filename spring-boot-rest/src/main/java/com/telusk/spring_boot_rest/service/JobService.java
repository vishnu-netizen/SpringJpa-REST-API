package com.telusk.spring_boot_rest.service;

import com.telusk.spring_boot_rest.model.JobPost;
import com.telusk.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {


	@Autowired
	public JobRepo repo;
	
	
	
	//method to return all JobPosts
	public List<JobPost> returnAllJobPosts() {
		return repo.findAll();

		
	}
	
	
	
	

	// ***************************************************************************


	
	
	
	// method to add a jobPost
	public void addJobPost(JobPost jobPost) {
		 repo.save(jobPost);
	
	}


	public JobPost getjob(int postid) {
		return repo.findById(postid).orElse(new JobPost());
	}

	public void updatejobpost(JobPost jobPost) {
		repo.save(jobPost);
	}

	public void deletejobpost(int postid) {
		repo.deleteById(postid);
	}

	public void createallpost() {
		List<JobPost> jobs =
				new ArrayList<>(List.of(
						new JobPost(1, "Software Engineer", "Exciting opportunity for a skilled software engineer.", 3, List.of("Java", "Spring", "SQL")),
						new JobPost(2, "Data Scientist", "Join our data science team and work on cutting-edge projects.", 5, List.of("Python", "Machine Learning", "TensorFlow")),
						new JobPost(3, "Frontend Developer", "Create amazing user interfaces with our talented frontend team.", 2, List.of("JavaScript", "React", "CSS")),
						new JobPost(4, "Network Engineer", "Design and maintain our robust network infrastructure.", 4, List.of("Cisco", "Routing", "Firewalls")),
						new JobPost(5, "UX Designer", "Shape the user experience with your creative design skills.", 3, List.of("UI/UX Design", "Adobe XD", "Prototyping"))

				));
		repo.saveAll(jobs);

	// ****************************************************************************

	// constructor->injecting objects into ArrayList defined above.


		// Java Developer Job Post

	}

	public List<JobPost> searchbykeyword(String keyword) {
		return repo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
	}
}
