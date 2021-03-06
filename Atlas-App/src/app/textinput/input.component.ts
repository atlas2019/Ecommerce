//The Input Component, which act as the Child Component

import { Component, Input, Output, EventEmitter, OnInit } from '@angular/core';
import { Action } from 'rxjs/internal/scheduler/Action';

@Component({
  selector: 'custom-input',
  templateUrl: './input.component.html',
})
export class InputComponent implements OnInit {

  @Input() childMessage: any = []; //The childmessage of type input//
  @Output() messageEvent = new EventEmitter<string>(); //the output through eventemitter//
  @Input() action:any;
  ngOnInit() {
  }

  set() {
    this.messageEvent.emit(this.childMessage);
  }

  model: any = {};

}
