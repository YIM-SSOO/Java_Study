package Ex;

public class Korea5 {

    public static void main(String[] args) {
        Car c = new Car();
           
        
        c.setCarname("�ƹ涼");
        c.setCatbrand("����");
        c.setMaxspeed(220);

        Car c2 = new Car("���׽ý�", "����", 230);
        
        System.out.println("���� ���� " + c.getCarname() + "\n�� ���� �귣���" + c.getCatbrand() + "\n�ְ� �ӷ��� " + c.getMaxspeed() + " �Դϴ�");
        System.out.println("========================");
        System.out.println("���� ���� " + c2.getCarname() + "\n�� ���� �귣���" + c2.getCatbrand() + "\n�ְ� �ӷ��� " + c2.getMaxspeed() + " �Դϴ�");

    }

}
