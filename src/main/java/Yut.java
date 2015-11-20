import java.util.*;

/**
 * Basic Yut 11.13
 */
public class Yut {

    private String[] yut = {"DOE", "GAE", "GIRL", "YUT", "MOE"};
    private final int raceRoom = 10;
    private final int numOfDevice = 1;
    private ArrayList<Device> device;

// player �� computer ��� ǥ���ؾ� �Ǵ���


    // Initialize Yut Matrix
    public Yut() {
        device = new ArrayList<Device>(numOfDevice * 2);

        // type�� type�� ���� index(��� ������)�� ���� device��ü�� ����
        int userIndex = 0;
        int comIndex = 0;
        for (int i = 0 ; i < device.size(); i++) {
            if (i <= device.size()/2)
                device.add(new Device("U", userIndex++));
            else
                device.add(new Device("C", comIndex++));
        }
    }

    // Game start
    public void start() {
        clean();
        System.out.println("Play Game of Yut !!");



        int num;
        Scanner in = new Scanner(System.in);
        num=in.nextInt();
/*
        while(num != 0){

            user.input(throwYut());

            showBoard(user, com);

            num=in.nextInt();

            com.input(throwYut());

            showBoard(user, com);

            num = in.nextInt();
        }
*/
//        show();
//
//        // Player or Compute Two Hores Goal in is Game Over
//        while (yutMatrix[9].equals("o ") || yutMatrix[9].equals("x "))
//        {
//            // Player Phase
//            int move = throwYut();
//            // �÷��̾�� ������ �����ϰ� �׿� ���� ������
//
//            // ������ ����� ������ �����̴� ��
//
//
//            show();
//
//            // Computer Phase
//            move = throwYut();
//            // ��ǻ�ʹ� ��Ȳ�� �°� ���������� ��Ȳ�� SudoCode ����
//
//            show();
//        }


    }

    private void showBoard(Device user, Device com) {

        for(int i = 1; i < 20; i++){
            if(i==user.getIndex() && i==com.getIndex()) System.out.println("x ");
            else if(i==user.getIndex()) System.out.print("u ");
            else if(i==com.getIndex()) System.out.print("c ");
            else System.out.print("_ ");
        }System.out.println();
        //�� ���� ��� �ڵ� ������ Yut Ŭ���� �ȿ��� �ϴ°� ���ڽ��ϴ�.
    }

    // Throw yut
    public int throwYut() {
        Random r = new Random();
        System.out.println("Throws Yut!");
        int result = r.nextInt(5);
        System.out.println("Resulit is " + yut[result]); // �׳� ����غ����� ����� ���� ������� ��Ʈ������ �������ߵǹǷ� int�� ����
        return result;
    }

    // Move hores
    public void moveHorse() {
        // �÷��̾��� ��� ����� ���ϴ� ���� ������

        // ��ǻ�Ϳ� ��� ��Ȳ�� �°� ������

        // ��Ȳ 3: ���� �Ѵ� ������ ���� ������ �տ� �ִ� ���� ������

        // ��Ȳ 2: ���� �ϳ� ������ ���� ������

        // ��Ȳ 1: ���� ����͵� �ϳ� ������ ������ ������

    }



    // Clean Console �ϴ� �̷������� ���°Ŷ� �̷��� �غ� �ݺ� Ƚ���� ��º��� ����
    public void clean() {
        for (int i=0; i<30; i++)
            System.out.println();
    }
}
