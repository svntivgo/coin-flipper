import {React, Fragment, useState} from 'react'
import { fetchTirarMoneda } from "../actions/index";

export const From = () => {
  const { state, setState } = useState();
  return (
    <Fragment>
      <h1>Juego Tirar Moneda</h1>
      <img src='' alt=''/>
      <p>Para tirar la moneda presiona el botón</p>
      <button type="submit" onClick={fetchTirarMoneda(state)}>Tirar moneda</button>
    </Fragment>
  );
}

export default From
