// console.log(this)
console.log("hello")
// console.log(window)
// console.log(document)
// console.log(this==global)
// console.log(global)

let foo="hello foo";
console.log(foo)
console.log(global.foo)

setTimeout(()=>{
    console.log("After 3 Sec "+foo);
},3000)