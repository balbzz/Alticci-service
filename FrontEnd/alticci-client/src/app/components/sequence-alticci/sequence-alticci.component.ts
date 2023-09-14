import { Component } from '@angular/core';
import { HttpService } from '../../services/http-service.service';
import { AlticciCalculatorVO } from '../../models/AlticciCalculatorVO';

@Component({
  selector: 'app-sequence-alticci',
  templateUrl: './sequence-alticci.component.html',
  styleUrls: ['./sequence-alticci.component.css'],
})
export class SequenceAlticciComponent {
  n!: number;

  resultAlticci: AlticciCalculatorVO = {
    result: 0,
  };
  constructor(private http: HttpService) {}

  calculate() {
    if (this.n >= 0) {
      this.http.getResult(this.n).subscribe(
        (response) => {
          this.resultAlticci.result = response;
        },
        (error) => {
          console.error('Error', error);
        }
      );
    } else {
      console.error('Index (n) a positive integer.');
    }
  }
}
