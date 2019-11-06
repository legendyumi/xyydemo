import com.xyy.bean.Customer;

import java.util.ArrayList;

public class Main {
    //模板6： prsf:可生成 private static final
    //小寫變大寫  Ctrl+shift+u
    private static final Customer CUSTOMER = new Customer();
    //

    public static void main(String args[]) {
        System.out.println(11.5 + 45 + 25 + 1.5 + 5 + 1 + 3.5 + 1.7 + 2 + 5 + 6.6 + 1 + 8 + 1);
        System.out.println(11.5 + 45);
        System.out.println(480 - 50 - 16 - 26 - 334);

        String[] arr = new String[]{"aa", "bb", "cc"};
        //for
        //iter   增强for循环
        //itar  普通for循环
        //list.for   增强for循环
        //list.fori   普通for循环  顺序
        //list.forr    普通for循环  倒序

        for (String s : arr) {

        }


        //ifn
        ArrayList list = new ArrayList();
        list.add("0");
        list.add("1");
        list.add("2");
        //模板5 ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }

    }

    public void test() {
    }


}
