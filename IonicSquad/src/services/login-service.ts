import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

@Injectable()
export class LoginService{
    public data:any;
    public loginStatus: string;
    constructor(private  http:Http){}
    str1:string = "http://127.0.0.1:8080/login?name=";
    

    getLoginStatus(username:any, password:any){
        this.http.get(this.str1+username+"&pw="+password).subscribe(res => {
            this.data = res.json();
            this.loginStatus = this.data.isPassWordValid;
        }, error => {
            console.log(error);
        });
    }
   
}
