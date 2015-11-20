//디바이스 클래스에서 구현할 메소드
// -위치 출력, 위치 변경

public class Device {

    private String type;        // 누구의( ex)player or com ) device 인지 구분하기위한 타잎
    private int locate = 0;     // 초기값은 무조건 0
    private int numberOfType;   // 말의 번호

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

    // Type을 바꾸어줌 ( ex)겹쳤을경우 다시 빠져나왔을 경우 )
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
