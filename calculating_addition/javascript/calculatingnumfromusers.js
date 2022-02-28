
// This is a function for subrating
function addition(add1, add2) {
    let num1 = +add1;
    let num2 = +add2;
    let sum = num1 + num2;
    return sum;
}

// This is the function after performing after submit

function submit_handler() {

    event.preventDefault(); //prevent from refresh
    const firstNumber = document.getElementById('in1');
    const secondNumber = document.getElementById('in2');

    console.log('first Number = ' + firstNumber.value);
    console.log('second Number = ' + secondNumber.value);

    //FirstNumber value = add-1, SecondNumber value = add2

    const add = addition(firstNumber.value, secondNumber.value);

    const div = document.getElementById('Ans').innerHTML = add;
}