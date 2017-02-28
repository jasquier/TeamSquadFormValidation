import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

@Injectable()
export class LoginService{
    public data:any;
    public loginStatus: any = "FALSE";
    constructor(private  http:Http){}
    str1:string = "http://127.0.0.1:8080/login?name=";
    

    getLoginStatus(username:any, password:any){
        console.log(this.str1+username+"&pw="+password);
        this.http.get(this.str1+username+"&pw="+password).subscribe(res => {
            this.data = res.json();
            this.loginStatus = this.data.isPasswordValid;
            console.log("data:   "+this.data);
            console.log("status   "+this.loginStatus);
        }, error => {
            console.log(error);
        });
    }
   
}
