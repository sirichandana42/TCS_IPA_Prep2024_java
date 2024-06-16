
//even numbers
import java.util.*;
public class practise 

    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int count=0,x=0;
            while(n>0)
            {
                x=n%10;
                if(x%2==0) count++;
                n=n/10;
            }
            
            if(count<3)
            System.out.print("it isnt a valid number");
            else
            System.out.print(count);
        }
    }
    
//lower and upper count
    import java.util.*;
    public class practise{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            int cupper=0,clower=0;
            for(int i=0;i<s.length();i++)
            {
                char chr=s.charAt(i);
                if(Character.isLetter(chr))
                {
                if(Character.isUpperCase(chr))
                {
                    cupper++;
                }
                else
                clower++;
            }
        }
            System.out.println(cupper);
            System.out.print(clower);
        }
    }
        
//whitespaces count
import java.util.*;
public class practise{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); 
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char chr=str.charAt(i);
            if(Character.isWhitespace(chr))
            {
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}

//reverse a string

import java.util.*;
public class practise{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        str=str.toLowerCase();
        StringBuilder str2= new StringBuilder(str).reverse();
        System.out.print(str2);
    }
}

//unique elements in string
import java.util.*;

public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        Set<Character> seen = new HashSet<>();
        StringBuilder uniqueStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && !seen.contains(ch)) {
                seen.add(ch);
                uniqueStr.append(ch);
            }
        }
        System.out.print(uniqueStr.toString());
    }
}

//palindromic string in array of strings

import java.util.*;

public class practise {

    public static boolean palindromicString(String s) {
        StringBuilder ps= new StringBuilder(s).reverse();
        String cmp=ps.toString();
        return s.equals(cmp);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
    
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            if (palindromicString(arr[i])) {
                System.out.println(arr[i]);
            }
        }
        
        sc.close();
    }
}


