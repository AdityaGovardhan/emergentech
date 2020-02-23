import { Component, OnInit } from '@angular/core';
@Component({
    selector: 'piechart',
    templateUrl: './piechart.html'
  })
  export class PieChartComponent implements OnInit {
    public doughnutChartLabels = ['Education', 'environment', 'health', 'child care'];
    public doughnutChartData = [30, 50, 10, 10];
    public doughnutChartType = 'doughnut';
    constructor() { }
    ngOnInit() {
    }
  }