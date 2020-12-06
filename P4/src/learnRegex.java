package src;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class learnRegex {


    public static void main( String args[] ){

        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK1? yes for7000! O2?";
        String pattern0="(\\D*)(\\d+)([!?]*)";
        String pattern1 = "\\D*\\d+";

        // 创建 Pattern 对象
        Pattern p = Pattern.compile(pattern0);

        // 现在创建 matcher 对象
        Matcher m = p.matcher(line);
//        if (m.find( )) {
//            System.out.println("Found value: " + m.group(0) );
//            System.out.println("Found value: " + m.group(1) );
//            System.out.println("Found value: " + m.group(2) );
//            System.out.println("Found value: " + m.group(3) );
//        } else {
//            System.out.println("NO MATCH");
//        }
        System.out.println("pattern0:");
        while (m.find()){
            System.out.println("groupCount="+m.groupCount());
            System.out.println(m.group());

        }

        Pattern p1=Pattern.compile(pattern1);
        Matcher m2=p1.matcher(line);
        System.out.println("\n pattern1:");
        while (m2.find()){
            System.out.println("groupCount="+m2.groupCount());
            System.out.println(m2.group());

        }

        List<Integer> ls=new ArrayList<>();
        ls.add(10);
        ls.add(100);
        ls.add(1000);
        for(int i=0;i<ls.size();i++){
            System.out.println(ls.get(i));
        }
        for(int i:ls){
            System.out.println(i);
        }

    }
}
