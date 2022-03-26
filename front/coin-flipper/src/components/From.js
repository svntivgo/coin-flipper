import React, { useState, Fragment } from "react";
import { connect } from "react-redux";
import { fetchTirarMoneda } from "../actions";

const From = (props) => {
  // component stateless
  const [state, setState] = useState();
  const onSubmit = (e) => {
    e.preventDefault();
    props.dispatch(fetchTirarMoneda(state));
  };
  return (
    <Fragment>
      <h1 className="text-center mt-5">Juego Tirar Moneda</h1>
      <img src="" alt="" />
      <form
        onSubmit={onSubmit}
        className="d-flex flex-column bd-highlight mb-3"
      >
        <label htmlFor="list" className="text-center">
          Presiona para lanzar la moneda
        </label>
        <br />
        <button
          type="submit"
          className="btn btn-dark mx-auto"
          disabled={props.loading}
        >
          Tirar moneda
        </button>
      </form>
    </Fragment>
  );
};

const stateMapToPros = (state) => {
  return {
    loading: state.view.loading,
  };
};

export default connect(stateMapToPros)(From);
