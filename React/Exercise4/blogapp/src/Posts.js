import React from "react";
class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: []
        };
    }
    loadPosts() {
    }
    componentDidMount() {
    }
    render() {
    return (
        <h1>Blog Posts</h1>
    );
}
    componentDidCatch(error, info) {
    }
}

export default Posts;