package com.bughra.java.controller;

import com.bughra.java.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserEntityService userEntityService;

//   1. POST /api/v1/signup: Sign up as an user of the system, using email & password
    @PostMapping("/singup")



//   2. POST /api/v1/signin: Sign in using email & password. The system will return the JWT token that can be used to call the APIs that follow
//   3. PUT /api/v1/changePassword: Change user’s password
//   4. GET /api/v1/todos?status=[status]: Get a list of todo items. Optionally, a status query param can be included to return only items of specific status. If not present, return all items
//   5. POST /api/v1/todos: Create a new todo item
//   6. PUT /api/v1/todos/:id: Update a todo item
//   6. DELETE /api/v1/todos/:id: Delete a todo item



}
