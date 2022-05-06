import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-about',
  templateUrl: './aboutus.component.html',
  styleUrls: ['./aboutus.component.css']
})
export class AboutusComponent implements OnInit {

  facilities = [
    {
      url: "https://tse1.mm.bing.net/th?id=OIP.miz56zsUFzCJOBHqUT47rwHaD4&pid=Api&P=0&w=294&h=154",
      facName: " "
    }
  ]
  constructor() { }

  ngOnInit(): void {
  }

}

