# ReactJS-HOL 3 – Function Components (Score Calculator App)

## Objectives

- Explain React Components.
- Identify the differences between Components and JavaScript Functions.
- Understand the types of React Components.
- Explain Function Components.
- Understand the Component Constructor.
- Explain the `render()` function.
- Create and render a Function Component.
- Apply CSS styling to React Components.

---


## 1. What is a React Component?

A React Component is an independent and reusable piece of code that represents a part of the user interface. Components make applications modular and easier to maintain.

---

## 2. Difference Between React Components and JavaScript Functions

| React Component | JavaScript Function |
|-----------------|---------------------|
| Returns JSX (UI elements) | Returns values or performs operations |
| Used to create user interfaces | Used for general programming logic |
| Can receive props and manage state | Cannot manage React state directly |
| Reusable UI blocks | Reusable logic blocks |

---

## 3. Types of React Components

React supports two types of components:

### Class Component

- Created using ES6 classes.
- Extends `React.Component`.
- Uses the `render()` method.
- Can maintain state and lifecycle methods.

### Function Component

- Created using JavaScript functions.
- Simpler and easier to write.
- Accepts data through **props**.
- Can use Hooks to manage state.

---

## 4. What is a Constructor?

A constructor is a special method used in class components to initialize state and bind methods.

Example:

```jsx
constructor(props) {
    super(props);
    this.state = {};
}
```

Function components do not use constructors.

---

## 5. What is render()?

The `render()` method is used in class components to return the JSX that should be displayed on the webpage.

Example:

```jsx
render() {
    return <h1>Hello React</h1>;
}
```

Function components return JSX directly and do not require a `render()` method.

---

## 6. Advantages of Function Components

- Simple syntax
- Easy to understand
- Better readability
- Improved performance
- Reusable components
- Supports Hooks for state management

---

## 7. Props in React

Props (Properties) are read-only inputs passed from a parent component to a child component.

In this project, the following props are passed:

- Name
- School
- Total Marks
- Goal (Number of Subjects)

The average score is calculated using:

```
Average = Total / Goal
```

---

# Commands Used

```bash
npx create-react-app scorecalculatorapp
cd scorecalculatorapp
npm start
```

---

# Result

A React application named **scorecalculatorapp** was successfully created.

A **Function Component** named **CalculateScore** was developed to accept the student's **Name**, **School**, **Total Marks**, and **Goal (Number of Subjects)** as props. The component calculated the average score and displayed the student details with CSS styling.

The application executed successfully and displayed the calculated average score on the browser.