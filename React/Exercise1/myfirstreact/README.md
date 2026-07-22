# ReactJS-HOL 1 – Setting Up React Environment

## Objectives

- Define SPA and its benefits.
- Define React and understand how it works.
- Identify the differences between SPA and MPA.
- Explain the advantages and disadvantages of Single Page Applications.
- Understand the Virtual DOM.
- Learn the features of React.
- Set up a React development environment.
- Create a React application using `create-react-app`.

---


## 1. What is SPA (Single Page Application)?

A **Single Page Application (SPA)** is a web application that loads a single HTML page and dynamically updates the content without reloading the entire webpage.

### Benefits of SPA

- Faster navigation
- Better user experience
- Reduced server requests
- Smooth page transitions
- Efficient API communication
- Better performance after the initial load

---

## 2. What is React?

React is an **open-source JavaScript library** developed by **Meta (Facebook)** for building fast, interactive, and reusable user interfaces using components.

---

## 3. How React Works

React works using the following process:

1. Creates reusable UI components.
2. Builds a Virtual DOM.
3. Compares the updated Virtual DOM with the previous one.
4. Updates only the changed elements in the Real DOM.
5. Re-renders the UI efficiently.

---

## 4. Difference Between SPA and MPA

| Single Page Application (SPA) | Multi Page Application (MPA) |
|--------------------------------|------------------------------|
| Loads a single HTML page | Loads multiple HTML pages |
| No full page reload | Reloads the entire page |
| Faster navigation | Slower navigation |
| Better user experience | Traditional navigation |
| Communicates using APIs | Server returns complete pages |
| Examples: Gmail, Facebook, Twitter | Examples: Amazon, Flipkart, Banking Portals |

---

## 5. Advantages of SPA

- Fast loading after the first request
- Smooth user experience
- Less bandwidth usage
- Better caching
- Easy integration with REST APIs
- Reusable components

---

## 6. Disadvantages of SPA

- Higher initial loading time
- SEO is comparatively difficult
- Heavy JavaScript dependency
- Browser history management is more complex
- Security must be handled carefully

---

## 7. What is Virtual DOM?

The **Virtual DOM** is a lightweight copy of the Real DOM maintained by React.

Whenever the application state changes:

1. React creates a new Virtual DOM.
2. Compares it with the previous Virtual DOM (Diffing).
3. Finds only the modified elements.
4. Updates only those elements in the Real DOM.

This improves application performance significantly.

---

## 8. Features of React

- Component-Based Architecture
- Virtual DOM
- JSX (JavaScript XML)
- One-Way Data Binding
- Reusable Components
- High Performance
- Easy Maintenance
- Rich Ecosystem
- Strong Community Support
- Cross-platform development (using React Native)

---



# Commands Used

```bash
npx create-react-app myfirstreact
cd myfirstreact
npm start
```

---

# Result

The React environment was successfully set up using **create-react-app**. The application was executed successfully and displayed the following heading on the browser:

**"Welcome to the first session of React"**

This hands-on demonstrates the successful installation of React, creation of a React project, modification of the default component, and execution of the application.