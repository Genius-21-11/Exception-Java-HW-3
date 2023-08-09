package controller;

import moduls.NoFolder;
import moduls.User;

public interface SaveUser {
    String saveUser(User user) throws NoFolder;
}