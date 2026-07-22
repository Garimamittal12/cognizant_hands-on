# ReactJS-HOL 2 – React Components (Student Management Portal)

## Objectives

- Explain React Components.
- Identify the differences between Components and JavaScript Functions.
- Understand the types of React Components.
- Explain Class Components.
- Explain Function Components.
- Understand the Component Constructor.
- Explain the `render()` function.
- Create and render multiple React components.

---

## 1. What is a React Component?

A React Component is an independent and reusable piece of code that returns a part of the user interface (UI). Components help organize the application into smaller, manageable, and reusable sections.

---

## 2. Difference Between React Components and JavaScript Functions

| React Component | JavaScript Function |
|-----------------|---------------------|
| Returns JSX (UI elements) | Returns values or performs operations |
| Used to build user interfaces | Used for general programming logic |
| Can maintain state (Class Components) | Cannot maintain React state |
| Reusable UI building blocks | Reusable logic blocks |

---

## 3. Types of React Components

React provides two types of components:

### 1. Class Components

- Created using ES6 classes.
- Extend `React.Component`.
- Use the `render()` method.
- Can use state and lifecycle methods.

Example:

```jsx
class Home extends React.Component {
  render() {
    return <h1>Home</h1>;
  }
}
```

---

### 2. Function Components

- Created using JavaScript functions.
- Simpler and easier to write.
- Can use Hooks to manage state.

Example:

```jsx
function Home() {
  return <h1>Home</h1>;
}
```

---

## 4. What is a Constructor in React?

A constructor is a special method used to initialize the state and bind methods in a class component.

Example:

```jsx
constructor(props) {
    super(props);
    this.state = {};
}
```

The constructor is executed when the component is created.

---

## 5. What is the render() Function?

The `render()` method is a mandatory method in every class component.

It returns the JSX that should be displayed on the webpage.

Example:

```jsx
render() {
    return (
        <h1>Hello React</h1>
    );
}
```

---

## 6. Advantages of React Components

- Code Reusability
- Easy Maintenance
- Better Organization
- Modular Development
- Faster Development
- Easier Testing
- Improved Readability

---

# Commands Used

```bash
npx create-react-app StudentApp
cd StudentApp
npm start
```

---

# Result

A React application named **StudentApp** was successfully created.

Three class components (**Home**, **About**, and **Contact**) were created and rendered successfully through **App.js**.

The application displayed the following messages:

- Welcome to the Home page of Student Management Portal
- Welcome to the About page of the Student Management Portal
- Welcome to the Contact page of the Student Management Portal

This hands-on demonstrates the creation of multiple class components and rendering them in a React application.