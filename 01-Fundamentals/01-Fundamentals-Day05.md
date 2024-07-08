# Fundamentals day 5

**TODAY**
- ChatGPT / AI
- Networking things
    - Anatomy of URLS
    - HTTP, HTTPS
    - IP addresses
    - DNS

## AI and ChatGPT

- Who has already used ChatGPT?

- ChatGPT is an LLM that works like an automated chat partner
    - Large Language Model
    - LLMs is made using Machine Learning (ML)

- LLMs are programs that are "fed" large amounts of text
    - As the LLM receives more text, it analyzes the content
    - It searches the text for patterns and connections between terms
        - The term "Concrete" is related to "Cement"
        - The terms "Potato" and "Stormcloud" are not related at all
        - The terms "Wood", "Plank", "Board" and "Lumber" are all super related
        - The words "The capital of France is" is often followed by "Paris"

- From its analysis it can very easily complete pieces of text
    - Everyone together, unmute yourself and get ready to finish my sentence
    - "The capital of Germany is"
    - "The eiffel tower is located in"
    - "The best animal pet you can have is"

- This is the core functionality of ChatGPT, simplified

- Some people argue the term "AI" isn't applicable for ChatGPT because it's ML
    - But in practical modern lingo, it's considered a form of AI

- AI is a broad term used to describe machines mimicking cognitive functions
- AI can range from simple rule-based systems to complex machine learning models

- Let's make an account and test ChatGPT
    - Note: you can use your @dci-student.org email addresses to make an account

## AI usage with studies

- Use ChatGPT as you would a human tutor

    - "Explain this Linux command: cat myfile.txt |grep target"
    - "What does 'wildcard' mean in 'Wildcard DNS'"
    - "What is PS1 in Bash and how can I see current PS1"
    - "Is 'Eierlegendewollmilchsau' der, die or das?"
    - "Explain the usage of accusative in German with simple examples"

- 18 minute mini exercise
    - Watch https://www.youtube.com/watch?v=bEJ0_TVXh-I
    - Thoughts? Does it make sense?

- You are the pilot!
    - AI makes mistakes all the time, don't trust it blindly
    - Don't ask it to generate code for you
        - That's actually not a good way to learn
        - Especially in the beginning
        - You have to know how to write code yourself
        - Struggling to code is a **desirable difficulty**
        - The struggle and difficulty is you training your brain :)

- **This is super Important!!**
    - Programming is problem solving
    - Problem solving isn't really something we can just teach
    - You have to experience and figure it out yourself
    - You have to struggle through it
    - You can't learn problem solving...
    - ...if someone else is solving the problems

## Review Exercises

- What program did I use to make the countdown timer in my terminal?

- 10 minute mini exercise

- * Install `neofetch` using `apt` (and try it)
- * Install `chromium` using `snap` (and try it)
- * Install `sl` (and try it).  Which command did you use?
- * Install `cowsay` (and try it). Which command did you use?
- * Research: what is the difference between apt and snap?
- * Update your package list from the terminal. Which command did you use?
- * What is `sudo` and what does it allow you to do?
    - Command; SuperUser DO - some commands are restricted for security reasons

## Networking concepts: URLs

- The goal is to familiarize with a few key networking concepts

- What is a URL?
    - Uniform Resource Locator; a kind of network address

- A lot of communication over the internet uses URLs
- When you type in a URL into your browser, what happens?
    - Your browser sends a GET request
    - A server processes the request and sends back a response
    - The classic Request and Response cycle
    - You always have a client and server
    - This way of communicating is based on the HTTP protocol
        - Protocol = set of rules
    - That's why website addresses start with `http://` or `https://`
    - The beginning is the protocol
    - Let's look a bit more closely at a web address

- Your computer always answers to the domain "localhost"
    - If you have a local web server, it might be http://localhost:80

- The port there is an interesting one
    - With different ports, you could have multiple local web servers
    - Web server == program that responds to HTTP requests
    - The original port for HTTP is 80
    - The original port for HTTPS is 443
    - A few common alternatives are 8080, 9000 and 3000

- Has anyone heard of other common ports?
    - 21 for FTP (File Transfer Protocol)
    - 22 for SSH (Secure SHell)
    - 25 for SMTP (Simple Main Transfer Protocol), one of the email protocols
    - You might learn more in your journey as a developer

### HTTP, HTTPS

- So this request and response that happens
- The exact way those requests and responses work is defined in a protocol
    - So; HTTP is "Hypertext Transfer Protocol"
    - Again; Protocol = set of rules
    - HTTP = set of rules how clients and servers exchange information
    - We will learn more about those rules later in the course

- HTTPS is HTTP, but with encryption
    - Does anyone know the "S" there?
    - Secure HTTP
    - Secure = encrypted
    - It used to be SSL, now it's commonly TLS
    - No need to go into technical details here!
    - The point of this thing is to _encrypt_ messages

- When an HTTPS request and response happens
    - The client and server make a "handshake"
    - They get to know each other and choose a secret language
    - The client can then make an encrypted request with the secret language
    - The server will understand it and and sends an encrypted response!
    - If someone listens to the exchange, they will not understand it
        - Someone listening to the conversation is a "man-in-the-middle attack"
        - Cybersecurity as a topic is **very** complex and broad

## Networking concepts: IP addresses, router and ports

- Everything connected to the internet has a technical address
- An IP address
- IP = Internet protocol
- There are two kinds of IP addresses, IPv4 and IPv6
- Let's look at the basics of IPv4

- Your computer has two or even more IP addresses!
- Your computer can always refer to itself with `127.0.0.1`
    - That's an IPv4 address
    - It's called a "loopback" address
    - It's a machine referring to itself

