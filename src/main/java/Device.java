
//����̽� Ŭ�������� ������ �޼ҵ�
// -��ġ ���, ��ġ ����

public class Device {

    private int locate; // ���� ��ġ
    private String type; // ���� ����

    public Device(){
        locate = 0;
        type = "__";
    }

    void showMove(int result) {
        System.out.println("moved like "+result);
    }

    public void setLocate(int num) {locate = num;}

    public int getLocate() {
        return locate;
    }

    public String getType() {
        return type;
    }


    void input(int yut){
        yut++;  // yut 0~4 �� ���̹Ƿ� + 1
        locate+=yut;
        showMove(yut);
    }

}
