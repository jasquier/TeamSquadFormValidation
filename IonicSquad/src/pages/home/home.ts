import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

import { LoginService } from '../../services/login-service';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})

export class HomePage {

    private username: string;
    private password: string;

    constructor(public navCtrl: NavController, public loginService: LoginService) {}

    getStatus(){
      this.loginService.getLoginStatus(this.username, this.password);
      console.log(this.password);
      console.log(this.username);
    }
}
