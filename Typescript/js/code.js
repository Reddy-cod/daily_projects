var userInput = window.prompt("Please enter your Input");
if (userInput !== null) {
    window.alert("Hello, ".concat(userInput, "!"));
}
else {
    window.alert("You clicked Cancel or closed the prompt.");
}
