import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor(private http:HttpClient) { }
  getUser(id:number){
    return this.http.post<any>("URLConstants.MODIFY_CUSTOMER_PROFILE", id);
  }

  validateHours(userId:number,eventName:string){
    return this.http.post<any>("URLConstants.MODIFY_CUSTOMER_PROFILE", {userId,eventName});
  }
}
