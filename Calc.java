class Calc {

     float addition(float operand_1,float operand_2){
         return(operand_1+operand_2);
     }
 
     float substraction(float operand_1,float operand_2){
         return(operand_1-operand_2);
     }
     
     float multiplication(float operand_1,float operand_2){
         return(operand_1*operand_2);
     }
     
     float division(float operand_1,float operand_2){
         return(operand_1/operand_2);
     }

     public static void main(String[] args){
         float operand_1=10;
         float operand_2=7;
         Calc c = new Calc();
         
         float add_result=c.addition(operand_1,operand_2);
         System.out.println("Addition result is : "+add_result);
       
         float sub_result=c.substraction(operand_1,operand_2);
         System.out.println("Substraction result is : "+sub_result);
 
         float mul_result=c.multiplication(operand_1,operand_2);
         System.out.println("Multiplication result is : "+mul_result);

         float div_result=c.division(operand_1,operand_2);
         System.out.println("Division result is : "+div_result);

 
     }
 }