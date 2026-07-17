function togglepassword() {
    let passwordfield = document.getElementById("password");
    if (passwordfield.type === "password") {
        passwordfield.type = "text";
    } else {
        passwordfield.type = "password";
    }
}