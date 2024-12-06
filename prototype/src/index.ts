interface ICircle {
    radius: number;
    clone(): ICircle;
    draw(): void;
}
   
class Circle implements ICircle {
    radius: number;

    constructor(radius: number) {
        this.radius = radius;
    }

    clone(): ICircle {
        return new Circle(this.radius);
    }

    draw(): void {
        console.log(`Drawing a circle with radius: ${this.radius}`);
    }
}

const originalCircle = new Circle(10); 
originalCircle.draw();

const clonedCircle = originalCircle.clone();
clonedCircle.draw();