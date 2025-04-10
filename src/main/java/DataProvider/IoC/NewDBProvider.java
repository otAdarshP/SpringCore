package DataProvider.IoC;

public class NewDBProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        return "Fetching details from the new Database provider.";
    }
}
