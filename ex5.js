// user defined function

// without arg and without return value
function  DemoFun()
{
    console.log("This is User Defined Function");
}

// with arg and without return value
function  DemoFun1(x, y)
{
    console.log("X value ", x);
    console.log("Y value ", y);
}

// with arg and with return value
function  DemoFun2(x, y)
{
    console.log("X value ", x);
    console.log("Y value ", y);

    return (x+y);
}

// without arg and with return value
function  DemoFun3()
{
    let x = 10
    return (x*x*x);
}

// function callings

DemoFun();
console.log("End of Prog");
DemoFun1(10,20);
DemoFun1(11.45,22.67);
console.log("Addition ", DemoFun2(5,6));
console.log("10 Cube val ", DemoFun3());
