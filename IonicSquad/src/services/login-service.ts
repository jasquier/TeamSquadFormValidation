import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

@Injectable()
export class LoginService{
    public data:any;
    public loginStatus: string;
    constructor(private  http:Http){}

    getLoginStatus(username:any, password:any){
        this.http.get(`http://localhost:8080/login?name= + ${username} + &pw= + ${password}`).subscribe(res => {
            this.data = res.json();
            this.loginStatus = this.data.status;
        }, error => {
            console.log(error);
        });
    }
   
}





    // getLoginStatus(username:any, password:any){
    //     this.http.get(`http://localhost:8080/login?name= + ${username} + &pw= + ${password}`).subscribe(res => {
    //         this.data = res.json();
    //         this.loginStatus = this.data.status;
    //     }, error => {
    //         console.log(error);
    //     });
    // }