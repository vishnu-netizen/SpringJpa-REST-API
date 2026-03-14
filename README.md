# Job Post Management REST API

A simple backend application built using Spring Boot that demonstrates the use of Java Persistence API (JPA) to interact with a database and expose RESTful APIs.

This project allows users to perform CRUD operations on job postings, such as creating, retrieving, updating, deleting, and searching job posts. The APIs are tested using Postman.

# Features

Retrieve all job posts

Search job posts using a keyword

Add a new job post

Update existing job post details

Delete a job post

Load sample job posts into the database

RESTful API architecture for easy integration with frontend applications

# Tech Stack

Backend Framework: Spring Boot

ORM Framework: Java Persistence API (JPA)

Language: Java

API Testing Tool: Postman

Build Tool: Maven

# Project Structure
src/main/java
 ├── controller      # REST API controllers
 ├── service         # Business logic layer
 ├── repository      # JPA repositories
 └── model           # Entity classes

# API Endpoints
Method	Endpoint	Description
GET	/jobposts	Retrieve all job posts
GET	/jobposts/keyword/{keyword}	Search job posts by keyword
POST	/jobposts	Add a new job post
PUT	/jobposts	Update an existing job post
DELETE	/jobposts/{postid}	Delete a job post
GET	/load	Load sample job posts
# Example API Request

POST /jobposts

Request Body (JSON):

{
  "postId": 1,
  "profile": "Java Developer",
  "description": "Looking for experienced Java developer",
  "experience": 3
}

# How to Run the Project

Clone the repository

git clone https://github.com/your-username/jobpost-rest-api.git


Navigate to the project directory

cd jobpost-rest-api


Configure your database in application.properties.

Run the application

mvn spring-boot:run

API Testing

All APIs can be tested using Postman by sending HTTP requests to the exposed endpoints.

# Future Improvements

Add a frontend using React

Implement authentication and authorization

Add pagination and filtering for job posts

Improve validation and exception handling
