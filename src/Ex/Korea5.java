package Ex;

public class Korea5 {

    public static void main(String[] args) {
        Car c = new Car();
           
        
        c.setCarname("아방떼");
        c.setCatbrand("현대");
        c.setMaxspeed(220);

        Car c2 = new Car("제네시스", "현대", 230);
        
        System.out.println("차의 모델은 " + c.getCarname() + "\n이 차의 브랜드는" + c.getCatbrand() + "\n최고 속력은 " + c.getMaxspeed() + " 입니다");
        System.out.println("========================");
        System.out.println("차의 모델은 " + c2.getCarname() + "\n이 차의 브랜드는" + c2.getCatbrand() + "\n최고 속력은 " + c2.getMaxspeed() + " 입니다");

    }

}
