package edu.handong.csee.java.hw2.math;

/**This is Calculating Class. There is many algorith to calculate.*/ 
public class MathCalculator{

    private String name;

 //sadnonvwepvqevmpeqvqpe

  

    /**This is setName method. which sets name. */
    public void setName(String a){
        name=a;
    }
    /**This is getName method. which gets name. */
    public String getName(){
        return name;
    }
    
    /**This is getMax method. which gets Max. */
    public int getMax(int a, int b){
        if(a>b)return a;
        if(a<b)return b;
        else return a;
    }
    /**This is getMin method. which gets Min. */
    public int getMin(int a, int b){
        if(a<b)return a;
        if(a>b)return b;
        else return a;

    }
    /**This is getAbs method. which gets Abs. */
    public int getAbs(int a){
        int b=(-1)*a;
        if(a<0)return b;
        else return a;


    }
    /**This is getSum method. which gets Sum. */
    public int getSum(int a, int b){
        return a+b;

    }
    /**This is getDiff method. which gets Diff. */
    public int getDiff(int a, int b){   
        if(a>b)return a-b;
        if(a<b)return b-a;
        else return a-b;

    }
    /**This is getProduct method. which gets Product. */
    public int getProduct(int a, int b){
        
        return a*b;

    }
    /**This is getQuotient method. which gets Quotient. */
    public int getQuotient(int a, int b){
        if(b==0){
            return b;

        }
        int c = a/b;
        return c;
    }
    /**This is getRemainder method. which gets remainder. */
    public int getRemainder(int a, int b){
        if(b==0){
            return a;
        }
        int c = a%b;
        return c;
    }
    /**This is getPower method. which gets Power. */
    public int getPower(int a, int b){
        int c=1;
        if(a==0)return a;
        if(b==0)return 1;
        for(int i=0;i<b;i++){
            c=c*a;

        }
        return c;
    
    }
    /**This is getFactorial method. which gets Factorial. */
    public int getFactorial(int a){
        int b=a;
        int c=a;
        for(int i=1;i<a;i++){
            c=c*(b-1);
            b--;
            if(b==0)break;
        }
        return c;
    }
    /**This is getGcd method. which gets Gcd. */
    public int getGcd(int a, int b){
        int n;
        if(a>b){
            while(true){
                n=a%b;
                if(n==0)break;
                else {
                    a=b;
                    b=n;
                }
            }
            return b;
        }
        if(a<b){
            while(true){
                n=b%a;
                if(n==0)break;
                else {
                    b=a;
                    a=n;
                }
            }
            return a;
        }
        if(a==0||b==0)return 0;
        else return a;
        
    }
    /**This is getLcm method. which gets Lcm. */
    public int getLcm(int a, int b){
        if(a==0)return a;
        if(b==0)return b;
        return a*b/getGcd(a,b);
    }
    /**This is getSquare method. which gets Square. */
    public int getSquare(int a){
        return a*a;
    }



}