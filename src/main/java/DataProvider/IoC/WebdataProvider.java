package DataProvider.IoC;

public class WebdataProvider implements UserDataProvider{

    @Override
    public String getUserDetails(){
        return "Fetching details from the webdata.";
    }

}
