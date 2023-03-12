public enum Money{
    ONE(1), TWO(2), FIVE(5), TEN(10), TWENTY(20), FIFTY(50);
    private int value;


    Money(int i) {
        value=i;
    }

    public int getValue() {return value;}
}
