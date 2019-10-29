// import { Component, OnInit, Input } from '@angular/core';

// @Component({
//   selector: 'app-orbit-list',
//   templateUrl: './orbit-list.component.html',
//   styleUrls: ['./orbit-list.component.css']
// })

export class Satellite {
    name: string;
    orbitType: string;
    type: string;
    operational: boolean;
    launchDate: string;
    

    constructor(name: string, type: string, launchDate: string, orbitType: string, operational: boolean){
        this.name = name,
        this.type = type,
        this.launchDate = launchDate,
        this.orbitType = orbitType,
        this.operational = operational
    }

    shouldShowWarning(): boolean {
        if (this.type.toLowerCase() === 'space debris') {
            return true;
        } else {
            return false;
        }
     }
}
