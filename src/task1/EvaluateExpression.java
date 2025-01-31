package task1;

public class EvaluateExpression {

    public static  int  evaluateExpression(String expression){
        if(expression== null|| expression.isEmpty()){
            return -1;
        }

        int result = 0;
        int num =0;
        char sign='+';
        for (int i = 0; i<expression.length(); i++){
            char c = expression.charAt(i);
            if(Character.isDigit(c)){
                num= num*10+(c-'0');
            }

            if(!Character.isDigit(c)|| i==expression.length()-1){
                if(sign=='+'){
                    result+=num;
                }else if(sign=='-'){
                    result-=num;
                }
                sign=c;
                num=0;
            }
        }
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
