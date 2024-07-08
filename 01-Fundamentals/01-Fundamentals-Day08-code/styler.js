let image = document.querySelector("img")
let body = document.querySelector("body")

body.style.background = "hsl(6000, 30%, 40%)"

function handleMouseMoveEvent(event) {
    console.log(event.x)

    let hue = event.x/3
    let sat = event.y/3

    body.style.background = "hsl(" + hue + ", " + sat + "%, 30%)"
}

document.addEventListener("mousemove", handleMouseMoveEvent)