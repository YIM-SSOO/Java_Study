package Ex;

public class Korea {

    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            System.out.println("===============");
            System.out.println(i +"���� �����մϴ�");
            System.out.println("===============");

            for (int j = 1; j < 10; j++) {
              
               System.out.printf("%d ���ϱ�  %d = %d\n", i, j, i*j);
            }
            System.out.println("===============");
            System.out.println(i+"���� �������ϴ�.");
            System.out.println("===============");
            if( i == 9) {
                System.out.println("�������� �������ϴ�.");
                
            }
            
            System.out.println();
        }

    }

}
