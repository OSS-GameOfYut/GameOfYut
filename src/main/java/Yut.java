import java.util.*;

/**
 * Game of Yut 1.0 ����
 * (Basic Yut)
 * default ����
 * ���������� ���������� �Ǿ��ִ�.
 * ������ ���� �Ѹ��� �� ������ ������ ���� �ǿ� ���� �Ѿ�� ������ ����ȴ�.
 * �� �� �� �� �� ������ 1,2,3,4,5 ��ŭ �����̸� ���� ��� �ѹ� �� ������ �ʴ´�.
 * ���� ���� �� �÷��̾�� �Է°��� �޾� ������ ��ǻ�ʹ� �ڵ����� ������.
 * ���������� ����� ���� ��ġ x, u, c�� ����Ѵ�.
 */

public class Yut {
    private Device user, com;
    private boolean done;
    private Scanner in;

    private String[] yut = {"DOE", "GAE", "GIRL", "YUT", "MOE"};
    private final int playerNum = 2;
    private final int raceRoom = 20;

    // Initialize Yut Matrix
    public Yut() {
        done = false;
        in = new Scanner(System.in);

        user = new Device();
        com = new Device();
    }

    // Show Yut Matrix
    public void showBoard(Device user, Device com) {
        for(int i=1; i<raceRoom; i++){
            // ������ ��ǻ�� ���� ��ġ�϶� ǥ��
            if(i==user.getLocate() && i==com.getLocate()) System.out.println("x");
            // ������ ��ġ ǥ��
            else if(i==user.getLocate()) System.out.print("u");
            // ��ǻ���� ��ġ ǥ��
            else if(i==com.getLocate()) System.out.print("c");
            // �ƹ��� ������ ��ġ ǥ��
            else System.out.print("_");
        }   System.out.println();
        //�� ���� ��� �ڵ� ������ Yut Ŭ���� �ȿ��� �ϴ°� ���ڽ��ϴ�.
    }
    // Game play
    public void play() {
        clean();
        System.out.println("Play Game of Yut !!");

        // ��ǻ�ͳ� ������ yutMatrix�� ������ ������ �����ϸ� �ݺ��� ����
        while(!done)
        {
            // Player Phase
            // �� �����°� �÷��̾�� �Է¹޾� ����
            // 1�� �Է� �޾Ƽ� �� �����°ɷ� default
            int num;
            num=in.nextInt();

            user.input(throwYut());
            showBoard(user, com);

            // Computer Phase
            // ��ǻ�ʹ� �ڵ����� ����

            com.input(throwYut());
            showBoard(user, com);

            // ���� üũ
            done = checkWin(user, com);

        }

    }

    // Throw yut
    // �� ������ ���� ��� ��� �� ��ȯ
    public int throwYut() {
        Random r = new Random();
        System.out.println("Throws Yut!");
        int result = r.nextInt(5);
        System.out.println("Resulit is " + yut[result]);
        return result;
    }

    // Move hores ���� ���������� �� �����̴� method
    // ����� �Է°��޾Ƽ� ������ com�� ��Ȳ�� �°� ������
    public void moveComputer() {

        // ��ǻ�Ϳ� ��� ��Ȳ�� �°� ������

        // ���� �ϳ��� ��
            // ��Ȳ 3: ���� �Ѵ� ������ ���� ������ �տ� �ִ� ���� ������

            // ��Ȳ 2: ���� �ϳ� ������ ���� ������

            // ��Ȳ 1: ���� ����͵� �ϳ� ������ ������ ������
    }

    // ������ ��ǻ�Ͱ� ���� ������ �����ϴ��� üũ
    public boolean checkWin(Device user, Device com) {
        // ������ ���������� �Ѿ� ���� ��
        if(user.getLocate() >= raceRoom) {
            System.out.println("\n\n\nPlayer Win!\n\n\n");

            // ������ ������ ��ġ �ʱ�ȭ�Ͽ� �ٽ� ���� ���� ���� �� �� �ֵ���
            user.setLocate(0);
            com.setLocate(0);

            return true;
        }
        // ��ǻ�Ͱ� ���������� �Ѿ� ���� ��
        if(com.getLocate() >= raceRoom) {
            System.out.println("\n\n\nPlayer Lose!\n\n\n");

            // ������ ������ ��ġ �ʱ�ȭ�Ͽ� �ٽ� ���� ���� ���� �� �� �ֵ���
            user.setLocate(0);
            com.setLocate(0);

            return true;
        }
        // �׷��� ���� ��
        return false;
    }


    // Clean Console �ܼ� â�϶� ȭ�� ����� method
    public void clean() {
        for (int i=0; i<30; i++)
            System.out.println();
    }
}
