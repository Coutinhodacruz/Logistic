package Data.repositories;

import Data.model.Package;
import Data.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserImply implements UserRepository {

    private int lastIdCreated;

    private List<User> userList = new ArrayList<>();


    @Override
    public User save(User user) {
        boolean isSaved = user.getId() != 0;
        if (isSaved)
            update(user);
        else {
            saveNewUser(user);
        }
        return user;
    }


    private void update(User user) {

        User savedUser = findById(user.getId());
        userList.remove(savedUser);
        userList.add(user);


    }

    private void saveNewUser(User user) {
        userList.add(user);
        user.setId(generatePackageId());
        lastIdCreated++;
    }

    private int generatePackageId() {
        return lastIdCreated + 1;
    }

    @Override
    public long lastIdCreated() {
        return userList.size();
    }

    @Override
    public void deleteAll() {

    }

    public void delete(User user) {
        userList.remove(user);

    }

    public void delete(int id) {
        User foundUser = findById(id);
        delete(foundUser);

    }

    public List<User> findAll() {
        return userList;
    }

    public User findById(int id) {
        for (User user : userList) if (user.getId() == id) return user;


        return null;
    }

}