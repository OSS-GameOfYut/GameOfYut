//����̽� Ŭ�������� ������ �޼ҵ�
// -��ġ ���, ��ġ ����

public class Device {

    private String type;        // ������( ex)player or com ) device ���� �����ϱ����� Ÿ��
    private int locate = 0;     // �ʱⰪ�� ������ 0
    private int numberOfType;   // ���� ��ȣ

    public Device(){
        type = "X";
        numberOfType = 0;
    }

    //
    public Device(String inputType, int num){
        type = inputType;
        numberOfType = num;
    }

    public void move(int result) {
        System.out.println("moved like " + result);
    }

    // Type�� �ٲپ��� ( ex)��������� �ٽ� ���������� ��� )
    public void setType(String inputType) { type = inputType; }

    public int getIndex() {
        return locate;
    }

    public String getType() {
        return type;
    }


    public void input(int yut){
        yut++;
        locate += yut;
        move(yut);
    }

}
