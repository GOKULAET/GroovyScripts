class Calculator {
        int number1;
        int number2;

int addition(){
return (number1+number2)
}
int subtraction(){
return (number1-number2)
}
int multiplication(){
return (number1*number2)
}
def division1(){
if (number2 == 0){
println " Division by zero is not possible"
return "infinite";
}else{
return (number1/number2)
}
}
def division2(){
try{
result = number1/number2
}catch (Exception e) {
println " Division by zero is not possible"
return "INFINITE";
}
}
}

//println "ENTER FIRST NUMBER" 
//println "ENTER SECOND NUMBER"
Calculator C = new Calculator(number1:5,number2:0)

println "Addtion of two numbers will be " + C.addition()
println "Subtraction of two numbers will be " + C.subtraction()
println "Multiplication of two numbers will be " + C.multiplication()
println "Division of two numbers will be " + C.division2()

