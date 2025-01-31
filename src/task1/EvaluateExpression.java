package task1;

public class EvaluateExpression {

    public static  int  evaluateExpression(String expression){
        // cheek string not to be null
        if(expression== null|| expression.isEmpty()){
            return -1;
        }
    // declaring variables to track numbers
        int result = 0;
        int num =0;
        char sign='+';
        //looping through string to extract numbers and chars and make sum
        for (int i = 0; i<expression.length(); i++){
            char c = expression.charAt(i);

            // checking if it is digit
            if(Character.isDigit(c)){

                // converting char to number
                num= num*10+(c-'0');
            }

     // checking if it is mathematical sign or last element
            if(!Character.isDigit(c)|| i==expression.length()-1){
                //make adding or subtracting based on assigned value to sign
                if(sign=='+'){
                    result+=num;
                }else if(sign=='-'){
                    result-=num;
                }
                // updating sing and number
                sign=c;
                num=0;
            }
        }
        // returning sum
        return result;
    }


    // method is valid if we want just to add

    public static int evaluateExpressionAdding(String expression){
        if(expression== null){
            return -1;
        }
        String[ ] digits = expression.split("\\+");
        int result = 0;
        for(String  digit : digits){

            result+=Integer.parseInt(digit);
        }

        return result;
    }
}
