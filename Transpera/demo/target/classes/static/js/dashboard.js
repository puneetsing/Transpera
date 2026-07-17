// Create Map


const map = L.map('map', {

    zoomControl:false

}).setView(
    [28.5728, 77.4286]
);

// Zoom position

L.control.zoom({

    position:'bottomright'

}).addTo(map);

// Layers


const osm = L.tileLayer(

'https://tile.openstreetmap.org/{z}/{x}/{y}.png'

);

const satellite = L.tileLayer(

'https://server.arcgisonline.com/ArcGIS/rest/services/World_Imagery/MapServer/tile/{z}/{y}/{x}'

);

const labels = L.tileLayer(

'https://{s}.basemaps.cartocdn.com/light_only_labels/{z}/{x}/{y}.png',

{

subdomains:'abcd'

}

);

const satelliteWithLabels = L.layerGroup([

    satellite,

    labels

]);

const terrain = L.tileLayer(

'https://tile.opentopomap.org/{z}/{x}/{y}.png'

);

// Default map
osm.addTo(map);

// Layer switcher
L.control.layers(
{

    "Normal":osm,

    "Satellite":satelliteWithLabels,

    "Terrain":terrain

},

null,

{

position:'bottomright'

}

).addTo(map);

// Example vehicle marker


L.marker(

[28.5895,77.4305]

)
.addTo(map)
.bindPopup(
"Vehicle Location"

);