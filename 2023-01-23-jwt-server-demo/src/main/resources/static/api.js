function callGreet() {
  let url = "http://localhost:8080/api/greet";
  let xhttp = new XMLHttpRequest();
  xhttp.onload = function () {
    if (this.status == 200) {
      handleSuccessMsg(this);
    } else {
      handleErrorMsg(this);
    }
  };

  xhttp.open("GET", url);
  // add the token to the request
  xhttp.setRequestHeader(
    "Authorization",
    "Bearer " + sessionStorage.getItem("token")
  );
  xhttp.send();
}
