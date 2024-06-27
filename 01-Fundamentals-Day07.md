# Fundamentals day 7

**TODAY**
- Very small git group exercise
- Web Development basics

## Exercises

- I've been copy-pasting exercises to various chats :)
- In the future, we will slowly transition to working based on GitHub Classroom
- Exercises will be handed out there
- When you accept a classroom exercise, it actually creates a repository for you
- Sometimes it's just instructions, sometimes you will clone

- Normally, no need to do any branches into these repos
    - Just clone, work, commit, push

- This first time, it will ask to identify your GitHub account with your name

**20 minute exercise**
Exercise: https://classroom.github.com/a/k4zGmrf2

## Websites

- Why are we talking about websites?
- It's good to know your friends
    - Just kidding
    - But it *is* good to know a bit about how it works
    - For security and functionality reasons
    - They are the frontend to our backend (more on that later)
    - Later on in the course we will do a little tiny bit of web dev
    - Besides, it can be kind of fun
    - And even backend developers might want a portfolio page

- In any case, we will now focus on basic concepts
- To those of you that did the orientation course these 3 days will be familiar
    - "Repetition is the mother of learning"

## Basic HTML & CSS

- Web Development is based of three fundamental languages
    - HTML: structure
    - CSS: style
    - JavaScript: advanced & dynamic functionality

- Websites? Just HTML, CSS and JavaScript in the end
    - Many things things are websites
        - Let's see the browser developer tools

    - Many kiosks might be websites
        - Like the ones you order food from at Burger King

    - Many mobile apps might be basically just websites
    - Even some games on Steam are basically just websites

    - The lines between a traditional app and a website are *very* blurry

- Web Dev is a **vast** field that requires many supporting technologies

## Live code review

- Everything starts from HTML
    - The _structure_ of the website
    - The browser understands HTML, it RENDERS (draws) the page based on the HTML
    - Based on HTML, the browser downloads assets (other files) and renders the page with them

- HTML is made up of elements
    - HTML element: `<p>Shout, shout, let it all out!</p>`

    - HTML opening tag: `<p>`
    - HTML closing tag: `</p>`

    - This is a "semantic" element
        - Semantic elements have a meaning like "p for paragraph"
        - Search engines like semantic elements :)

    - Some elements don't require a closing tag; for example `<hr>`
        - Buuuuuuuut 99% it's OK to add the closing tag :)

    - The `<div>blah</div>` is not a semantic element; it's a generic box

- HTML has a basic structure

    - `<html>` - contains the head and body
    - `<head>` - contains invisible elements that describe the document
        - Title of the page
        - Language, keywords and description for SEO
    - `<body>` - contains all the visible elements

    - Elements are "nested"; one inside the another

    ```html
    <body>
        <p>Hello</p>
        <p>A quick brown <b>fox</b> jumped over the lazy cow</p>
    </body>
    ```

- Famous elements: Everything is a box

    - "Block level elements"
        - `<p>Hello</p>` paragraph - box of text
        - `<h1>Hi</h1>` heading 1 - box of big text for the main page heading
        - `<h2>Hi</h2>` heading 2 - box of big text for a secondary heading

    - "Inline elements"
        - `<b>Hi</b>` bold - box of bold text in a line of text; inline
        - `<i>Hi</i>` italic - box of italicized text in a line of text; inline

        - `<img src="???">` image - box with image, no closing tag, one attribute
        
            - Attributes: things like the `src="..."` additional values for the element

- Tons of elements and attributes

- Commonly the HTML of a website is generated from templates
    - Sometimes even from other languages
    - Request, Response -> Java loads template, responds

### CSS

- Completely different from HTML 😊

- Styling language
    - Defines how the HTML boxes really look
        - Size, position, font, color, animations...

- Made up of "rules"

    ```css
    p {
        color: red;
        font-size: 25px;
    }
    ```

    - The `p` is a selector, it selects which element(s) are affected
    - The `{ }` are curly braces
    - Inside the curlies we have **declarations**
        - `background: lightpink;` is one declaration
        - `color: magenta;` is one declaration
            - `color` is a property
            - `magenta` is a property value

    - Curly Braces group declarations together for the selector specified
    - "All paragraph elements on the page have red text that's sized 25px"

- CSS has many different selectors
- CSS has many different properties
- CSS has many different kinds of values
- Sometimes CSS is generated from a similar, but more powerful language


- Let's review a few important words

    - ` -- "backtick"
    - `~` -- tilde
    - `/` -- slash
    - `\` -- backslash
    - `-` -- hyphen, dash, minus
    - `|` -- vertical line, pipe
    - `(` and `)` -- parentehehehses
    - `[` and `]` -- brackets, square brackets, big brackets
    - `{` and `}` -- curly braces, middle brackets
    - `<` and `>` -- Greater than, smaller than


- 15 minute exercise
    - Let's practice typing these on your keyboard
    - Create an ASCII art picture using all of these:
        - Draw a very large gingerbread house!
        - Use each character at least once
    - Not sure what ASCII art is? A quick search will show it fast :) 
    - When done, use an emoji reaction 👍 to let me know

## Making a simple form

- We will practice HTML by making a form
- Nothing beats a good form
- A good form is like a good bicycle, reliable and nice to use
