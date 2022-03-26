import React from "react";
import { connect } from "react-redux";
import cara from "../img/foto-1.jpg";
import sello from "../img/foto-2.jpg";
const Result = (props) => {
  let rutaFoto = ""
  switch (props.result) {
    case 1:
      rutaFoto = cara;
      break;
    case 2:
      rutaFoto = sello;
      break;
    default:
      break;
  }
  return (
    <div className="d-flex flex-row bd-highlight mb-3">
      <img src={rutaFoto} alt="" className="img-thumbnail mx-auto" />
    </div>
  );
};

const stateMapToPros = (state) => {
  return {
    result: state.random.result?.ladoMoneda,
  };
};

export default connect(stateMapToPros)(Result);
