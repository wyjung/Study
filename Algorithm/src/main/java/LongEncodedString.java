/**
 * Created by wyjung on 2017. 7. 5..
 */
public class LongEncodedString {


    // 알파벳은 함정이다. 결국 입력받은 숫자의 인덱스(숫자-1)에 위치한 곳에 카운트 만큼 +1 해주면 끝

    public static void main(String[] args) {

        //String test = "1226#24";
        //String test = "1(2)23(3)";
        //String test = "2110#(2)";
        String test = "23#(2)24#25#26#23#(3)";

        int[] result = encode(test);

        for (int i = 0; i < result.length; i++) {
            System.out.printf(result[i] + " ");
        }

    }

    private static int[] encode(String s) {

        int[] result = new int[26];

        for(int i = 0; result.length > i; i++) {
            result[i] = 0;
        }

        // str reader
        for( int i = s.length(); i > 0; i-- ) {
            String readChar = s.substring(i - 1, i);
            int count = 1;
            int alphabet = 1;

            // count
            if(readChar.equals(")")) {
                count = Integer.parseInt(s.substring(i - 2, i - 1));
                i = i - 3;
                readChar = s.substring(i - 1, i);
            }

            // alphabet
            if(readChar.equals("#")) {
                alphabet = Integer.parseInt(s.substring(i - 3, i - 1));
                i = i - 2;
            }
            else{
                alphabet = Integer.parseInt(s.substring(i - 1, i));
            }

            if(i == 0) {
                break;
            }
            result[alphabet - 1] = result[alphabet - 1] + count;
        }

        return result;
    }
}
