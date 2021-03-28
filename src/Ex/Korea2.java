package Ex;

public class Korea2 {

    public static int calculator(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
    
    
    
    public static void main(String[] args) {

        int value = calculator(10, 5);       
        System.out.println(value);
        
        int value2 = calculator(20, 5);
        System.out.println(value2);
        
//        
//        String[] week = { "월", "화", "수", "목", "금", "토", "일" };
//
//        for (int i = 0; i < week.length; i++) {
//            // if( i == 5 ) {
//            if (week[i].equals("수")) {
//                System.out.printf(" %s 요일은 휴무입니다. 다음에 와주세요\n", week[i]);
//            } else {
//                System.out.printf("오늘은 %s 요일입니다. 영업합니다.\n", week[i]);
//            }
//        }

    }

}
