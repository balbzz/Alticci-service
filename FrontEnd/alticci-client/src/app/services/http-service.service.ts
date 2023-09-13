import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class HttpService {
  constructor(private http: HttpClient) {}

  private url = 'http://localhost:8080/hello/';

  getResult(n: number) {
    let temp = this.url + n;
    console.log(temp);
    console.log(n);
    return this.http.get<number>(temp); //Temos que especificar que o resultado é do tipo number
  }
}
