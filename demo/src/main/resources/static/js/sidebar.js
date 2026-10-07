document.addEventListener("DOMContentLoaded", function () {

    const sidebar = document.getElementById("sidebar");
    const menuButton = document.getElementById("menuButton");
    const closeSidebar = document.getElementById("closeSidebar");
    const sidebarOverlay = document.getElementById("sidebarOverlay");

    menuButton.addEventListener("click", function () {

        sidebar.classList.add("open");
        sidebarOverlay.classList.add("active");

    });

    closeSidebar.addEventListener("click", function () {

        sidebar.classList.remove("open");
        sidebarOverlay.classList.remove("active");

    });

    sidebarOverlay.addEventListener("click", function () {

        sidebar.classList.remove("open");
        sidebarOverlay.classList.remove("active");

    });

    document.addEventListener("keydown", function (event) {

        if (event.key === "Escape") {

            sidebar.classList.remove("open");
            sidebarOverlay.classList.remove("active");

        }

    });

});