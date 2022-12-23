function Add(num1 , num2){
    return num1+num2;
}
function Subtract(num1 , num2){
    return num1-num2;
}
function Divide(num1 , num2){
    return num1/num2;
}
function Multiply(num1 , num2){
    return num1*num2;
}
function calculator(num1 , num2 , operator){
    return operator(num1 , num2);
}
var buttonlength = document.querySelectorAll("button").length;
for(var i = 0 ; i < buttonlength ; ++i){
    document.querySelectorAll("button")[i].addEventListener("click" , function(){
        var firstNum = parseInt(document.getElementsByName('fnum')[0].value);
        var secondNum = parseInt(document.getElementsByName('snum')[0].value);
        var operation_name = this.innerHTML;
        var result = 0;
        switch(operation_name){
            case "Add":
                result = calculator(firstNum , secondNum , Add);
            break;

            case "Multiply":
                result = calculator(firstNum , secondNum , Multiply);
            break;

            case "Divide":
                result = calculator(firstNum , secondNum , Divide);
            break;

            case "Subtract":
                result =  calculator(firstNum , secondNum , Subtract);
            break;

            default:
                result = 0;
                console.log(operation_name);
        }
        alert("The answer is " +result);
    })
}
