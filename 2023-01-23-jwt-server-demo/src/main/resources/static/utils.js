function handleSuccessMsg(xhttp) {
  document.getElementById("successMsg").innerHTML = xhttp.response;
  document.getElementById("errorMsg").innerHTML = null;
}

function handleErrorMsg(xhttp) {
  let errorAsJson = xhttp.response;
  let error = JSON.parse(errorAsJson);
  document.getElementById("successMsg").innerHTML = null;
  document.getElementById("errorMsg").innerHTML = error.message;
}
