
import java.util.*;
import java.util.stream.Collectors;


public class StreamTest {
    public static void main(String[] args) {
        System.out.println("stream方法测试");

        Random random = new Random();

        random.ints().limit(10).sorted().forEach(System.out::println);

        System.out.println("-----------");
        List<String> strings=Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        strings.forEach(System.out::println);
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("空字符串数量为: " + count);

        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("筛选后的列表: " + filtered);

        System.out.println("-----------");

        List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);

        IntSummaryStatistics stats = integers.stream().mapToInt((x) ->x).summaryStatistics();
        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());
        System.out.println("随机数: ");


    }


}
