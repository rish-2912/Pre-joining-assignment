/**
 *
 */
let validation = false;
function validateRegisterForm() {
  let username = document.forms["registerForm"]["username"].value;
  let password = document.forms["registerForm"]["password"].value;
  let email = document.forms["registerForm"]["email"].value;
  if (validation === false) {
    alert("Fulfil the requirements for password");
    return false;
  }
  if (username == "" || password == "" || email == "") {
    alert("All fields must be filled");
    return false;
  }
  return true;
}

function validatePassword() {
  let password = document.getElementById("password").value;
  if (password.length >= 8) {
    const ele = document.getElementById("char");
    ele.style.color = "green";
    validation = true;
  } else {
    validation = false;
    const ele = document.getElementById("char");
    ele.style.color = "red";
  }

  if (!/[A-Z]/.test(password)) {
    const ele = document.getElementById("capital");
    ele.style.color = "red";
    validation = false;
  } else {
    const ele = document.getElementById("capital");
    ele.style.color = "green";
    validation = true;
  }

  if (!/[0-9]/.test(password)) {
    const ele = document.getElementById("digit");
    ele.style.color = "red";
    validation = false;
  } else {
    const ele = document.getElementById("digit");
    ele.style.color = "green";
    validation = true;
  }
}

document.getElementById("password").addEventListener("input", validatePassword);
