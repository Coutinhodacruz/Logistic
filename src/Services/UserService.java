package Services;

import Data.model.User;
import Dto.request.RegisterUserRequest;

public interface UserService {
    User registerNewUser(RegisterUserRequest request);

    User findUser(int id);
}
