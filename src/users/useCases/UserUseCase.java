package users.useCases;

import users.models.User;
import java.util.List;
import java.util.ArrayList;

public class UserUseCase{

    // Atributes
    public List<User> users; // Declare

    // Constructor
    public UserUseCase(){
        this.users = new ArrayList<User>(); // Inicialized
    }

    // Methods
    public boolean signIn(String email, String password){
        User user = new User(email, password);

        for(User u : this.users){
            if(u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword())){
                return true;
            }
        }

        return false;
    }
}