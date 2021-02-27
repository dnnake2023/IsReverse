public class IsReverse{

public static void main(String[] args){
  System.out.println(isReverse("happy", "yppah")); //test cases
  System.out.println(isReverse("cool", "loac"));
  System.out.println(isReverse("", ""));
}

public static boolean isReverse(String s1, String s2){
  if(s1.length() != s2.length()){ //if the lengths of the first and second words are not equal, return false, because they can't be reverses
    return false;

  }else if(s1.equals("") && s2.equals("")){ //if first and second word both equal an empty string, return true, because that means they are a reverse of each other as well
    return true;
  }else{
    return s1.charAt(0) == s2.charAt(s2.length()-1) && isReverse(s1.substring(1), s2.substring(0, s2.length()-1)); //return a true/false statement (true if s1.charAt(0) == s2.charAt(s2.length()-1)) and recursively call the isReverse method
  }                                                               //substring from the (1) of the first word and another substring between the first character of s2 to the end
}
}
