package Services;

import Data.model.User;
import Dto.request.RegisterUserRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceImplTest {

    private UserService userService;

    @BeforeEach
    public void setUp(){
        userService = new UserServiceImpl();
    }

    @Test
    public void registerUserTest(){
        RegisterUserRequest request = new RegisterUserRequest();
        request.setPhoneNumber("PhoneNumber");
        request.setLastName("lastname");
        request.setFirstName("Firstname");
        request.setEmail("Email");
        request.setAddress("address");

        User user = userService.registerNewUser(request);
        assertEquals(1, user.getId());
        User foundUser = userService.findUser(1);
        assertEquals(user, foundUser);

    }

}