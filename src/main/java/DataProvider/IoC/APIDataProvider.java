package DataProvider.IoC;

public class APIDataProvider implements UserDataProvider{

    @Override
    public String getUserDetails(){
        return "Fetching data from APIs";
    }


}
