// Create a function that takes two numbers as arguments and returns their sum.

function add(num1, num2){
    if(num1 > 0 && num2 > 0){
        return num1+ num2;
    }else{
        return 0;
    }
}

const num1 = parseInt(window.prompt('Input the 1st number '));
const num2 = parseInt(window.prompt('Input the second number '));

const sum = num1+num2;

console.log("The sum is " + sum);
