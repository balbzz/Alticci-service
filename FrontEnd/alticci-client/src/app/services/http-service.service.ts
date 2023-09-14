import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class HttpService {
  constructor(private http: HttpClient) {}

  private url = 'http://localhost:8080/hello/';

  getResult(n: number): Observable<any> {
    let temp = this.url + n;
    console.log(temp);
    console.log(n);
    return this.http.get(this.url + `${n}`); //Temos que especificar que o resultado é do tipo number
  }
}
