"use strict";
class Circle {
    constructor(radius) {
        this.radius = radius;
    }
    clone() {
        return new Circle(this.radius);
    }
    draw() {
        console.log(`Drawing a circle with radius: ${this.radius}`);
    }
}
const originalCircle = new Circle(10);
originalCircle.draw();
const clonedCircle = originalCircle.clone();
clonedCircle.draw();
