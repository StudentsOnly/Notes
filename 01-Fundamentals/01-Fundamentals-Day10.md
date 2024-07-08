# Fundamentals 10

**TODAY**
- Project management terminology
- Vocabulary of working in software projects

## This is not a project management course

- Welcome to corporate, I will be your spirit guide

- These are words to survive your first meetings and help in job hunting

- This is a technical course focusing on technology
- The things we will cover today are useful things to know
- They are project management concepts
- These concepts are used in small to huge companies
- Some of these _might_ come up in job interviews and ads

## Daily workflow

- Here's a typical day structure in a corporate project

    ```
    09:00 Start the work day
        - Coffee
        - Emails
        - Checking Slack
    09:15 Daily standup meeting aka `Scrum`
        - You say what task are you working on
        - You say if you need help or resources
    09:30 You start work
        - Writing code
        - Emails / Pull request updates
    12:00 Lunchtime!
    13:00 You start work
        - Writing code
        - Emails / Pull request updates
    15:00 Sprint planning meeting
    16:00 You start work
        - Writing code
        - Emails / Pull request updates
    17:00 Home sweet home
    ```

## Terminology

- We will now start to go through some terms one by one
- Probably the most critical term today is "issue"

### Individual task

- Typically you will work on one specific task in a project
- It might be called task or `issue`
    - Tasks coming from for example users by email are often called `tickets`
        - This is especially true for tech support -style roles

- A task is very specific thing to do
- A task generally should not take more than a few days

- A task often contains info like
    - Type
    - Topic
    - Description
    - Assignee
    - Priority
    - Severity

- **Type**
    - Could be "bug", "improvement" or "feature"

- **Assignee**
    - Who is working on the task

- 3 minute **mini exercise**
    - ChatGPT: What is the difference between "Priority" and "Severity"

- **Priority**
    - What task should be given priority
    - What is the most urgent
    - What should be done first

- **Severity**
    - The impact of this task
    - "How bad can this be?"
    - "How severe is this issue/bug/task?"

- A high priority, low severity task could be a very bad typo

- A low priority, high severity tasks are more rare
    - It could be some *extremely* specific and rare bug
        - It almost never happens
        - But if it does, it's very severe

    > If an admin uploads a picture on the first sunday of
    > a leap year, the email system goes down for a day

- Here's an issue for example https://code.djangoproject.com/ticket/34093

### Task types

- Sometimes there are specifically formatted tasks
    - User Story: "As a user, I am able to log out using only the keyboard for navigation"
    - User Story: "As a user, I can register a new account and log in with it"
    - https://bugzilla.mozilla.org/show_bug.cgi?id=909299

- Sometimes there are tasks within tasks (subtasks)
    - Tasks are collected into a bigger set (Epic, Sprint)
    - Epic: "User registration"

- Here's one workflow of a task in a project

