import java.util.*;

/**
 * Basic Yut 11.13
 */
public class Yut {
    private String[] yutMatrix;
    private String[] yut = {"DOE", "GAE", "GIRL", "YUT", "MOE"};
    private String typeOfPlayer = "o ";
    private final int playerNum = 2;
    private final int raceRoom = 10;
    private String[] board = new String[17];
    Device user =new Device();
    Device com = new Device();
// player �� computer ��� ǥ���ؾ� �Ǵ���


    // Initialize Yut Matrix
    public Yut() {
        yutMatrix = new String[raceRoom]; // Basic 2 Line 10 room Yut race
        for (int i = 0 ; i < yutMatrix.length ; i++)
            yutMatrix[i] = "__";

        yutMatrix[0] = "ox";   // �̷������� ǥ���ؾߵǴµ� �ϴ� ���
    }

    // Game start
    public void start() {
        clean();
        System.out.println("Play Game of Yut !!");


        int turn=0, userPreIndex=0, comPreIndex=0;
        Scanner in = new Scanner(System.in);
        for(int i=1; i<=16; i++) board[i]="_";



        //���� ������ ���� 0 �̻��� ���ڸ� �����ϰ� ��������!
        System.out.println("pick num>0 and put to throw Yut for you!");
        while(in.nextInt()!=0){ //���� ���� 0�� �ƴ� �� ��� ����
            if(turn%2==0) { //num�� ¦���� ����� ��
                user.input(throwYut());

                if(user.getIndex()>16){
                    System.out.println("user win!\n");
                    break;
                }

                if(turn!=0) board[userPreIndex]="_";
                userPreIndex=user.getIndex();

                showBoard(turn);
                //board[user.getIndex()]="u";
                System.out.println("pick num>0 and put to throw Yut for enermy!");
            }
            else if(turn%2==1){ //num�� Ȧ���� ��ǻ�� ��
                com.input(throwYut());

                if(user.getIndex()>16){
                    System.out.println("com win!\n");
                    break;
                }
                if(turn!=1) board[comPreIndex]="_";
                comPreIndex=com.getIndex();

                showBoard(turn);
                //board[com.getIndex()]="c";
                System.out.println("pick num>0 and put to throw Yut for you!");
            }
//            for(int i=1; i<17; i++) System.out.print(board[i]);
//            System.out.println();
            turn++;
        }
    }

    private void showBoard(int who) {

        if(user.getIndex()!=com.getIndex()){
            board[user.getIndex()]="u";
            board[com.getIndex()]="c";
        }
        else{//���� ���
            //catchYou(who);
        }

//        for(int i=1; i<17; i++) System.out.print(board[i]);
//            System.out.println();

            for(int i=0; i<3 ; i++){
                if(i==0){
                    reversePrint(9);
                    System.out.println();
                }
                else if(i==1){
                    int n=10;
                    for(int j=0; j!=6; j+=2) {
                        System.out.println(board[n] + " \t" + board[n - 6-j]);
                        n++;
                    }
                }
                else{
                    for(int j=13; j<17; j++) System.out.print(board[j]);
                    System.out.println(board[1]);
                }
        }

        //�� ���� ��� �ڵ� ������ Yut Ŭ���� �ȿ��� �ϴ°� ���ڽ��ϴ�.
    }

    //���� ��� �޼ҵ��̹Ƿ� �ǵ�� �ȵ˴ϴ�.
    private void reversePrint(int n){
        if(n<=4) return;
        System.out.print(board[n]);
        reversePrint(n-1);
    }

    // Throw yut ���� ������ �޼ҵ�.
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

    public void catchWho(int who){

    }

    // Clean Console �ϴ� �̷������� ���°Ŷ� �̷��� �غ� �ݺ� Ƚ���� ��º��� ����
    public void clean() {
        for (int i=0; i<30; i++)
            System.out.println();
    }

}
