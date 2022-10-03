package com.example.lib;

public class InterfaceCallBack {
    public static void main(String[] args) {
        Button button = new Button(new LoginClickListner());
        button.buttonClicked();

    }
}

    class LoginClickListner implements IAuthor{

        public void sendLoginRequest() {
            System.out.println("login request wsa successfully sent...");

        }
    }

interface IAuthor {
    void sendLoginRequest();


}

class Button {
    IAuthor  iAuthor;

    public Button(IAuthor action){
        this.iAuthor = action;
    }

    void buttonClicked(){
        iAuthor.sendLoginRequest();

    }
}
