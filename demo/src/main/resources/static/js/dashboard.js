const map = L.map('map', {
    zoomControl: false
}).setView([28.5895, 77.4305], 14);

L.control.zoom({
    position: 'bottomright'
}).addTo(map);

const osm = L.tileLayer(
    'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
    {
        maxZoom: 19,
        attribution: '&copy; OpenStreetMap contributors'
    }
);

osm.addTo(map);