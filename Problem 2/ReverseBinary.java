
public class ReverseBinary {

    static Integer binaryReversal(String str){
        
        Integer input = Integer.parseInt(str, 10);
        String binaryStr = Integer.toBinaryString(input);
        int inputLength = binaryStr.length();

        int byteLength = 8 - (inputLength % 8);
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<byteLength; i++){
            sb.append("0");
        }
        binaryStr = inputLength % 8 != 0 ? sb.toString() + binaryStr : binaryStr;
        StringBuilder res = new StringBuilder();
        res.append(binaryStr);
        res.reverse();
        String temp = res.toString();
        Integer outcome = Integer.parseInt(temp,2); 
        return outcome;
    }
    public static void main(String[] args) {
        
        System.out.println(binaryReversal("23")); //reserse out put should be "232";
    }

}