// w.a.p to count the number of character.
class String_count_letter{
    public static void main(String arg[]){
        String str="hello world!";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count+=1;
            }
        }
        System.out.println("letter count: "+count);
    }
}
