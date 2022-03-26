import React, { Component } from "react";
import From from "../components/From";
import Result from "../components/Result";

class App extends Component {
  // component stateful
  render() {
    return (
      <div>
        <From />
        <Result />
      </div>
    );
  }
}

export default App;
