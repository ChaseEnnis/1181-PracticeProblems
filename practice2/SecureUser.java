// Chase Ennis
public class SecureUser extends User{

    private int consectutiveFailedAttempts;

    public SecureUser(String username, String password) {
        super(username, password);
        consectutiveFailedAttempts=0;
        //System.out.println("In secure user class!");
    }

    public boolean authenticate(String inputPassword) {
        if (consectutiveFailedAttempts>3){
            System.out.println("Try again later! You have used more than 3 attempts!");
            return false;
        }
            if (super.authenticate(inputPassword)){
                consectutiveFailedAttempts=0;
                return true;

            }
            if (!super.authenticate(inputPassword)){
                consectutiveFailedAttempts= consectutiveFailedAttempts+1;
                return false;
            }
            else{
            return false;
            }
        
        
        /*while (!inputPassword.equals(getPassword())){
            for (int i=1; i<4; i++){
                consectutiveFailedAttempts= consectutiveFailedAttempts+1;
                if(i==4){
                    return false;
                }
            }
            return inputPassword.equals(getPassword());
        }
            consectutiveFailedAttempts=0;
        return true;
    }
    */

    
}
    
}
