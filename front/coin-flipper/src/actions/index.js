export const fetchTirarMoneda = (state) => (dispatch) => {
  dispatch({ type: "view-loading" });

  return fetch(`http://localhost:8080/app/girar-moneda`, {
    method: "POST", // *GET, POST, PUT, DELETE, etc.
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({ list: state }), // body data type must match "Content-Type" header
  })
    .then((response) => response.json())
    .then((json) => {
      dispatch({ type: "random-result", data: json });
      dispatch({ type: "view-loaded" });
    });
};
