# ReactJS-HOL 4 – React Component Lifecycle (Blog Application)

## Objectives

- Explain the need and benefits of the React Component Lifecycle.
- Identify various lifecycle hook methods.
- Understand the sequence of steps involved in rendering a component.
- Implement `componentDidMount()`.
- Implement `componentDidCatch()`.

---

## 1. What is the React Component Lifecycle?

The React Component Lifecycle is the sequence of stages a component goes through from its creation until it is removed from the application. Lifecycle methods allow developers to perform actions at different stages of a component's life.

---

## 2. Benefits of Component Lifecycle

- Initialize component data.
- Fetch data from APIs.
- Update UI automatically.
- Handle errors gracefully.
- Improve application performance.
- Perform cleanup before removing components.

---

## 3. Lifecycle Phases

### Mounting

The component is created and inserted into the DOM.

Important methods:

- constructor()
- render()
- componentDidMount()

---

### Updating

Occurs whenever the component's state or props change.

Methods include:

- shouldComponentUpdate()
- render()
- componentDidUpdate()

---

### Unmounting

Occurs when the component is removed from the DOM.

Method:

- componentWillUnmount()

---

### Error Handling

Handles errors that occur during rendering.

Method:

- componentDidCatch()

---

## 4. constructor()

The constructor initializes the component state.

Example:

```javascript
constructor(props){
    super(props);

    this.state={
        posts:[]
    };
}
```

---

## 5. componentDidMount()

The `componentDidMount()` method is executed immediately after the component is rendered for the first time.

It is commonly used to:

- Fetch API data
- Initialize timers
- Load external resources

Example:

```javascript
componentDidMount(){
    this.loadPosts();
}
```

---

## 6. componentDidCatch()

The `componentDidCatch()` method catches runtime errors in child components and prevents the application from crashing.

Example:

```javascript
componentDidCatch(error, info){
    alert(error);
}
```

---

## 7. Fetch API

The application retrieves blog posts using the following API:

```
https://jsonplaceholder.typicode.com/posts
```

The response is converted into JSON and stored inside the component state.

---

## 8. State in React

State is an object that stores data managed by a component.

Example:

```javascript
this.state = {
    posts: []
};
```

Whenever the state changes, React automatically re-renders the component.

---

## 9. render() Method

The `render()` method returns the JSX that should be displayed on the webpage.

Example:

```jsx
render() {
    return (
        <div>
            <h1>Blog Posts</h1>
        </div>
    );
}
```

---

# Commands Used

```bash
npx create-react-app blogapp
cd blogapp
npm start
```

---

# Result

A React application named **blogapp** was successfully created.

A class component named **Posts** was implemented to fetch blog posts from the JSONPlaceholder REST API using the Fetch API. The application utilized the `componentDidMount()` lifecycle method to load data after the component was mounted and implemented `componentDidCatch()` for error handling.

The blog posts were successfully displayed on the webpage, demonstrating the working of React lifecycle methods and component rendering.