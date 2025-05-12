let userInput: string | null = window.prompt("Please enter your Input");
if (userInput !== null) {
    window.alert(`Hello, ${userInput}!`);
} else {
    window.alert("You clicked Cancel or closed the prompt.");
}