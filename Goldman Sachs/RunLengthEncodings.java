class GfG
 {
	String encode(String str)
	{
          //Your code here
          String ans ="";
          int k = 1;
          ans = ans + str.charAt(0);
          for(int i = 1; i<str.length(); i++){
              
              if(str.charAt(i-1) == str.charAt(i)){
                  k++;
              }
              else{
                  ans = ans + k;
                  ans = ans + str.charAt(i);
                  k = 1;
              }
          }
          return ans + k;
	}
	
 }
