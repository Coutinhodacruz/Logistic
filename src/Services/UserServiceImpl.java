package Services;

import Data.model.User;
import Data.repositories.UserImply;
import Data.repositories.UserRepository;
import Dto.request.RegisterUserRequest;



public class UserServiceImpl implements UserService {

    UserRepository userRepository = new UserImply();





    public User registerNewUser(RegisterUserRequest request){
        User newUser = new User();
        newUser.setFirstName(request.getFirstName());
        newUser.setLastName(request.getLastName());
        newUser.setEmail(request.getEmail());
        newUser.setPhoneNumber(request.getPhoneNumber());
        newUser.setAddress(request.getAddress());
        return userRepository.save(newUser);

    }

    @Override
    public User findUser(int id) {

        return userRepository.findById(id);
    }

}
