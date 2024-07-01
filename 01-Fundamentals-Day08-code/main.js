console.log("main.js here")

// Store a reference to an element in a variable
let inputElement = document.querySelector("input")
console.log(inputElement)
console.log(inputElement.value)

let counter = 0

function handleClick() {
    console.log("DUCK CLICK! BOOM!")
    counter = counter + 1
    console.log(counter)
}

let image = document.querySelector("img")

image.addEventListener("click", handleClick)