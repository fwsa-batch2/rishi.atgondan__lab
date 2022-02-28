
let element = document.getElementById("input");


function display(x) {
    element.value += x;
}

function solve() {
    let x = element.value;
    element.value = eval(x);
}

function clean() {
    document.getElementById("input").value = "";
}

