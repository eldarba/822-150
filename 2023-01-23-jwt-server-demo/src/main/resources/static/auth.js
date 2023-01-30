function register(email, password, firstName, lastName, userName, role) {
  // create a User object here
  let user = new User(0, email, password, firstName, lastName, userName, role);
  // convert object to JSON
  let userAsJson = JSON.stringify(user);
  let xhttp = new XMLHttpRequest();
  xhttp.onload = function () {
    if (this.status == 200) {
      // save token in the browser memory
      sessionStorage.setItem("token", this.response);
      document.getElementById("mode").innerHTML = "Logged In";
      document.getElementById("errorMsg").innerHTML = null;
    } else {
      let errorAsJson = this.response;
      let error = JSON.parse(errorAsJson);
      document.getElementById("mode").innerHTML = null;
      document.getElementById("errorMsg").innerHTML = error.message;
    }
  };
  let url = "http://localhost:8080/register";
  // inform the server that we send a JSON in the request body
  xhttp.open("POST", url);
  xhttp.setRequestHeader("Content-Type", "application/json");
  xhttp.send(userAsJson);
}
