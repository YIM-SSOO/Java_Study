package Ex;

public class Korea04 {

    public static void main(String[] args) {
       
        Grade susiGrade = new Grade();
        Grade namiGrade = new Grade();
        
//        int result;
//        String name;
//        int mathscore;
//        int englishscore;
        
        susiGrade.setName("susi");
        susiGrade.setEnglishscore(100);
        susiGrade.setMathscore(80);
        
        namiGrade.setName("nam");
        namiGrade.setEnglishscore(90);
        namiGrade.setMathscore(80);
        
        System.out.println(susiGrade.getName() + "�� ��� ���� : " + susiGrade.avarage());
        //System.out.println(susiGrade.name + "�� ��� ���� : " + susiGrade.avarage());
        
                
//        System.out.printf("�̸�: %s �������� %02d�� �������� %02d��\n", name, englishscore, mathscore);
//        System.out.printf("���� : %02d��\n", result);
        
    }

}
