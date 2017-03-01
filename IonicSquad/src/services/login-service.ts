import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

@Injectable()
export class LoginService{

    public data: any;
    private loginStatus: string = "false";
    private str1: string = "http://127.0.0.1:8080/login?name=";

    constructor(private http: Http){

    }

    getLoginStatus(username: string, password: string){
        // log the query
        console.log(this.str1+username+"&pw="+password);

        this.http.get(this.str1+username+"&pw="+password).subscribe(res => {
            this.data = res.json();
            this.loginStatus = this.data.isPasswordValid;
            // log response
            console.log(this.data);
        }, error => {
            console.log(error);
        });
    }
   
}
