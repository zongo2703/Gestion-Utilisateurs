package dao;

import java.util.ArrayList;

import beans.InvalidDataException;
import beans.User;

public class UserDao {
    private static final ArrayList<User> users = new ArrayList<User>();
    public static int lastId =0;
    
    public static boolean addUser(User user) {
    	user.setId(++lastId);
    	users.add(user);
    	return true;
    }
    
    public static ArrayList<User> listUser() {
    	return users;
    }
    
   /* static {
    	try {
    	users.add(new User("awa","awa","awa","yero"));
    	users.add(new User("tall","yero","yerotall","awa"));
    	} catch(Exception e) {
    		
    	}
    } */
    
    public static boolean delete(int id) {
    	for( User user : users) {
    		if(user.getId() == id) {
    			users.remove(id);
    			return true;
    		}
    	}
    	return false;
    }
    
    public static boolean update (User usr) {
    	for( User user : users) {
    		if(user.getId() == usr.getId()) {
    			user.setNom(usr.getNom());
    			user.setPrenom(usr.getPrenom());
    			user.setLogin(usr.getLogin());
    			user.setPassword(usr.getPassword());
        		return true;
    		}
    	}
    	return false;
    }
    
    public static User getUser(int id) throws InvalidDataException {
    	for( User user : users) {
    		if(user.getId() == id) {
    			return user;
    		}
    	}
    	return null;
    }
}
