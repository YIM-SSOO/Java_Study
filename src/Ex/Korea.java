package Ex;

public class Korea {

    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            System.out.println("===============");
            System.out.println(i +"단을 시작합니다");
            System.out.println("===============");

            for (int j = 1; j < 10; j++) {
              
               System.out.printf("%d 곱하기  %d = %d\n", i, j, i*j);
            }
            System.out.println("===============");
            System.out.println(i+"단이 끝났습니다.");
            System.out.println("===============");
            if( i == 9) {
                System.out.println("구구단이 끝났습니다.");
                
            }
            
            System.out.println();
        }

    }

}
