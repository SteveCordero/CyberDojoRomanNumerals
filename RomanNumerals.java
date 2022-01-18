public class RomanNumerals {

    public static String answer(int num) {
        String ans = "";
        
        if(num < 5000 && num > 0)
        {
            for(int i = 0; i < num/1000; i++)
            {
                if(num < 5000)
                {
                    ans+="M";   
                }

            }
        
            num = num % 1000;
            //this if for the hundred place
            for(int i = 0; i < num/100;i++)
            {
                if(num/100 < 4 || (num/100 > 5 && i >= 5 && num/100 <9))
                {
                    ans+="C";   
                }
                else if(num/100 == 4 && i == 3)
                {
                    ans+="CD";   
                }
                else if(num/100 >= 5 && num/100 < 9 && i >=4)
                {
                    ans+="D";   
                }
                else if(i==8)
                {
                    ans+="CM";   
                }
            }

            num = num % 100;
            //this is the for loop for the tens place
            for(int i = 0; i < num/10; i++)
            {
                if(num/10 < 4 || (num/10 > 5 && i >= 5 && num/10 <9))
                {
                    ans+="X";   
                }
                else if(num/10 == 4 && i == 3)
                {
                    ans+="XL";
                }
                else if(num/10 >= 5 && i >=4 && num/10 < 9)
                {
                    ans+="L";   
                }
                else if(i == 8)
                {
                    ans+="XC";   
                }

            }


            num = num % 10;
            //this is the for loop for the ones place
            for(int i = 0; i < num;i++)
            {
                if(num < 4 || i > 4 && num < 9)
                {
                    ans +="I";
                }
                else if(i == 3 && num == 4)
                {
                    ans +="IV";
                }
                else if(i == 4 && num >= 5 && num < 9)
                {
                    ans +="V";   
                }
                else if(i == 8)
                {
                    ans+= "IX";
                }
            }
        }
        
        else
        {
          ans = "Cant Be A Roman Numeral";   
        }
        
        return ans;
    }
}