- IPv4 addresses have 4 numbers divided by dots
    - The numbers go from 0 to 255; `0.0.0.0` to `255.255.255.255`

- IPv6 addresses are a bit more complex, such as
    - `2a02:810a:8c0:398c::b7f0`

- You might also have an internal or "LAN" address
    - Local Area Network
    - If you have a network at home with multiple computers
    - They can refer to each other using local addresses, often like
        - `192.168.0.1`
        - `192.168.1.1`
        - `10.0.0.1`

- Everyone, run the command `ip addr` - can you figure out your LAN address?

- That LAN is limited to your machines connected to your router
    - Your router will have an internal address too
    - And it will have an public or WAN address
    - Wide Area Network

- All of the machines on your LAN will share the same public address
    - `192.168.0.10` internal for machine A
    - `192.168.0.11` internal for machine B
    - `192.168.0.12` internal for machine C
    - `37.4.249.162` external shared for A, B and C
    - This technique is called NAT

- External/public addresses are owned and given by your Internet Service Provider
- Your public IP is usually fairly stable, but it can change over time

- 5 minute mini exercise
- Ask google "What is my IP"
- Copy the answer to https://whatismyipaddress.com/ip-lookup
- What can you find out?

## Networking concepts: DNS

- IP addresses are hard to remember (especially ipv6...)
- To help us silly humans with our bad memory we created DNS
    - Domain Name System

- A domain is a human readable and easier to remember web address
    - Instead of http://172.217.16.78
    - You can do http://google.com

- Put simply, DNS is basically a global database of Domain-to-IP records
    - google.com --> 172.217.16.78

    - There are multiple DNS servers globally
    - There are multiple organizations taking care of this

- The very last part of a domain is called the TLD; top level domain
    - What TLDs do you know of?
    - Different organizations govern these
    - Different countries govern these
    - They can make a fair bit of money from this too!

- You can register one of these domains
    - Do you know where?
    - For example, namecheap.com
    - Question: is glorpborgdorkhorp.org available 🤔?

- Remember one public IP can have multiple computers behind it
    - Local LAN of computers with local addresses
    - One global WAN with one address
    - One IP Address might actually have many domains registered to it
    - Yeah it gets complex, let's leave it here for now

- There are many, many different DNS servers
    - Your computer has a setting which DNS server will it use
    - Normally your router, which then selects where to actually ask
    - Usually this setting is always automatic
    - DNS servers actually have a lot of power
    - Google has a famous DNS server many people use; `8.8.8.8`


## Networking concepts: request - response

- Here's the steps in a little more detail
    1. You write `example.org` into your browser URL bar
    2. Your computer asks its configured DNS server "where is example.org"
    3. DNS answers "example.org is `93.184.215.14`"
    4. Your computer connects to 93.184.215.14
    5. Your computer makes a HTTP GET requests to 93.184.215.14 for example.org
    6. The server responds with the HTTP response containing a website (HTML)

- The IP 93.184.215.14 could very well have many different websites
    - It could also host `website.de`
    - In step 5 the server knows which one is requested

- In fact 93.184.215.14 could be even multiple computers
    - It could basically be a router using NAT for multiple servers!

## Wrap-up

- URL = web address
- HTTP = web protocol; set of communication rules for websites
- Computers have IP addresses
- DNS helps humans by giving names to IP addresses
- ChatGPT is like a virtual tutor
- You have to train your brain, even in the AI era :)

## Questions

- Have you done Markdown already?
- Have you edited files in the terminal?

- What is the benefit of having a VCS?
    - VCS = Version Control System

    - Track changes
    - Easy rollback to earlier versions
    - Work in a team
    - Testing new features
    - Working in branches, keeping the main branch clean
    - Different versions

- Alex How can I make a folder into a git repository
    - `git init`
- Raul I do `ls -a` and see the `.git` folder; what does that mean?
    - It means git has been initialized for that project
    - It contains?
        - version history
        - configuration
        - list of branches
- Olena What does a "branch" mean?
    - Another copy/version, which you can make new changes
    - Main branch, your own branch, you can see differences and merge changes
- Natalie How can I see what branch am I on?
    - `git branch`
    - `git status`
- Olga How do I make a commit?
    - `git add .` - add all files in the current folder and subfolders
    - `git commit -m "Comment here"`
- Mitali How do I create a new branch?
- Michael How can I see a list of pervious commits
- Marc What actually is a commit?
    - Commit you use to navigate through git
    - A change
        - A list of changes in a branch
        - What is the result of specific changes in a moment of time

- What is a good commit message like?
    - Descriptive, understandable

## Exercises

- Typing games: https://www.typingtest.com
- Typing games: https://www.typing.com/student/game/ztype
- Typing games: https://www.typing.com/student/game/tommyq
- Download and extract a `.zip` file (extract using the terminal!)
- Download and open a `.pdf` file (don't have to use the terminal here :))
- Download and open a `.docx` file, rename a file
- "Print" a website as a PDF
- Play a game, listen to an online radio, take a screenshot
- If you have a USB stick, save a file to it
- If you have a printer, connect it and print something
- Open and try out the calculator program
- Explore the settings of your laptop and various programs
- Change the wallpaper to a picture of Tux 🐧
- Play around with ChatGPT, just experiment with it a bit
- Does ChatGPT collect data from you? Do you agree with their privacy policy?
- **Bonus challenge 1** Record yourself (audio only)
- **Bonus challenge 2** Record yourself (video, audio)
- **Bonus challenge 3** Record your desktop (video, audio)
- **Bonus question 4** What do the terms and conditions for ChatGPT actually say?
