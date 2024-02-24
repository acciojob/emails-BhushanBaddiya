package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }
    public boolean verifyUppercase(char [] verify){
          boolean ans = false;
        for(int i = 0; i < verify.length; i++){
            char c = verify[i];
            if(c >= 'A' && c <= 'Z'){
                ans = true;
            }
        }
        return ans;
    }
    public boolean verifyLowercase(char [] verify){
        boolean ans = false;
        for(int i = 0; i < verify.length; i++){
            char c = verify[i];
            if(c >= 'a' && c <= 'z'){
                ans = true;
            }
        }
        return ans;
    }
    public boolean isPresentDigit(char [] verify){
        boolean ans = false;
        for(int i = 0; i < verify.length; i++){
            char c = verify[i];
            if(c >= '0' && c <= '9'){
                ans = true;
            }
        }
        return ans;
    }
    public boolean isSpecialChar(char [] verify){
        boolean ans = true;
        for(int i = 0; i < verify.length; i++){
            char c = verify[i];
            if((isPresentDigit(verify)) || (verifyLowercase(verify) || (verifyUppercase(verify)))){
                ans = false;
            }
        }
        return ans;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
         if(this.password == oldPassword){
             char [] verify = newPassword.toCharArray();
             if(verify.length >= 8){
                 if(verifyUppercase(verify)){
                     if(verifyLowercase(verify)){
                         if(isPresentDigit(verify)){
                             if(isSpecialChar(verify)){
                               this.password = newPassword;
                             }
                         }
                     }
                 }
             }
         }

    }
}
