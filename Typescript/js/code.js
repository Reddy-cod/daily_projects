var john = {
    name: "John Doe",
    age: 39,
    greet: function () {
        console.log("Hello, my name is ".concat(this.name));
    }
};
john.greet();
var Employee = /** @class */ (function () {
    function Employee(name, age, jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }
    Employee.prototype.greet = function () {
        console.log("Hi, I am ".concat(this.name, ", a ").concat(this.jobTitle, "."));
    };
    return Employee;
}());
var sarah = new Employee("Sarah Smith", 28, "Developer");
sarah.greet();
var book1 = { title: "TS Basics", author: "Jane Doe" };
var book2 = { title: "Ap Basics", author: "Jane Dhoe", pages: 34324 };
var Manager = /** @class */ (function () {
    function Manager() {
        this.name = "Bob";
        this.id = 123;
    }
    return Manager;
}());
