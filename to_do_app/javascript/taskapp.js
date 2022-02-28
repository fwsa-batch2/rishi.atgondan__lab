let task = [];

function clicked() {
    event.preventDefault();

    let newtask = document.getElementById('maininput').value;

    task.push(newtask);

    let string = JSON.stringify(task);
    localStorage.setItem("check", string);

    showtask();
}

function showtask() {

    let son = localStorage.getItem("check");

    let realstring = JSON.parse(son);
    console.log(realstring);

    task = realstring;

    let rishi = "";
    for (let i = 0; i < task.length; i++) {
        let maintask = "<li>" + task[i] + "</li>";
        rishi = rishi + maintask;

    }
    let ultag = document.getElementById("okok");
    ultag.innerHTML = rishi;

}
showtask();

