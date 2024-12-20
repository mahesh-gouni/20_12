package com.neoteric.springFrameWorkDecember.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component //creating the bean
public class Atm {
    User users =new User();
   // @Autowired
    User user;
// public    Atm (User user){
//     this.user=user;
//
// }
    @Autowired
   public void SetUser(User user){
       this.user= user;
   }


    public void message(){
        user.pin();
        System.out.println("amount debited successfully");
    }

}
