import java.util.Random;

/**
 * Basic Yut 11.13
 */
public class Yut {
    private String[] yutMatrix;
    private String[] yut = {"DOE", "GAE", "GIRL", "YUT", "MOE"};
    private String[] typeOfPlayer = {"o", "x"};
    final int playerNum = 2;
    final int raceRoom = 10;
// player �� computer ��� ǥ���ؾ� �Ǵ���


    // Initialize Yut Matrix
    public Yut() {
        yutMatrix = new String[raceRoom]; // Basic 2 Line 10 room Yut race
        yutMatrix[0][0] = 1; yutMatrix[0][1] = 1;   // �̷������� ǥ���ؾߵǴµ� �ϴ� ���
    }

    // Show Yut Matrix
    public void show() {
        for(int i=0; i<playerNum; i++) {
            for(int j=0; j<raceRoom; j++) {
                System.out.print(yutMatrix[i][j]);
//                if(yutMatrix[i][j] == 1) // ǥ�� ��� �ٲٷ��� �̷��Ե� �����ѵ� � �� ������ ���
//                    System.out.print("X");
//                else if(yutMatrix[i][j] == 0)
//                    System.out.print("O");
            }
            System.out.println();
        }
    }

    // Game start
    public void start() {
        clean();
        System.out.println("Play Game of Yut !!");
        show();

        // Player or Compute Two Hores Goal in is Game Over
        while (yutMatrix[0][10] == 2 || yutMatrix[1][10] == 2)
        {
            // Player Phase
            int move = throwYut();
            // �÷��̾�� ������ �����ϰ� �׿� ���� ������

            // ������ ����� ������ �����̴� ��


            show();

            // Computer Phase
            move = throwYut();
            // ��ǻ�ʹ� ��Ȳ�� �°� ���������� ��Ȳ�� SudoCode ����

            show();
        }


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
    public void moveHorse() {}



    // Clean Console �ϴ� �̷������� ���°Ŷ� �̷��� �غ� �ݺ� Ƚ���� ��º��� ����
    public void clean() {
        for (int i=0; i<30; i++)
            System.out.println();
    }

}
