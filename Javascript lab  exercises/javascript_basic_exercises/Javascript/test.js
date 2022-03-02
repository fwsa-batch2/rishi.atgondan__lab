//1.JavaScript Program To Print Hello World

function print() {
    document.write("Hello World");
}

//2.JavaScript Program to Add Two Numbers

function addnum() {
    let a = 20;
    let b = 10;
    let c = a + b;
    document.write("Sum of Two Numbers:" + c);
}

//3.JavaScript Program to Find the Square Root

function sqrt() {
    let d = Math.sqrt(10);
    document.write("Square Root is:" + d);
}

//4.JavaScript Program to Swap Two Variables

function swap() {
    let a = "Rishi";
    let b = "Santhanu";
    let c = a;
    a = b;
    b = c;
    document.write(a, b);
}

//5.Javascript Program to Convert Celsius to Fahrenheit
// (x*9/5)+32

function convertctof() {

    let Celsius = 132;
    let x = Celsius * 9 / 5;
    let y = x + 32;
    document.write(y);
}

//6.Javascript Program to Generate a Random Number

function randomnum() {
    let a = Math.random();
    document.write(a);
}

function randomnum1() {
    let a = Math.random();
    let b = Math.floor(a * 5);
    document.write(b);
}

//7.Javascript Program to Check if a Number is Odd or Even

function oddoreven() {
    let a = 23;
    if (a % 2 == 0) {
        document.write("even number");
    }
    else {
        document.write("odd number");

    }
}

function oddoreven2() {
    let a = 46;
    if (a % 2 == 0) {
        document.write("even number");
    }
    else {
        document.write("odd number");

    }
}

// 8. JavaScript Program to Check Prime Number
function primenum() {
    const inputNumber = 3;
    let Prime = true;
    if (inputNumber == 1) {
        document.write("1 is neither prime nor composite.");
    } else if (inputNumber > 1) {
        for (let i = 2; i < inputNumber; i++) {
            if (inputNumber % i == 0) {
                Prime = false;
                break;
            }
        }
        if (Prime) {
            document.write(`${inputNumber} is a prime number`);
        } else {
            document.write(`${inputNumber} is a not prime number`);
        }
    }
}

// 9. JavaScript Program to Find the Factorial of a Number
function facnum() {

    const facnum = 7;

    if (facnum < 0) {
        document.write("Factorial for negative number does not exist.");
    } else if (facnum === 0) {
        document.write(`The factorial of ${facnum} is 1.`);
    } else {
        let fact = 1;
        for (i = 1; i <= facnum; i++) {
            fact *= i;
        }
        document.write(`The factorial of ${facnum} is ${fact}`);
    }


}

// 10. JavaScript Program to Print the Fibonacci Sequence

function fibonacci() {
    const fibnum = 12; //i need 12 fibonacci sequence
    let n1 = 0,
        n2 = 1,
        nn

    document.write("Fibonacci Series is:");

    for (let i = 1; i <= fibnum; i++) {
        document.write(n1, ", ");
        nn = n1 + n2;
        n1 = n2;
        n2 = nn;
    }
}

// 11. JavaScript Program to Make a Simple Calculator

function calculator() {

    let operator = prompt('Enter operator ( either +, -, *,/ or % ): ');


    let a = parseFloat(prompt('Enter the first number you want to calculate: '));
    let b = parseFloat(prompt('Enter the second number you want to calculate: '));

    let ans;


    if (operator == '+') {
        ans = a + b;
    }
    else if (operator == '-') {
        ans = a - b;
    }
    else if (operator == '*') {
        ans = a * b;
    }
    else if (operator == '%') {
        ans = a / 100 * b;
    }
    else {
        ans = a / b;
    }
    // document.write(`${a} ${operator} ${b} = ${ans}`)
    document.write(`${a} ${operator} ${b} = ${ans}`)

}