"use strict";

let str = "4.39";

// ways of transforming a string to number
let x;
x = +str;
x = Number(str);
x = parseFloat(str);
x = parseInt(str);

console.log(x);
console.log(typeof x);