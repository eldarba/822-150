let p = {
    id: 101,
    name: 'Dan',
    age: 25,
    run: function(){
        console.log(this.name + " is running");
    }
};

console.log(p);
console.log(p.id);
console.log(p.name);
console.log(p.age);
console.log(p.run); // print the function field
p.run(); // call the fnction
console.log("=============");
p.name = "Avner";
console.log(p.name);
p.email = "avner@mail"; // we can add fields to objects
console.log(p.email);
console.log(p);
p.work = function () {
    console.log(this.name + " is working");
}
p.work();
