let numbers: number[] = [1, 3, 4, 4];
numbers.push(4);
console.log(numbers);

let fruits: Array<string> = ["apple", "bannana"];
fruits.push("mango");
console.log(fruits);

const colors: readonly string[] = ["hello", "bye"];
//colors.push("yellow");
let mixed: (string | number)[] = ["hello", 42];
mixed.push(2888);
mixed.push("typescript");
console.log(mixed);