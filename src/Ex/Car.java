package Ex;

class Car {

    private String carname;
    private String catbrand;
    private int maxspeed;
    
    public Car() {
        // 기본 생성자
    }
    
    public Car(String carname, String catbrand, int maxspeed) {
        this.setCarname(carname);
        this.setCatbrand(catbrand);
        this.setMaxspeed(maxspeed);
    }
    
    public String getCarname() {
        return carname;
    }
    public void setCarname(String carname) {
        this.carname = carname;
    }
    public String getCatbrand() {
        return catbrand;
    }
    public void setCatbrand(String catbrand) {
        this.catbrand = catbrand;
    }
    public int getMaxspeed() {
        return maxspeed;
    }
    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

}
