public class Sample {

    public static void main(String[] args){
        String s="trotoa";
        int result=0;
        for (int i=0;i<s.length()-1;i++){
            for (int j=i+1;j<s.length();j++){

                String substr=s.substring(i,j+1);
                if( substr.indexOf( substr.charAt(0))== substr.indexOf( substr.charAt(substr.length() -1))){
                   result++;
                }
            }
        }

        System.out.println(result);
    }
}
