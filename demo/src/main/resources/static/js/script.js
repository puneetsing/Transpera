
document.addEventListener("DOMContentLoaded", () => {
    const sidebar = document.getElementById("sidebar");
    const openBtn = document.getElementById("openSidebarBtn");
    const closeBtn = document.getElementById("toggleBtn");

    if (!sidebar || !openBtn || !closeBtn) {
        console.error("Sidebar elements not found:", {
            sidebar,
            openBtn,
            closeBtn
        });
        return;
    }

    function openSidebar() {
        sidebar.classList.remove("collapsed");
        openBtn.hidden = true;
    }

    function closeSidebar() {
        sidebar.classList.add("collapsed");
        openBtn.hidden = false;
    }

    openBtn.addEventListener("click", openSidebar);
    closeBtn.addEventListener("click", closeSidebar);

    // Start with the sidebar open.
    openSidebar();
});