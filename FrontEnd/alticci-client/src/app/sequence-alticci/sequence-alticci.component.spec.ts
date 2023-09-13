import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SequenceAlticciComponent } from './sequence-alticci.component';

describe('SequenceAlticciComponent', () => {
  let component: SequenceAlticciComponent;
  let fixture: ComponentFixture<SequenceAlticciComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SequenceAlticciComponent]
    });
    fixture = TestBed.createComponent(SequenceAlticciComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
