import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

@Injectable()
export class LoginService {

    private data: any;
    private responseData: any;
    private loginStatus: string = "false";
    private url: string = "http://127.0.0.1:8080/login";

    constructor(private http: Http) {}

    getLoginStatus(username: string, password: string) {
        this.data = {
            "username": username,
            "password": password
        };
        
        this.http.post(this.url, this.data).subscribe(response => {
            this.responseData = response.json();
            console.log(this.responseData);
            this.loginStatus = this.responseData.isPasswordValid;
        });
    }
}
