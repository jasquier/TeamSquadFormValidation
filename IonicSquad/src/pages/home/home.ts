import { Component } from '@angular/core';

import { NavController } from 'ionic-angular';
import { LoginService } from '../../services/login-service';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})

export class HomePage {
    public username:any = "user";
    public password:any = "0000";
    //public status:string="INVALID";
    constructor(public navCtrl: NavController, public loginService: LoginService) {
        //this.loginService.getLoginStatus("######", "00000"); 
        //this.getStatus();
    }

    getStatus(){
      this.loginService.getLoginStatus(this.username, this.password);
      console.log(this.password);
      console.log(this.username);
      
    }

}
