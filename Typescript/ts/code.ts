const x = 22;
{
    console.log(x);
    {
        const x = 33;
        console.log(x);
    }
    {
        const x = 55;
        console.log(x);
    }
}
console.log(x);