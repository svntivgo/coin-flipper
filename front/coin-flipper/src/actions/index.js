export const fetchTirarMoneda = (state) => (dispatch) => {
  // dispatch({ type: "view-loading" });

  return fetch(`http://localhost:8080/app/girar-moneda`, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({  }), // body data type must match "Content-Type" header
  })
    .then((response) => response.json())
    .then((json) => {
      console.log(json)
      // dispatch({ type: "random-result", data: json });
      // dispatch({ type: "view-loaded" });
    });
};
