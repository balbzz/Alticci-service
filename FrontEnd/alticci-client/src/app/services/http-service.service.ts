import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class HttpService {
  constructor(private http: HttpClient) {}

  private url = 'http://localhost/hello/';

  getResult(n: number) {
    this.url.concat(n.toString());
    return this.http.get<number>(this.url); //Temos que especificar que o resultado é do tipo number
  }
}
