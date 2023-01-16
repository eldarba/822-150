"use strict";
// this is a class definition
class Person {

    // CTOR
    // fields are usualy created using a CTOR:
    constructor(id, name, age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // methods
    speak(msg) {
        console.log(this.name + " says: " + msg);
    }
}

class Employee extends Person {
    constructor(id, name, age, salary) {
        super(id, name, age);
        this.salary = salary;
    }

    // overriding methods
    speak(msg) {
        console.log(this.name + " says: " + msg + ", I earn: " + this.salary + "$");
    }
}

// after defining a class we can create objects:
let p1 = new Person(101, 'Moti', 25);
let p2 = new Person(102, 'Avi', 32);

console.log(p1);
console.log(p2);

p1.speak("Hello");
p2.speak("Hi");

let emp1 = new Employee(201, "Oved", 41, 25000);
console.log(emp1);
emp1.speak("I am working");