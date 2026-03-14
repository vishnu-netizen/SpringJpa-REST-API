package com.telusk.spring_boot_rest;

import com.telusk.spring_boot_rest.model.JobPost;
import com.telusk.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin( origins="http://localhost:3000")
public class Jobpostrestcontroller {
    @Autowired
    private JobService jobService;
    @GetMapping("jobposts")

    @CrossOrigin( origins="http://localhost:3000")
    public List<JobPost> getalljobs(){
        return jobService.returnAllJobPosts();
    }
    /*@GetMapping("jobposts/{postid}")
    public JobPost getjob(@PathVariable("postid")int postid){
        return jobService.getjob(postid);
    }*/
    @GetMapping("jobposts/keyword/{keyword}")
    @CrossOrigin( origins="http://localhost:3000")
    public List<JobPost> searchbykeyword(@PathVariable String keyword){
        return jobService.searchbykeyword(keyword);
    }

    @PostMapping("jobposts")
    @CrossOrigin( origins="http://localhost:3000")
    public void addJobPost(@RequestBody JobPost jobpost){
        jobService.addJobPost(jobpost);

    }
    @PutMapping("jobposts")
    @CrossOrigin( origins="http://localhost:3000")
    public JobPost updatejobpost(@RequestBody JobPost jobPost){
        jobService.updatejobpost(jobPost);
        return jobService.getjob(jobPost.getPostId());
    }

    @DeleteMapping("jobposts/{postid}")
    @CrossOrigin( origins="http://localhost:3000")
    public String deletejobpost(@PathVariable int postid){
        jobService.deletejobpost(postid);
        return "DELETED";
    }
    @GetMapping("load")
    @CrossOrigin( origins="http://localhost:3000")
    public String createallpost(){
        jobService.createallpost();
        return "SUCCESS";
    }


}
