package users.controllers;

import users.models.User;
import users.useCases.UserUseCase;

public class UserController {

    public UserUseCase useCases; //Declare

    public UserController(){
        this.useCases = new UserUseCase(); // Instance class userUseCase
    }

    public boolean signIn(String email, String password){
        return this.useCases.signIn(email, password); // call method signIn
    }
}