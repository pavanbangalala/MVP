package holyape.com.mvpdemo;

/**
 * Created by Pavan Bangalala on 06/01/17.
 */

public class LoginPresenter implements ILoginPresenter {

    private IMainActivity mainActivity;
    private ILoginModel loginModel;

    public LoginPresenter(IMainActivity view){
        this.mainActivity = view;
        loginModel = new LoginModel();
    }

    @Override
    public void attempLogin(String name, String password) {
        boolean isSuccess = loginModel.validateCredentials(name,password);
        if(isSuccess){
            mainActivity.loginSuccess();
        }
        else{
            mainActivity.loginFailed();
        }
    }
}
