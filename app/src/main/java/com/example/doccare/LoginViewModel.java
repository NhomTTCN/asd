package com.example.doccare;


import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

import com.example.doccare.BR;
import com.example.doccare.Model.User;

public class LoginViewModel extends BaseObservable {
    private String username;
    private String password;
    public ObservableField<String> messageLogin = new ObservableField<>();
    public ObservableField<Boolean> isShowmessage = new ObservableField<>();
    public ObservableField<Boolean> issuccess = new ObservableField<>();

    @Bindable
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        notifyPropertyChanged(BR.username);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    public void onClickLogin(){
        User user = new User("a", "v");
        isShowmessage.set(true);
        if(user.isValid()){
            messageLogin.set("Login successfully!!!");
            issuccess.set(true);
        } else {
            messageLogin.set("Login failed");
            issuccess.set(false);
        }
    }

}