1. Open the task system
2. Select one of the tasks that are marked as available
3. "Assign" the task for yourself
4. Make sure you are in the main branch 
5. Pull to get latest changes
5. Make a new git branch for the task and start working
6. When done you make a commit, push and make a pull request
    - You assign it to a Senior
    - You assign it to QA -- Quality Assurance
    - (Or that's done automatically)
7. When the pull request is approved, you mark the task as done
8. Repeat!

- 2 minute mini exercise
    - What does it mean when an issue is closed as a "duplicate"?
        - "Duplicate": Another issue already reported the same problem!
        - The number of this original issue is written in the duplicate

### Issue tracking / task systems

- There are many task systems
    - For example Jira, GitHub tasks, Trello

    - Each system has slightly different task types
    - https://issues.apache.org/jira/secure/IssueNavigator.jspa


- It's normal to have *many* tasks in a review queue
- It's normal to make *many* commits for one task
- It's normal to get **MANY** comments to fix in code reviews

- 5 minute mini exercise
    - Can you replicate the mini bug in this issue? https://github.com/microsoft/vscode/issues/211083

- 3 minute **mini exercise**
    - ChatGPT: What are characteristics of a good User Story?


### Scope

- **Which things to do in a project**

- Client: "Why didn't you include a theme switcher for my application?"
- Company: "It's not in the project scope, it's never mentioned in requirements"

- Extra things coming into your project in addition to original plans?
    - That's called ̃feature creep 👻😱

- **Which things to do in a task**

- Senior Developer: 
    > Why did you change `makePotato()` function in your pull request?
    > Your task was to make the `growTomato()` faster.
    > So, `makePotato()` is out of scope for that one.

## Project MGMT terminology

### Waterfall

- Still common way of working

- The "waterfall" comes from the process of working where
    - FIRST you define requirements, then that's locked into place
    - THEN you do design, then that's locked into place
    - THEN you do implementation, then that's locked into place
    - THEN you do testing, then that's locked into place
    - THEN you enter maintenance mode
    - https://ddg.gg/?q=!i+waterfall+process

- Sometimes client pays for just writing requirements

- Someone has to split up requirements into manageable parts
- Someone estimates amount of work for each part

- The estimates are counted together to form a price
    - For example; project estimation 2 months of work
    - There you have your price point
    - 2m * 4w * 5d * 8h * 100€/h = 32 000€
    - "Sales better not push the price any lower!"

- Waterfall projects often have a fixed price and fixed set of features
    - That can be problematic
    - ESTIMATING IS REALLY REALLY HARD

    - Project takes longer? Less profit, client sad, company sad
    - Project takes a bit less? More profit, client happy, company happy
    - Project takes a LOT less? MORE profit, client sad, company nervous

- Lots of shared-risk variations exist

- Issues
    - Bad requirements? EVERYTHING goes wrong
    - Bad estimate? Difficult to detect in time
    - A fundamental design or requirements issue found during testing? 
        - Uh-oh
    - Coming from experience: you always **learn** about a project when working on it

### Agile

- Umbrella term
    - Not just one specific thing
    - A set of frameworks and practices and tools for working in a project
    - https://www.agilealliance.org/agile101/agile-glossary

- 12 principles of "Agile"
    - https://www.agilealliance.org/agile101/12-principles-behind-the-agile-manifesto

- In agile projects you often work in short cycles
    - You are flexible and focus on the client and product
    - Instead of a set time, you define the minimum required time to complete a project
        - Then you add any "extras" depending on the budget
    - Coming from experience: you always **learn** about a project when working on it
    - Design, Coding, Testing is be done at the same time

- Agile projects require flexibility
    - If fixed price, has to have flexible feature set
    - If fixed features, has to have flexible price/time
    - If fixed features AND fixed time... **danger zone**

#### Sprint

- A sprint is a timed interval, often 2 weeks
- A sprint of 2 weeks might have 8 "story points"

    - Each task is assigned an estimate amount of work as "story points"
    - `"Add persistent login"` - 1 story point
    - `"Add Google Authentication"` - 4 story points
    - `"Simplify user registration form"` - 1 story points
    - `"Add virus checking for uploaded files"` - 2 story points
    - `"Add file upload form to mobile app"` - 2 story points

- You decide the focus of the next sprint in *sprint planning meetings*

    - The client and seniors/leads/architects discuss progress
    - "Did all the planned work get done?"
    - "We did all 8 story points of work early, this team does more than 8 Story Points per Sprint"
    - "We only did 5 Story Points of work, this team needs help"
    - "Last sprint we did 8 story points, this time only 3 - why?"
    - "What do we focus on now?"

- Agile sprints are an iterative, self-correcting approach

    - Meetings should include a reflection discussion for self-correcting
        - Many issues for sprint left unfinished?
            - Was this just a one time problem?
            - Maybe the issues are not well defined?
            - Maybe the issues are too big?
            - Maybe the estimates are not good?

    - If your estimates are systematically too small/big, you adjust!

- Try to have at least a minimally working system ready as soon as possible
    - You should notice problems much earlier this way
    - A few months in it's still easy to change architecture and designs

### "Sprint" alternate word: Milestones

- "Version 1"
- "Release 24.04"
- "Release 24.10"

- A collection of tasks, limited by time
    - Will contain many issues planned to be finished in a set time
    - Could contain many User Stories
    - Kind of an alternative to Epic tasks

    - https://github.com/microsoft/vscode/milestones
    - https://github.com/orgs/microsoft/projects/339/views/7


### Scrum

- "Daily meeting" with a _very_ specific format and often time limit
    - 15 person team, 15 minutes of timetime
    - Everyone says
        - What they work on
        - Are they on schedule
        - Do they need help

- Usually one person is the "scrum master" leading the meeting
- 3 minute mini exercise
    - ChatGPT: "Roleplay a typical scrum meeting with 3 participants"

### Kanban

- A way of organizing tasks
- A board of tasks with separate "lanes" for tasks ("swimlanes")
- Originally a wall of post-it notes

- https://trello.com/b/TMbUwmxZ/golf-it

## Definition of done

- Clients and project managers and clients argue always about this
- SUPER important for freelancers
    - How do you get rid of a project?
    - If there's a bug, do you need to fix it?

- **WHEN** is a task
    - When it's merged? When it's tested? When it's in production? For how long?
    - Does the client approve single tasks?

- **WHEN** is a project done
    - Does the client approve somehow?
    - What happens when something changes; like a browser update?

## MVP/MLP

- Minimum Viable Product
    - What is the bare minimum required for our product idea to work

- Minimum Loveable Product
    - What is the bare minimum required for people to get excited about our product

## Wrap-up

- Agile is an umbrella term of project management techniques
- Project management has it's own vocabulary
- Many developers end up doing some project management

- Relevant terms
    - Waterfall
    - Agile
    - Sprint
    - Kanban
    - Scrum
    - Task/Issue/Ticket
    - Issue types: Epic, User Story, Bug, Improvement
    - MVP / MLP

## Self-study ideas (extra study materials, not at all mandatory!)

- Almost 4 hours of Agile project management videos? YES PLEASE! 🤩
- https://www.agilealliance.org/agile101/agile-basics/introduction-to-agile/
- https://www.agilealliance.org/agile101/agile-basics/agile-development-practices/
- https://www.agilealliance.org/agile101/agile-basics/agile-planning-project-management/
