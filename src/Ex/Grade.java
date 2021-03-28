package Ex;

class Grade {

    private String name;
    private int mathscore;
    private int englishscore;
//    String name;
//    int mathscore;
//    int englishscore;
    
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMathscore() {
        return mathscore;
    }
    public void setMathscore(int mathscore) {
        this.mathscore = mathscore;
    }
    public int getEnglishscore() {
        return englishscore;
    }
    public void setEnglishscore(int englishscore) {
        this.englishscore = englishscore;
    }
    
    public int avarage() {
        
        int result = (this.englishscore + this.mathscore) / 2; 
        
        return result;
    }

    public int avarage(int mathScore, int englishScore) {
        
       int result = (mathScore + englishScore) / 2; 
       
       return result;
    }
    
}
