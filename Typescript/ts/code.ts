interface Person{
    name: string;
    age: number;
    greet(): void;
}
const john: Person = {
    name: "John Doe",
    age: 39,
    greet() {
        console.log(`Hello, my name is ${this.name!}`);
    }
};
john.greet();

class Employee implements Person{
    constructor(
    public name: string,
    public age: number,
    public jobTitle :string
    ){}
greet(){
    console.log(`Hi, I am ${this.name}, a ${this.jobTitle}.`);
}
}

const sarah = new Employee("Sarah Smith", 28, "Developer");
sarah.greet();

interface Book {
    title: string;
    author: string;
    pages?: number;
}

const book1: Book = { title: "TS Basics", author: "Jane Doe" };
const book2: Book = { title: "Ap Basics", author: "Jane Dhoe", pages: 34324 };

interface Person1 {
    name: string;
}
interface Emp extends Person1 {
    id: number;
}

class Manager implements Emp{
    name = "Bob";
    id = 123;
}