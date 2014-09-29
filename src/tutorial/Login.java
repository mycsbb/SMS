package tutorial;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {
	private String name;
    private String password;
    private String message;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getMessage() {
        return message;
    }

    @Override
    public String execute() {
        if("max".equals(name) &&"Secret".equals(password)) {
            message ="Welcome, "+ name;
        }else{
            message ="Invalid user or password";
        }
        return SUCCESS;
    }

}
