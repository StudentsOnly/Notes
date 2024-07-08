console.log("main.js here")

// Store a reference to an element in a variable
let inputElement = document.querySelector("input")
console.log(inputElement)
console.log(inputElement.value)

let image = document.querySelector("img")
let counter = 0

function handleClick() {
    console.log("DUCK CLICK! BOOM!")
    counter = counter + 1
    console.log(counter)

    // Controlling elements from JS
    inputElement.value = counter
    image.style.rotate = counter + "deg"
}

image.addEventListener("click", handleClick)
image.addEventListener("mouseenter", handleClick)
image.addEventListener("mouseout", handleClick)

// 5 minute mini exercise
// - Try "mouseenter" and "mouseout"
// - Attach the same "handleClick" function to mouseenter and mouseout :)