import React, { useContext } from "react";
import { onlineStore } from "../App";

function CompA()
{
    const [shop, setShop] = useContext(onlineStore);
    return(
        <div>
            <h1>Online Store</h1>
            <h1>No of Products : {shop.length}</h1>
        </div>
    );
}

export default CompA;