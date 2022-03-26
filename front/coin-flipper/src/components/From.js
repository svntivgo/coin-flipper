import {React, Fragment} from 'react'
import { fetchTirarMoneda } from "../actions/index";

export const From = () => {
  return (
    <Fragment>
      <h1>Juego Tirar Moneda</h1>
      <img src='' alt=''/>
      <p>Para tirar la moneda presiona el botón</p>
      <button type="submit" onClick={fetchTirarMoneda()}>Tirar moneda</button>
    </Fragment>
  );
}

export default From
