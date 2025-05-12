let person : [string, number] = ["alice", 34];
let book: [string, string ,number?];
book = ["title", "author"];
book = ["title", "author", 33];


let httpResponse: [number, string, ...string[]] = [
    200,
    "ok",
    "Hi prends",
    "bye prends"
];

let point: [x: number, y: number] = [10, 29];
console.log(point[0]);
console.log(point[1]);


let [pname, num] = person;
console.log(pname);
console.log(num);