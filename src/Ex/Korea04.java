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
        
        System.out.println(susiGrade.getName() + "의 평균 점수 : " + susiGrade.avarage());
        //System.out.println(susiGrade.name + "의 평균 점수 : " + susiGrade.avarage());
        
                
//        System.out.printf("이름: %s 영어점수 %02d점 수학점수 %02d점\n", name, englishscore, mathscore);
//        System.out.printf("총점 : %02d점\n", result);
        
    }

}
