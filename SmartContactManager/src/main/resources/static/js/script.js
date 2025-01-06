console.log("Script loaded ...  ")

let currentTheme = getTheme();

// Initially run
changeTheme(changeTheme)

function changeTheme() {
    // set to web page
    document.querySelector('html').classList.add(currentTheme);

    // set the listener to change the theme by button
    const changeThemeButton = document.querySelector('#theme_change_button');
    changeThemeButton.querySelector("span").textContent = currentTheme == 'light' ? "dark" : "light";
    changeThemeButton.addEventListener("click", (event) => {
        //document.querySelector('html').classList.remove(changeTheme);
        const oldTheme = currentTheme;
        console.log("change theme button clicked");
        if (currentTheme == "dark") {
            changeTheme = "light";
        } else {
            changeTheme = "dark";
        }

        // local storage update
        setTheme(changeTheme);
        // remove the curret theme
        document.querySelector('html').classList.remove(oldTheme);
        // set the current theme
        document.querySelector('html').classList.add(currentTheme);
        window.location.reload()

        // change the text of button
        changeThemeButton.querySelector("span").textContent = currentTheme == 'light' ? "dark" : "light";

    });
}

// set theme to localStorage
function setTheme(theme) {
    localStorage.setItem("theme", theme);
}

// get theme to localStorage
function getTheme() {
    let theme = localStorage.getItem("theme");
    return theme ? theme : "light";
}

// change current 
function changePageTheme(){

}