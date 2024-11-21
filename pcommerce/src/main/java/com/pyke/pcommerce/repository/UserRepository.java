package com.pyke.pcommerce.repository;

import com.pyke.pcommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Find user by username (this will be used for login and registration)
    Optional<User> findByUsername(String username);
}

//Step 2: Create the User Repository
//The User Repository is where we interact with the database for user-related operations. We use Spring Data JPA for this, which provides us with convenient methods like save, findById, findByUsername, etc., without having to write SQL queries manually.
//
//2.1. Create the Repository Interface
//In the src/main/java/com/yourdomain/projectname/ folder, create a folder called repository if it doesn’t already exist.
//
//        Then, inside the repository folder, create a file named UserRepository.java.

//Explanation:
//JpaRepository<User, Long>: This extends the JpaRepository interface, which gives you various methods like save, findById, and more, already implemented for you. It also allows custom queries.
//findByUsername(String username): This is a custom method we define that will allow us to query the database and find a user by their username. The Optional<User> return type helps handle cases where a user is not found.
//        2.2. What Happens Next?
//UserRepository will be used in our service and controller layers to fetch user data from the database (like checking if a username exists during registration or login).
//Spring Data JPA will automatically generate the necessary SQL queries to interact with the database based on the method names in the repository (like findByUsername).
//Next Step:
//Now that we have the UserRepository, let's move on to creating the User Registration functionality, which will use the repository to store user data in the database.