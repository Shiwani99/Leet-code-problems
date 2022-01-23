class Solution {
    public String intToRoman(int num) {
        
        String[] arr=new String[]   {"I","II","III","IV","V","VI","VII","VIII","IX","X","XX","XXX","XL","L","LX","LXX",
                             "LXXX","XC","C","CC","CCC","CD","D","DC","DCC","DCCC","CM","M","MM","MMM"};
        
        String arr2;
        String arr3;
        String arr4;
        String arr5;
        
        arr2="";
        arr3="";
        arr4="";
        arr5="";
        
        int o_n,rem,ones=0,tens=9,hund=18,thous=27,f=0,i;
        o_n=num;
        
        while(o_n>0)
        {
            rem=o_n%10;
            
            if(f==0 && rem!=0)
                arr2=arr2+arr[ones+(rem-1)];
            else if(f==1 && rem!=0)
                arr3=arr3+arr[tens+(rem-1)];
            else if(f==2 && rem!=0)
                arr4=arr4+arr[hund+(rem-1)];
            else if(f==3 && rem!=0)
                arr5=arr5+arr[thous+(rem-1)];
            
            f=f+1;
            
            o_n=o_n/10;
        }
        
        arr5=arr5+arr4+arr3+arr2;
        return arr5;
    }
}