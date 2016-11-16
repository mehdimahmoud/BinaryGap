import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by mehdi on 15/11/16.
 */
public class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String bin = Integer.toBinaryString(N);
        System.out.println("N = "+N +" ; "+ "bin = "+ bin);
        String[] tab = bin.split("1");
        for (String t:tab) {
            System.out.println("t = "+t);
        }
        Optional<String> c = Stream.of(tab).filter(l->!l.isEmpty() || (!l.contains("0"))).max(Comparator.comparingInt(String::length));
        System.out.println(" c = " + c.orElse(""));
        System.out.println(" size c = " + c.orElse("").length());
        return c.orElse("").length();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(20);
        s.solution(1041);
        s.solution(529);
        s.solution(545);
        s.solution(2147483647);
        s.solution(15);
    }
}
