class User {
  constructor(id, email, password, firstName, lastName, username, role) {
    this.id = id;
    this.email = email;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.role = role;
  }
}

class UserCredentials {
  constructor(email, password) {
    this.email = email;
    this.password = password;
  }
}
