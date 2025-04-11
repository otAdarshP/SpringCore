package DataProvider.IoC;

public class UserManager {
    private UserDataProvider userDataProvider;


//    defining the values of the userDataProvider
    public UserManager (UserDataProvider userDataProvider){
        this.userDataProvider = userDataProvider;
    }


//    calling values from the classes which are implementing the UserDataProvider
    public String getUserDetails(){
        return userDataProvider.getUserDetails();
    }

}
