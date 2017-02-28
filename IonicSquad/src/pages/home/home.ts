import { Component } from '@angular/core';

import { NavController } from 'ionic-angular';
import { LoginService } from '../../services/login-service';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})

export class HomePage {
  public username:any;
  public password:any;
//public status:string="INVALID";
  constructor(public navCtrl: NavController, public loginService: LoginService) {
  this.loginService.getLoginStatus(this.username,this.password); 
}


}
