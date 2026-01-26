
import React from "react";

function Test2(props)
{
    let APcities = ["Amaravathi", "Vizag", "Nellore"]
    let TSCities = ["Hyderabad", "Warangal", "KarimNagar"]

    let cities = [...APcities, ...TSCities];
    return(
        <div>
            <h2>Test2 Component</h2>
            <h2>Data From Test 1 Component : {props.sname}</h2>

            <h3>AP Cities : {APcities}</h3>
            <h3>TS Cities : {TSCities}</h3>
            <h3> Cities : {cities}</h3>
        </div>
    );
}

export default Test2;
