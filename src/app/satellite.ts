export class Satellite {
    name: string;
    orbitType: string;
    type: string;
    operational: boolean;
    launchDate: string;
    warning: boolean;

    constructor(name: string, type: string, launchDate: string, orbitType: string, operational: boolean, warning: boolean){
        this.name = name,
        this.type = type,
        this.launchDate = launchDate,
        this.orbitType = orbitType,
        this.operational = operational
//        this.warning = this.shouldShowWarning();
    }

    // shouldShowWarning(): boolean {
    //     if (this.type.toLowerCase() === 'space debris') {
    //         return true;
    //     } else {
    //     return false;
    //     }
    // }
}
