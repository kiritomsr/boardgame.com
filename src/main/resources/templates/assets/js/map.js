$(document).ready(function () {
    let communities = [];

    function initializeMap() {
        const map = new google.maps.Map(document.getElementById("map"), {
            zoom: 4,
            center: { lat: 39.5, lng: -98.35 },
        });

        communities.forEach((community) => {
            const marker = new google.maps.Marker({
                position: { lat: community.latitude, lng: community.longitude },
                map: map,
                title: community.name,
            });
        });
    }

    function loadGoogleMapsApi() {
        const script = document.createElement("script");
        script.src = "https://maps.googleapis.com/maps/api/js?key=AIzaSyB3xC4DGlPU8m9Ve671tiz21I_mnpojf10&callback=initMap";
        script.async = true;
        script.defer = true;
        document.body.appendChild(script);
    }

    $.ajax({
        url: "/api/communities",
        type: "GET",
        dataType: "json",
        success: function (data) {
            communities = data;
            loadGoogleMapsApi();
        },
        error: function (error) {
            console.error("Error fetching communities:", error);
        },
    });

    window.initMap = initializeMap;
});
