import java.util.Random;

/**
 * Basic Yut 11.13
 */
public class Yut {

    private String[] yutMatrix;
    private String[] yut = {"DOE", "GAE", "GIRL", "YUT", "MOE"};
    private final int raceRoom = 10;
    private Device[] devices;
    final int NUM_DEVICE = 2;
// player �� computer ��� ǥ���ؾ� �Ǵ���


    // Initialize Yut Matrix
    public Yut() {
        yutMatrix = new String[raceRoom]; // Basic 2 Line 10 room Yut race
        for (int i = 0 ; i < yutMatrix.length ; i++)
            yutMatrix[i] = "__";

        for(int i = 0 ; i < NUM_DEVICE ; i++)
            devices[i]  = new Device();

    }

    // Show Yut Matrix
    public void show() {
        for(int i=0 ; i < yutMatrix.length ; i++)
            System.out.print(yutMatrix[i] + " ");
//                if(yutMatrix[i][j] == 1) // ǥ�� ��� �ٲٷ��� �̷��Ե� �����ѵ� � �� ������ ���
//                    System.out.print("X");
//                else if(yutMatrix[i][j] == 0)
//                    System.out.print("O");
        System.out.println();

    }

    // Game start
    public void start() {
        //clean();


        System.out.println("Play Game of Yut !!");
        show();

        // Player or Compute Two Hores Goal in is Game Over
        while (!(yutMatrix[yutMatrix.length - 1].equals("__")))
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