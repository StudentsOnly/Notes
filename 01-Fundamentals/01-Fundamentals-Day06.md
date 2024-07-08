# Fundamentals day 6

## VS Code

- So when working on code, I recommend _always_ working with a project folder
    - Even for little tiny tests
    - Keep your projects organized, I recommend a folder like `~/projects`
    - Always when working with VS Code (and IntelliJ IDEA), open up a folder
    - Don't open individual files
    - Need just one file? Create folder with one file :)
    - VS Code doesn't work as well when opening a single file at a time
    - I recommend always opening it from the terminal

- Have you used the integrated terminal yet?
    - Ctrl+J
    - Ctrl+Shift+backtick
    - That's one reason why opening a folder is great :)
    - It's nice using a terminal **in context** like that

- Extensions
    - Did you talk about this yet?
    - These are little parts you can add as extras into VS Code
    - Feel free to experiment
    - I recommend not using **too** many extensions

- 3 minute mini exercise
    - Find a nice VS Code theme!
    - Go to extensions, search for "theme"

- Install Live Server
- If/when you have extra time, I recommend going through the settings of *everything*

## Keyboard shortcuts

(- It's also worth it to look up productivity / developer speed tips videos / blogs etc)

- Instead of using the mouse, use the keyboard

- Great Keyboard Shortcuts
    - General
        - Alt-F4 -- closes the current window
        - Ctrl+w -- closes the current tab
        - Alt-Tab -- switch between windows
        - Ctrl-C -- copy selected text
        - Ctrl-X -- cut selected text
        - Ctrl-V -- paste content from clipboard
        - Ctrl-Z -- undo the previous action
        - Ctrl-Alt-Entf/Del -- open running processes
        - Holding Shift or Ctrl to highlight/select content
        - Ctrl-Shift-Arrow - select something
        - Ctrl-S -- Save the current file
        - Ctrl-N -- Open new [thing]
        - F2 ------ Rename [thing]
        - Ctrl-F -- Find something
        - Ctrl-PLUS - Increase zoom
        - Ctrl-MINUS - Decrease zoom
    - Browser
        - Ctrl-T --- New tab
    - Terminal
        - Ctrl-Shift-T -- Open new tab

## Git review

- Let's create a new project and add some content
- Work with me


### Branching

- A very popular branching strategy is called `feature branches`
    - When you start to work anything in your project
    - You first create a branch from the main branch
    - A branch might be "fix-email-sending"
    - This allows you to easily work on multiple features at once
    - A senior might take time to review "fix-email-sending"
    - While you wait, you can start to work on "add-login"

    - When "fix-email-sending" is approved
    - You merge it to the main, delete the branch
    - And continue working on "add-login"


### What I did as a demonstration

- Clone + open in vs code
- `git checkout -b add-recipe-hummus`
- `touch hummus.md` - create markdown for recipe
- `assets/hummus.png` - add picture
- `readme.md` - add link to hummus.nd
- git add/commit/push
- Create PR using link provided by git

### Now you!

- 15 minute mini exercise
    - https://github.com/dci-fbw-j-24-e02/recipes
    - Clone the repo, make a "feature branch"
    - Add recipe including markdown instructions, image and link in README
    - git add/commit/push
    - Add a recipe, make a PR using link provided by git

### Pull requests and Code review

- A workflow like this with branches and pull requests are very common
- It is _very_ common that developers are not allowed to edit the main branch
    - Usually some other developer needs to review the code
    - This way you will get feedback on your code and your code style
    - This is how we work internally in DCI as well

- It is also very common that a code review takes a long time
    - While one of your branches is being reviewed
    - You can work on another branch
    - Both should start from the main branch

- A real PR
- For example from for example VS Code
- Perhaps https://github.com/microsoft/vscode/pull/164479

